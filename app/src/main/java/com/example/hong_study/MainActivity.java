package com.example.hong_study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_test;
    EditText et_test;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_test=(EditText)findViewById(R.id.et_test);

        btn_test = (Button)findViewById(R.id.btn_test);

        btn_test.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //btn_test.setText("홍드로이드");
                et_test.setText("홍드로이드");
            }
                                    }

        );
    }
}
