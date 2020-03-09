package com.knoldus;

import twitter4j.Query;
import twitter4j.Status;
import twitter4j.TwitterException;

import java.util.ArrayList;
import java.util.List;

public class TwitterImpStatus implements TwitterStatus {

    TwitterInstance twitterInstance;

    public TwitterImpStatus(TwitterInstance twitterInstance) {
        this.twitterInstance = twitterInstance;
    }

    @Override
    public List<Status> getTwitterStatus(String hashTag) {
        Query query = new Query(hashTag);
        List<Status> list = new ArrayList<>();
        try {
            list = twitterInstance.getTwitterInstance().search(query).getTweets();
        } catch (TwitterException ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
