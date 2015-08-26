package com.textengine.twitterfeeds;

import org.springframework.data.annotation.Id;

public class TwitterFeeds {
	@Id
    private String id;

    private String text;
    private String feed;

    public TwitterFeeds() {}

    public TwitterFeeds(String text, String feed) {
        this.text = text;
        this.feed = feed;
    }

    @Override
    public String toString() {
        return String.format(
                "TwitterFeeds[id=%s, text='%s', feed='%s']",
                id, text, feed);
    }
}
