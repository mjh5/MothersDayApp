package com.example.micha.happymothersday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * MainActivity for HappyMothersDay app.
 */
public class MainActivity extends AppCompatActivity {

    int buttonToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonToggle = 0;
    }

    /*
     * Code for ImageView and changing the resource derived from
     * https://stackoverflow.com/questions/7024881/replace-one-image-with-another-after-clicking-a-button?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
     */
    public void OnClick(View v) {

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);

        buttonToggle++;
        switch (buttonToggle % 5) {
            case 0:
                imageView.setImageResource(R.drawable.MothersDay1);
                break;
            case 1:
                imageView.setImageResource(R.drawable.MothersDay2);
                break;
            case 2:
                imageView.setImageResource(R.drawable.MothersDay3);
                break;
            case 3:
                imageView.setImageResource(R.drawable.MothersDay4);
                break;
            case 4:
                imageView.setImageResource(R.drawable.MothersDay5);
                break;
        }
    }
}
