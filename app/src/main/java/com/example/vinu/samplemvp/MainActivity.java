package com.example.vinu.samplemvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Components.DaggerUserComponent;
import Components.UserComponent;
import modals.Group;
import modules.GroupModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserComponent userComponent= DaggerUserComponent.create();
         Group group= userComponent.getGroup();
        System.out.println(group.getUser().getName()+"name");
    }
}
