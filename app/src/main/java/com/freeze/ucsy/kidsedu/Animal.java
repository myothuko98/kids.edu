package com.freeze.ucsy.kidsedu;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class Animal extends AppCompatActivity implements View.OnClickListener {
    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView anteater, antelope, baliMynah, bat, bear, bee, beetle, binturong, bladEagle, boa, bonobo, bop, bowerBird, butterfly, caCondor, dolphin;
        TextView anteaterTxt, antelopeTxt, baliMynahTxt, batTxt, bearTxt, beeTxt, beetleTxt, binturongTxt, bladEagleTxt, boaTxt, bonoboTxt, bopTxt, bowerBirdTxt, butterflyTxt, caCondorTxt, dolphinTxt;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        anteater = (ImageView) findViewById(R.id.anteater);
        anteater.setOnClickListener(this);
        anteaterTxt = (TextView) findViewById(R.id.anteater_txt);
        anteaterTxt.setOnClickListener(this);

        antelope = (ImageView) findViewById(R.id.antelope);
        antelope.setOnClickListener(this);
        antelopeTxt = (TextView) findViewById(R.id.antelope_txt);
        antelopeTxt.setOnClickListener(this);

        baliMynah = (ImageView) findViewById(R.id.bali_myanh);
        baliMynah.setOnClickListener(this);
        baliMynahTxt = (TextView) findViewById(R.id.bali_myanh_txt);
        baliMynahTxt.setOnClickListener(this);

        bat = (ImageView) findViewById(R.id.bat);
        bat.setOnClickListener(this);
        batTxt = (TextView) findViewById(R.id.bat_txt);
        batTxt.setOnClickListener(this);

        bear = (ImageView) findViewById(R.id.bear);
        bear.setOnClickListener(this);
        bearTxt = (TextView) findViewById(R.id.bear_txt);
        bearTxt.setOnClickListener(this);

        bee = (ImageView) findViewById(R.id.bee);
        bee.setOnClickListener(this);
        beeTxt = (TextView) findViewById(R.id.bee_txt);
        beeTxt.setOnClickListener(this);

        beetle = (ImageView) findViewById(R.id.beetle);
        beetle.setOnClickListener(this);
        beetleTxt = (TextView) findViewById(R.id.beetle_txt);
        beetleTxt.setOnClickListener(this);

        binturong = (ImageView) findViewById(R.id.binturong);
        binturong.setOnClickListener(this);
        binturongTxt = (TextView) findViewById(R.id.binturong_txt);
        binturongTxt.setOnClickListener(this);

        bladEagle = (ImageView) findViewById(R.id.blad_eagle);
        bladEagle.setOnClickListener(this);
        bladEagleTxt = (TextView) findViewById(R.id.blad_eagler_txt);
        bladEagleTxt.setOnClickListener(this);

        boa = (ImageView) findViewById(R.id.boa);
        boa.setOnClickListener(this);
        boaTxt = (TextView) findViewById(R.id.boa_txt);
        boaTxt.setOnClickListener(this);

        bonobo = (ImageView) findViewById(R.id.bonobo);
        bonobo.setOnClickListener(this);
        bonoboTxt = (TextView) findViewById(R.id.bonobo_txt);
        bonoboTxt.setOnClickListener(this);

        bop = (ImageView) findViewById(R.id.bop);
        bop.setOnClickListener(this);
        bopTxt = (TextView) findViewById(R.id.bop_txt);
        bopTxt.setOnClickListener(this);

        bowerBird = (ImageView) findViewById(R.id.bowerbird);
        bowerBird.setOnClickListener(this);
        bowerBirdTxt = (TextView) findViewById(R.id.bowerbird_txt);
        bowerBirdTxt.setOnClickListener(this);

        butterfly = (ImageView) findViewById(R.id.butterfly);
        butterfly.setOnClickListener(this);
        butterflyTxt = (TextView) findViewById(R.id.butterfly_txt);
        butterflyTxt.setOnClickListener(this);

        caCondor = (ImageView) findViewById(R.id.ca_condor);
        caCondor.setOnClickListener(this);
        caCondorTxt = (TextView) findViewById(R.id.ca_condor_txt);
        caCondorTxt.setOnClickListener(this);

        dolphin = (ImageView) findViewById(R.id.dolphin);
        dolphin.setOnClickListener(this);
        dolphinTxt = (TextView) findViewById(R.id.dolphin_txt);
        dolphinTxt.setOnClickListener(this);

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR) {
                    tts.setLanguage(Locale.UK);
                }
            }
        });
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
        if (view.getId() == R.id.anteater || view.getId() == R.id.anteater_txt) {
            tts.speak("Anterter", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.antelope || view.getId() == R.id.antelope_txt) {
            tts.speak("Antelope", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.bali_myanh || view.getId() == R.id.bali_myanh_txt) {
            tts.speak("Bali Myanh", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.bat || view.getId() == R.id.bat_txt) {
            tts.speak("Bat", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.bear || view.getId() == R.id.bear_txt) {
            tts.speak("Bear", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.bee || view.getId() == R.id.bee_txt) {
            tts.speak("Bee", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.beetle || view.getId() == R.id.beetle_txt) {
            tts.speak("Beetle", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.binturong || view.getId() == R.id.binturong_txt) {
            tts.speak("Binturong", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.blad_eagle || view.getId() == R.id.blad_eagler_txt) {
            tts.speak("Blad Ragle", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.boa || view.getId() == R.id.boa_txt) {
            tts.speak("Boa", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.bonobo || view.getId() == R.id.bonobo_txt) {
            tts.speak("Bonobo", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.bop || view.getId() == R.id.bop_txt) {
            tts.speak("Bop", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.bowerbird || view.getId() == R.id.bowerbird_txt) {
            tts.speak("Bower Bird", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.butterfly || view.getId() == R.id.butterfly_txt) {
            tts.speak("Butterfly", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.ca_condor || view.getId() == R.id.ca_condor_txt) {
            tts.speak("Ca Condor", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.dolphin || view.getId() == R.id.dolphin_txt) {
            tts.speak("Dolphin", TextToSpeech.QUEUE_FLUSH, null);
        }
    }
}
