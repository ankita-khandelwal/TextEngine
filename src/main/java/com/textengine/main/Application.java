package com.textengine.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.textengine.dao.TwitterFeedsRepository;
import com.textengine.twitterfeeds.TwitterFeeds;

public class Application implements CommandLineRunner {

	@Autowired
	private TwitterFeedsRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of TwitterFeeds
		repository.save(new TwitterFeeds("Alice", "Smith"));
		repository.save(new TwitterFeeds("Bob", "Smith"));

		// fetch all customers
		System.out.println("TwitterFeeds found with findAll():");
		System.out.println("-------------------------------");
		for (TwitterFeeds twitterFeeds : repository.findAll()) {
			System.out.println(twitterFeeds);
		}
		System.out.println();

		// fetch an individual TwitterFeeds
		System.out.println("TwitterFeeds found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByText("Alice"));

		

	}
}
