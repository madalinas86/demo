package com.test.app.demo.github;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Issue {
    private String htmlUrl;
    private int number;
    private String title;

    @JsonCreator
    public Issue(@JsonProperty("htmlUrl") String htmlUrl,
                 @JsonProperty("number") int number,
                 @JsonProperty("title") String title) {
        this.htmlUrl = htmlUrl;
        this.number = number;
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getTitle() {
        return title;
    }
}
