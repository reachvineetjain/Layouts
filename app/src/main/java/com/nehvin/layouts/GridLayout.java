package com.nehvin.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GridLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
    }

    public void callNewScreen ( View view )
    {
        Intent intent = new Intent(this, VariousWidgets.class);
        startActivity(intent);
    }
}
