package com.tencent.agemark;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        GLSurfaceView surface = new GLSurfaceView(this);
        surface.setRenderer(new AgeRenderer());
        setContentView(surface);
    }
    static {    
        //load library     
        System.loadLibrary("AgeMark");    
   }    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }




}
