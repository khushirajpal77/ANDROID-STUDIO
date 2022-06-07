package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int currentPosition=0;
    int []pics = {R.drawable.img1,R.drawable.img2,R.drawable.img3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void prev(View v)
    {
        ImageView pic=(ImageView)findViewById(R.id.pic0);
        if(currentPosition==0)
        {
        pic.setImageResource(pics[pics.length-1]);
        currentPosition=pics.length-1;
        }
        else
        {
            pic.setImageResource(pics[currentPosition-1]);
            currentPosition=currentPosition-1;
        }
    }
    public void next(View v)
    {
        ImageView pic=(ImageView)findViewById(R.id.pic0);
        if(currentPosition==pics.length-1)
        {
            pic.setImageResource(pics[0]);
            currentPosition=0;
        }
        else
        {
            pic.setImageResource(pics[currentPosition+1]);
            currentPosition=currentPosition+1;
        }
    }
}
