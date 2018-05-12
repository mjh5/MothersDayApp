package com.example.micha.happymothersday;

import android.media.MediaPlayer;
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
     *
     * mp3 sounds file from
     * http://www.soundboard.com/sb/sound/244309
     */
    public void OnClick(View v) {

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.happymothersday);

        buttonToggle++;
        switch (buttonToggle % 5) {
            case 0:
                imageView.setImageResource(R.drawable.mothersday1);
                mp.start();
                break;
            case 1:
                imageView.setImageResource(R.drawable.mothersday2);
                break;
            case 2:
                imageView.setImageResource(R.drawable.mothersday3);
                break;
            case 3:
                imageView.setImageResource(R.drawable.mothersday4);
                break;
            case 4:
                imageView.setImageResource(R.drawable.mothersday5);
                break;
        }
    }
}
