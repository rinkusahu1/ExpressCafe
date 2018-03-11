package com.example.user.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button btnactivity1;
    Button btnactivity2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnactivity1=(Button)findViewById(R.id.sign_up);
        btnactivity2=(Button)findViewById(R.id.log_in);
    }
    public void btnClickAct1(View v){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void btnClickAct2(View v){
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }


}
