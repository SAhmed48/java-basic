package com.loose.coupling;

public class LooseCoupling {

    public static void main(String[] args) {
        UserDataProvider dbProvider = new UserDatabaseProvider();
        UserManager userMgr = new UserManager(dbProvider);
        System.out.println("User Info Loose Coupling " + userMgr.getUserInfo());
    }
}
