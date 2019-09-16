package com.example.myapplication.Model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements IUser {
    private String email,password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValidData() {
        //1.Check email is empty
        //2.check email is matchets pattern
        //3. check password length>6
        return !TextUtils.isEmpty(getEmail())&&

                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()&&
                getPassword().length()>6;
    }
}
