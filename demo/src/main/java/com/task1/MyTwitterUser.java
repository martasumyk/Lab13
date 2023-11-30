package com.task1;

import java.time.LocalDate;

public class MyTwitterUser implements User{

    private TwitterUser tritterUser;

    public MyTwitterUser(TwitterUser tritterUser){
        this.tritterUser = tritterUser;
    }

    @Override
    public String getEmail() {
        return tritterUser.getUserMail();
    }

    @Override
    public String getCounty() {
        return tritterUser.getCountry();

    }

    @Override
    public LocalDate getLastActiveDate() {
        return tritterUser.getLastActiveTime();
    }
    
}
