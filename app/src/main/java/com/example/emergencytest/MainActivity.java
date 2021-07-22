package com.example.emergencytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnCommit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnCommit = findViewById(R.id.btn_commit);
        setListeners();

    }

    private void setListeners() {
        OnClick onClick=new OnClick();
        mBtnCommit.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_commit:
                    intent=new Intent(MainActivity.this, FullscreenActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
