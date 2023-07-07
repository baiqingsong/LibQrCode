package com.dawn.libqrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.dawn.qr_code.LQrCodeUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((ImageView)findViewById(R.id.iv_logo)).setImageBitmap(LQrCodeUtil.createQRCodeBitmap("https://www.baidu.com", 400, 400));
    }
}