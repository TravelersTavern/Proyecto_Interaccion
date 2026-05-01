
package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Vista1 extends AppCompatActivity implements View.OnClickListener {

    private TextView tUnits;
    private Button bRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista1);

        tUnits = findViewById(R.id.textUnitsFeed);
        bRefresh = findViewById(R.id.buttonRefreshUnits);
        bRefresh.setOnClickListener(this);

        renderFeed();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.buttonRefreshUnits) {
            renderFeed();
        }
    }

    private void renderFeed() {
        double randomOccupancyA = 45 + Math.random() * 35;
        double randomOccupancyB = 20 + Math.random() * 60;
        String feed = getString(
                R.string.units_feed_template,
                String.format(Locale.US, "%.1f", randomOccupancyA),
                String.format(Locale.US, "%.1f", randomOccupancyB)
        );
        tUnits.setText(feed);
    }

}
