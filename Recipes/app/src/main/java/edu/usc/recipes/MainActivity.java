package edu.usc.recipes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.amazonaws.mobile.client.AWSMobileClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AWSMobileClient.getInstance().initialize(this).execute();
    }

    public void onClick_SignIn(View view){

        //need to connect to DB see if it exits and sign in
        //otherwise need to form an account for that person

        Intent myIntent = new Intent(this,SearchView.class);
        startActivity(myIntent);
    }
    public void onClick_Guest(View view){

        //need to connect to DB see if it exits and sign in
        //otherwise need to form an account for that person

        Intent myIntent = new Intent(this,SearchView.class);
        startActivity(myIntent);
    }
}
