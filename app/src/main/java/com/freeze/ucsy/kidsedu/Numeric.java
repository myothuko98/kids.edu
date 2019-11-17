package com.freeze.ucsy.kidsedu;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Locale;

public class Numeric extends AppCompatActivity implements View.OnClickListener {
    private ImageView numOne, numTwo, numThree, numFour, numFive, numSix, numSeven, numEight, numNine, numZero;
    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric);

        numZero = (ImageView) findViewById(R.id.number_zero);
        numOne = (ImageView) findViewById(R.id.number_one);
        numTwo = (ImageView) findViewById(R.id.number_two);
        numThree = (ImageView) findViewById(R.id.number_three);
        numFour = (ImageView) findViewById(R.id.number_four);
        numFive = (ImageView) findViewById(R.id.number_five);
        numSix = (ImageView) findViewById(R.id.number_six);
        numSeven = (ImageView) findViewById(R.id.number_seven);
        numEight = (ImageView) findViewById(R.id.number_eight);
        numNine = (ImageView) findViewById(R.id.number_nine);

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR) {
                    tts.setLanguage(Locale.UK);
                }
            }
        });

        numZero.setOnClickListener(this);
        numOne.setOnClickListener(this);
        numTwo.setOnClickListener(this);
        numThree.setOnClickListener(this);
        numFour.setOnClickListener(this);
        numFive.setOnClickListener(this);
        numSix.setOnClickListener(this);
        numSeven.setOnClickListener(this);
        numEight.setOnClickListener(this);
        numNine.setOnClickListener(this);
    }

    @Override
    protected void onPause() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onPause();
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.number_zero){
            tts.speak("0", TextToSpeech.QUEUE_FLUSH,null);
        }else if (view.getId() == R.id.number_one) {
            tts.speak("1", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.number_two) {
            tts.speak("2", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.number_three) {
            tts.speak("3", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.number_four) {
            tts.speak("4", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.number_five) {
            tts.speak("5", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.number_six) {
            tts.speak("6", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.number_seven) {
            tts.speak("7", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.number_eight) {
            tts.speak("8", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.number_nine) {
            tts.speak("9", TextToSpeech.QUEUE_FLUSH, null);
        }
    }
}