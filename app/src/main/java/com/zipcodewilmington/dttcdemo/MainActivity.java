package com.zipcodewilmington.dttcdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView resultTextView;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.inputName);
        resultTextView = (TextView) findViewById(R.id.textResult);

        button = (Button) findViewById(R.id.buttonSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               resultTextView.setText(name.getText());
            }
        });

    }
}
