package com.test.app.demo.github;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Actor {
    private String login;
    private String avatarUrl;
    private String htmlUrl;

    @JsonCreator
    public Actor(@JsonProperty("login") String login,
                 @JsonProperty("avatar_url") String avatarUrl,
                 @JsonProperty("html_url") String htmlUrl) {
        this.login = login;
        this.avatarUrl = avatarUrl;
        this.htmlUrl = htmlUrl;
    }


    public String getLogin() {
        return login;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }
}
