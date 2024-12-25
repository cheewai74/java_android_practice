package com.example.exploringmethodoverloading;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        int anInt = 10;
        int answer = 0;
        String aString = "I am a string";

        printStuff(anInt);
        printStuff(aString);
        printStuff(anInt, aString);

        computeSum(10); // Recursion
    }

    void printStuff(int myInt){
        Log.d("info", "This is the int only version");
        Log.d("info", "myInt = " + myInt);
    }

    void printStuff(String myString){
        Log.i("info", "This is the string only version");
        Log.i("info", "myString = " + myString);
    }

    void printStuff(int myInt, String myString){
        Log.i("info", "This is the combined int and String only version");
        Log.i("info", "myInt = " + myInt);
        Log.i("info", "myString = " + myString);
    }

    int answer = 0;
    void computeSum(int target){
        answer += target;
        if(target > 0){
            Log.d("target = ","" + target);
            computeSum(target - 1);
        }
        Log.d("answer =", "" +answer);
    }
}