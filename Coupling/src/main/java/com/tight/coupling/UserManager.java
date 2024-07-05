package com.tight.coupling;

public class UserManager {

    UserDatabaseProvider userDb = new UserDatabaseProvider();

    public String getUserInfo() {
        return userDb.getUserDetails();
    }
}
