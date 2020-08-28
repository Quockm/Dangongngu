package com.example.dangonngu13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mEdtAccount,mEditPass;
    TextView mtxtInfo;
    Button mBtnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtAccount = findViewById(R.id.editTextAccount);
        mEditPass = findViewById(R.id.editTextPassWord);
        mBtnLogin = findViewById(R.id.buttonLogin);
        mtxtInfo = findViewById(R.id.textViewInFo);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAccount = mEdtAccount.getText().toString();
                String textPass = mEditPass.getText().toString();

                String titeAccount = getResources().getString(R.string.TAIKHOAN);
                String titePassword = getResources().getString(R.string.MATKHAU);

                mtxtInfo.setText(String.format("%s : %s\n%s : %s",
                        titeAccount,textAccount,titePassword,textPass));
            }
        });
    }

}