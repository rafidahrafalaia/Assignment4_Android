package com.example.counter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int mCounter = 0;

    public static final String textFinal = "textFinal";
    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;
    Button btn;
    Button next;

    EditText edittext;
//    public static String text;
    TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById (R.id.button);
        next = (Button) findViewById (R.id.next);
        txv = (TextView) findViewById (R.id.tx);
        edittext=findViewById(R.id.edittext);
//        sharedpreferences = getSharedPreferences(String.valueOf(mCounter), Context.MODE_PRIVATE);
//        editor = sharedpreferences.edit();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter++;
                edittext.setText(Integer.toString(mCounter));
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nextActivity=new Intent(MainActivity.this, MainActivity2.class);
                nextActivity.putExtra("nilaiEditText","seratus");
                startActivity(nextActivity);

            }
        });
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        if (savedInstanceState != null){
            Log.d("nilai", savedInstanceState.getString("nilai"));
            mCounter= Integer.parseInt("nilai");
            edittext.setText(Integer.toString(mCounter));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("nilai", String.valueOf(mCounter));
        outState.putString("nilai", String.valueOf(mCounter));
//        txv.setText(Integer.toString(mCounter));
//        editor.putString(textFinal, String.valueOf(mCounter));
//        editor.commit();
//        text = sharedpreferences.getString(textFinal, "");
//        mCounter= Integer.parseInt("nilai");
//        txv.setText(Integer.toString(mCounter));
    }
}