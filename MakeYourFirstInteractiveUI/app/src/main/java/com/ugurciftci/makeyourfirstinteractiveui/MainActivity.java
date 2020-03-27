package com.ugurciftci.makeyourfirstinteractiveui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int mCount = 0;
    TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.textView);
    }
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
    public void zeroCount(View view){
        mCount=0;
        mShowCount.setText(Integer.toString(mCount));
    }
    public void showToast(View view){
        Toast.makeText(MainActivity.this,"Toast Message",Toast.LENGTH_LONG).show();
    }


}
