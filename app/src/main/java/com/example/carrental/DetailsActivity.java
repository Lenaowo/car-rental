package com.example.carrental;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {
    TextView name,price;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);
        Intent intent=getIntent();
        name=findViewById(R.id.textView6);
        image=findViewById(R.id.imageView3);
        price=findViewById(R.id.price);
        String countryName = intent.getStringExtra("countryName");
        String placeName = intent.getStringExtra("placeName");
        String pric = intent.getStringExtra("price"); // 0 is the default value if the key doesn't exist
        int placeImage = intent.getIntExtra("placeImageUrl",0);
        name.setText(countryName);
        price.setText(pric);
        Glide.with(this)
                .load(placeImage)
                .into(image);

    }
}