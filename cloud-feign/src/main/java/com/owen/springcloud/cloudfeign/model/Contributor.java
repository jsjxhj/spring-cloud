package com.owen.springcloud.cloudfeign.model;

/**
 * Created by owen on 2016/10/25.
 */
public class Contributor {
    private String login;
    private int contributions;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getContributions() {
        return contributions;
    }

    public void setContributions(int contributions) {
        this.contributions = contributions;
    }
}
