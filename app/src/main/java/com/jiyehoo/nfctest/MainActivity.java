package com.jiyehoo.nfctest;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick();
    }

    private void btnClick() {
        findViewById(R.id.btn_write).setOnClickListener(v ->
                startActivity(new Intent(this, WriteActivity.class)));

        findViewById(R.id.btn_text_write).setOnClickListener(v ->
                startActivity(new Intent(this, WriteTextActivity.class)));

        findViewById(R.id.btn_text_read).setOnClickListener(v ->
                startActivity(new Intent(this, ReadTextActivity.class)));
    }

}