package com.dawn.libqrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.dawn.qr_code.LQrCodeUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bitmap = LQrCodeUtil.createQRCodeBitmap("https://www.baidu.com", 400, 400);
        ImageView ivLogo = findViewById(R.id.iv_logo);
        ivLogo.setImageBitmap(bitmap);
        ivLogo.setOnClickListener(view -> {
            String result = LQrCodeUtil.analysisQrCode(bitmap);
            Log.e("dawn", "result :" + result);
        });

    }
}