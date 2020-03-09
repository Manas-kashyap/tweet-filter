package com.knoldus;

import twitter4j.Status;

import java.time.LocalDate;
import java.util.List;

public interface FilterTweet {
    List<Status> getLatestTweets(String hashTag, long limit);

    List<Status> getOlderTweets(String hashTag, long limit);

    List<Status> getTweetsWithHighReTweets(String hashTag);

    List<Status> getTweetsWithHighLikes(String hashTag);

    List<Status> getTweetsOnDate(String hashTag, LocalDate localDate);

    long getLikesOnHashTagByInterval(String hashTag, long minutes);
}
