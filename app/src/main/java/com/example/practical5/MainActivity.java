package com.example.practical5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout ll_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll_main = findViewById(R.id.ll_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.red:
                ll_main.setBackgroundColor(getResources().getColor(R.color.red));
                return true;
            case R.id.blue:
                ll_main.setBackgroundColor(getResources().getColor(R.color.blue));
                return true;
            case R.id.green:
                ll_main.setBackgroundColor(getResources().getColor(R.color.green));
                return true;
            case R.id.white:
                ll_main.setBackgroundColor(getResources().getColor(R.color.white));
                return true;
            case R.id.black:
                ll_main.setBackgroundColor(getResources().getColor(R.color.black));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}