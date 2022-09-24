package com.example.shimmerproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {
    CardView post ;
    ShimmerFrameLayout shimmerFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        post = (CardView) findViewById(R.id.post);
        shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.facebookShimmerLayout);
        shimmerFrameLayout.startShimmer();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                shimmerFrameLayout.stopShimmer();
                shimmerFrameLayout.setVisibility(View.GONE);
                post.setVisibility(View.VISIBLE);
            }
        }, 3000);

    }
    }
