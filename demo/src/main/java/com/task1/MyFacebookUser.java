package com.task1;

import java.time.LocalDate;

public class MyFacebookUser implements User{

    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getUserMail();
    }

    @Override
    public String getCounty() {
        return facebookUser.getCountry();

    }

    @Override
    public LocalDate getLastActiveDate() {
        return facebookUser.getLastActiveTime();
    }
    
}
