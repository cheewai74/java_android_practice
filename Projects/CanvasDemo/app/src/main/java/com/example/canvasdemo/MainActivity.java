package com.example.canvasdemo;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView myImageView;
    Bitmap myBlankBitmap;
    Canvas myCanvas;
    Paint myPaint;

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

        int widthInPixels = 800;
        int heightInPixels = 600;

        myBlankBitmap =
                Bitmap.createBitmap(widthInPixels, heightInPixels,
                        Bitmap.Config.ARGB_8888);

        myCanvas = new Canvas(myBlankBitmap);

        myImageView = new ImageView(this);
        myPaint = new Paint();

        myCanvas.drawColor(Color.argb(255,0,0,255));
        myPaint.setTextSize(100);
        myPaint.setColor(Color.argb(255,255,255,255));
        myCanvas.drawText("Hello World!", 100, 100, myPaint);

        myPaint.setColor(Color.argb(255,212,207,62));
        myCanvas.drawCircle(400, 250,100, myPaint);

        myImageView.setImageBitmap(myBlankBitmap);
        // Tell Android to set our drawing
        // as the view for this app
        // via the ImageView
        setContentView(myImageView);


    }
}