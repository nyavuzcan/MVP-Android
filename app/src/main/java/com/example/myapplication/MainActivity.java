package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.Presenter.ILogingPresenter;
import com.example.myapplication.Presenter.LoginPresenter;
import com.example.myapplication.View.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView {
    EditText edt_email,edt_password;
    Button btnLogin;

    ILogingPresenter logingPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btn_login);
        edt_email=findViewById(R.id.edt_email);
        edt_password=findViewById(R.id.edt_password);


        logingPresenter=new LoginPresenter(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logingPresenter.onLogin(edt_email.getText().toString(),edt_password.getText().toString());
            }
        });
    }

    @Override
    public void onLoginResult(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
