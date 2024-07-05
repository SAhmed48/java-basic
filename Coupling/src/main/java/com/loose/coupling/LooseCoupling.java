package com.loose.coupling;

public class LooseCoupling {

    public static void main(String[] args) {
        UserDataProvider dbProvider = new UserDatabaseProvider();
        UserManager userMgr = new UserManager(dbProvider);
        System.out.println("User Info Loose Coupling " + userMgr.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceProvider();
        UserManager webServiceMgr = new UserManager(webServiceProvider);
        System.out.println("Web Service Info Loose Coupling " + webServiceMgr.getUserInfo());
    }
}
