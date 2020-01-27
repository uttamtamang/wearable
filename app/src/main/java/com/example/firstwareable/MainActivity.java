package com.example.firstwareable;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView tvOutput;
    private Button btnShow;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutput = (TextView) findViewById(R.id.tvOutput);
        btnShow = findViewById(R.id.btnShow);
        editText= findViewById(R.id.etFirst);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText(editText.getText().toString());
            }
        });

        // Enables Always-on
        setAmbientEnabled();
    }
}
