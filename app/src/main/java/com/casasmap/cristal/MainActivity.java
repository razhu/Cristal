package com.casasmap.cristal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CristalBall mCristalBall = new CristalBall();
    private TextView mTVAnswer;
    private Button mBAnswer;
    public final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTVAnswer = (TextView) findViewById(R.id.tv_answer);
        mBAnswer = (Button) findViewById(R.id.b_answer);

        mBAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTVAnswer.setText(mCristalBall.getAnswer());
                animateText();
            }
        });
        Log.d(TAG, "hijos de la putada mas grande.");
    }

    private void animateText() {
        AlphaAnimation fadeAnimation = new AlphaAnimation(0, 1);
        fadeAnimation.setDuration(1500);
        fadeAnimation.setFillAfter(true);
        mTVAnswer.setAnimation(fadeAnimation);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
