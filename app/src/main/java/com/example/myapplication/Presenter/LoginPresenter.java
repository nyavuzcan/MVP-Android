package com.example.myapplication.Presenter;

import com.example.myapplication.Model.User;
import com.example.myapplication.View.ILoginView;

public class LoginPresenter implements ILogingPresenter {

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {
        User user =new User(email,password);

        boolean isLoginSuccess=user.isValidData();

        if(isLoginSuccess){
            loginView.onLoginResult("Loging Sucess");
        }
        else {
            loginView.onLoginResult("Login Error");
        }


    }


}
