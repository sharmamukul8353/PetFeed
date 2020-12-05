package com.recipes.petfeed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Recipe extends AppCompatActivity {

    TextView foodDescription;
    ImageView foodImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        foodDescription = findViewById(R.id.txtDescription);
        foodImage = findViewById(R.id.ivImage2);

        Bundle mbundle = getIntent().getExtras();

        if(mbundle!=null){
            foodDescription.setText(mbundle.getString("Description"));
            Glide.with(this)
                    .load(mbundle.getString("Image"))
                    .into(foodImage);
        }

    }
}
