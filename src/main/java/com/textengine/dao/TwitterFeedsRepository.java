package com.textengine.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.textengine.twitterfeeds.TwitterFeeds;

public interface TwitterFeedsRepository extends MongoRepository<TwitterFeeds, String> {

    public TwitterFeeds findByText(String text);

}
