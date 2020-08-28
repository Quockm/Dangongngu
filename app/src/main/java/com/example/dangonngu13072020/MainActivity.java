package com.example.dangonngu13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText mEdtAccount, mEditPass;
    TextView mtxtInfo;
    Button mBtnLogin, mBtnEn, mBtnVi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLanguageLocal("vi");
        setContentView(R.layout.activity_main);

        mEdtAccount = findViewById(R.id.editTextAccount);
        mEditPass = findViewById(R.id.editTextPassWord);
        mBtnLogin = findViewById(R.id.buttonLogin);
        mtxtInfo = findViewById(R.id.textViewInFo);
        mBtnEn = findViewById(R.id.btnEn);
        mBtnVi = findViewById(R.id.btnVi);


        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAccount = mEdtAccount.getText().toString();
                String textPass = mEditPass.getText().toString();

                String titeAccount = getResources().getString(R.string.TAIKHOAN);
                String titePassword = getResources().getString(R.string.MATKHAU);

                mtxtInfo.setText(String.format("%s : %s\n%s : %s",
                        titeAccount, textAccount, titePassword, textPass));
            }
        });
    }

    private void setLanguageLocal(String Key) {
        Locale locale = new Locale(Key);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration(getResources().getConfiguration());
        configuration.setLocale(locale);
        getResources().updateConfiguration(configuration,getResources().getDisplayMetrics());
    }

}