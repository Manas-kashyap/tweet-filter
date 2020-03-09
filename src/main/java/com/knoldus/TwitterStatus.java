package com.knoldus;

import twitter4j.Status;

import java.util.List;

public interface TwitterStatus {
    List<Status> getTwitterStatus(String hashTag);
}
