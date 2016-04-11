package com.example.ActionBar;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {
    ActionBar actionBar;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        actionBar=getActionBar();
    }

    public void showActionBar(View source)
    {
        actionBar.show();
    }
    public void hideActionBar(View source)
    {
        actionBar.hide();
    }
}
