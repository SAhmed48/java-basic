package com.tight.coupling;

public class TightCoupling {

    public static void main(String[] args) {

        UserManager userMgr = new UserManager();

        System.out.println("User Info " + userMgr.getUserInfo());
    }
}
