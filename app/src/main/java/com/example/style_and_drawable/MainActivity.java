package com.example.style_and_drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class MainActivity extends AppCompatActivity {
     public final static int min=0;
    public final static int max=4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState==null)
                setContentView(R.layout.activity_main);

        LevelListDrawable levelListDrawable=new LevelListDrawable();
        ImageView imageView=findViewById(R.id.wifiImage);

        ImageButton plus=findViewById(R.id.plus_image_button);
        ImageButton minus=findViewById(R.id.minus_image_button);
        ImageButton off=findViewById(R.id.off_image_button);


        MaterialButtonToggleGroup themeBtn=findViewById(R.id.btn_theme);
        themeBtn.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {

            }
        });





    }
}