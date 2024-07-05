package com.tight.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    /*
    * The class is used to access the database.
    * Holds the all information related to user table.
    * Suppose at present we are using mysql database.
    * later on we need to change db to MongoDB. Then we need to update this class which is not
    * correct and tightly coupled.
    * */

    public String getUserDetails() {
        // DB logic to retrieve user detail come here.
        return "User Details Coming From the Database";
    }
}
