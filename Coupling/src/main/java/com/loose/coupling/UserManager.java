package com.loose.coupling;

import com.loose.coupling.UserDataProvider;

public class UserManager {

    private UserDataProvider userDbProvider;

    public UserManager(UserDataProvider userDatabaseProvider) {
        this.userDbProvider = userDatabaseProvider;
    }

    public String getUserInfo() {
        return this.userDbProvider.getUserDetails();
    }
}
