package com.androidlime.jsondatausingretrofitlibrary;

/**
 * Created by Mithun on 10/4/2019.
 */

public class OurDataSet {

    String name;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OurDataSet() {
    }

    public OurDataSet(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
