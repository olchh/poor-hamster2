package com.example.clown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    final String LOG_TAG = "Logs";
    private Integer counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickHamsters(View view) {
        counter+=1;
        TextView counterView = (TextView)findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
        if (counter >= 10){
            TextView layout = findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams rectangle = layout.getLayoutParams();
            rectangle.height = 400;
            rectangle.width = 400;
            layout.setLayoutParams(rectangle);
        }
        if (counter >= 100){
            TextView layout = findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams rectangle = layout.getLayoutParams();
            rectangle.height = 500;
            rectangle.width = 500;
            layout.setLayoutParams(rectangle);

        }
        if (counter >= 1000){
            TextView layout = findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams rectangle = layout.getLayoutParams();
            rectangle.height = 600;
            rectangle.width = 600;
            layout.setLayoutParams(rectangle);

        }

    }
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("Count");
        Log.d(LOG_TAG, "onRestoreInstanceState");
    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Count", counter);
        Log.d(LOG_TAG, "onSaveInstateState");
    }

}





