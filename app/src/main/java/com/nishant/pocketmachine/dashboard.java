package com.nishant.pocketmachine;

 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;

 import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void gotocalc(View view) {
        Intent i=new Intent(dashboard.this,MainActivity.class);
        startActivity(i);
    }

}