
package com.example.materialdesigns;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.bumptech.glide.Glide;
import com.example.materialmeresource.R;


public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView sportsTitle = findViewById(R.id.titleDetail);
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);

        sportsTitle.setText(getIntent().getStringExtra("title"));

        Glide.with(this).load(getIntent().getIntExtra("image_resource",0)).into(sportsImage);
    }
}
