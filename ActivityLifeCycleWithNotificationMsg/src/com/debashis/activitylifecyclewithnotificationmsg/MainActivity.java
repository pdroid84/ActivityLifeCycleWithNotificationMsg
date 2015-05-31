package com.debashis.activitylifecyclewithnotificationmsg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends LifeCycle {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void startSubActivity (View v){
    	Intent intent = new Intent(this,SubActivity.class);
    	startActivity(intent);
    }
}
