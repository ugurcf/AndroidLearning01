package com.ugurcf.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.ugurcf.landmarkbook.MainActivity.selectedImage;

public class DetayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        ImageView imageView = findViewById(R.id.imageView);
        TextView landmarkNameText = findViewById(R.id.landmarkNameText);
        TextView countryNameText = findViewById(R.id.countryNameText);

        Intent intent = getIntent(); //intenti al
        String landmarkName = intent.getStringExtra("name"); //putIntent ile yolladığımız name değişkenini aldık
        String countryNames= intent.getStringExtra("country");
        countryNameText.setText(countryNames);
        landmarkNameText.setText(landmarkName); //değişkene atıp textView'e yazdırdık.

       imageView.setImageBitmap(selectedImage);


    }
}
