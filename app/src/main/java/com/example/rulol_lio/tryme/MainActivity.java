package com.example.rulol_lio.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        windowView = findViewById(R.id.windowViewId);
        tryMeButton = (Button)findViewById(R.id.tryMeButton);
        colors = new int[]{Color.CYAN, Color.BLACK, Color.BLUE, Color.DKGRAY, Color.GRAY, Color.GREEN, Color.MAGENTA, Color.RED, Color.YELLOW};

        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int randomNum = random.nextInt(colors.length);

                windowView.setBackgroundColor(colors[randomNum]);

                //Log.d("RANDOM", String.valueOf(randomNum));
            }
        });

    }
}
