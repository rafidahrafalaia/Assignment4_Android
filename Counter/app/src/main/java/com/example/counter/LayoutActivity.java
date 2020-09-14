package com.example.counter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LayoutActivity extends AppCompatActivity {
    public static int mCounter = 0;
    Button counter;
    Button toast;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        counter = (Button) findViewById (R.id.button5);
        toast = (Button) findViewById (R.id.button4);
        editText =findViewById (R.id.editText);
//        edittext=findViewById(R.id.edittext);
        counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter++;
                editText.setText(Integer.toString(mCounter));
            }
        });
    }

//    @Override
//    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
//        super.onRestoreInstanceState(savedInstanceState, persistentState);
//        if (savedInstanceState != null){
//            Log.d("nilai", savedInstanceState.getString("nilai"));
//            mCounter= Integer.parseInt("nilai");
//            editText.setText(Integer.toString(mCounter));
//        }
//    }
//
//    @Override
//    protected void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        Log.d("nilai", String.valueOf(mCounter));
//        outState.putString("nilai", String.valueOf(mCounter));
//    }
}