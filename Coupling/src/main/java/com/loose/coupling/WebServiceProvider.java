package com.loose.coupling;

import com.loose.coupling.UserDataProvider;

public class WebServiceProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Data coming from Web Service";
    }
}
