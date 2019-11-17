package com.freeze.ucsy.kidsedu;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class Flowers extends AppCompatActivity implements View.OnClickListener {


    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers);
        ImageView blueStar, brasilianBlume, buddhaBelly, balloonFlower, bambooOrchid, calendula, candytuft, cantaloup, capePrimrose, caper, angelWingBegonia, arisaema, artichoke, aster, authurium, avens;
        TextView blueStartxt, brasilianBlumetxt, buddhaBellytxt, balloonFlowertxt, bambooOrchidtxt, calendulatxt, candytufttxt, cantalouptxt, capePrimrosetxt, capertxt, angelWingBegoniatxt, arisaematxt, artichoketxt, astertxt, authuriumtxt, avenstxt;
        authurium = (ImageView) findViewById(R.id.authurium);
        authurium.setOnClickListener(this);
        authuriumtxt = (TextView) findViewById(R.id.authurium_txt);
        authuriumtxt.setOnClickListener(this);

        avens = (ImageView) findViewById(R.id.avens);
        avens.setOnClickListener(this);
        avenstxt = (TextView) findViewById(R.id.avens_txt);
        avenstxt.setOnClickListener(this);

        angelWingBegonia = (ImageView) findViewById(R.id.angle_wing_begonia);
        angelWingBegonia.setOnClickListener(this);
        angelWingBegoniatxt = (TextView) findViewById(R.id.angel_wing_bego_txt);
        angelWingBegoniatxt.setOnClickListener(this);

        arisaema = (ImageView) findViewById(R.id.arisaema);
        arisaema.setOnClickListener(this);
        arisaematxt = (TextView) findViewById(R.id.arisaema_txt);
        arisaematxt.setOnClickListener(this);

        artichoke = (ImageView) findViewById(R.id.artichoke);
        artichoke.setOnClickListener(this);
        artichoketxt = (TextView) findViewById(R.id.artichoke_txt);
        artichoketxt.setOnClickListener(this);

        aster = (ImageView) findViewById(R.id.aster);
        aster.setOnClickListener(this);
        astertxt = (TextView) findViewById(R.id.aster_txt);
        astertxt.setOnClickListener(this);

        blueStar = (ImageView) findViewById(R.id.blue_star);
        blueStar.setOnClickListener(this);
        blueStartxt = (TextView) findViewById(R.id.blue_star_txt);
        blueStartxt.setOnClickListener(this);

        brasilianBlume = (ImageView) findViewById(R.id.brasilian_blume);
        brasilianBlume.setOnClickListener(this);
        brasilianBlumetxt = (TextView) findViewById(R.id.brasilian_blume_txt);
        brasilianBlumetxt.setOnClickListener(this);

        buddhaBelly = (ImageView) findViewById(R.id.buddha_belly);
        buddhaBelly.setOnClickListener(this);
        buddhaBellytxt = (TextView) findViewById(R.id.buddha_belly_txt);
        buddhaBellytxt.setOnClickListener(this);

        balloonFlower = (ImageView) findViewById(R.id.balloom_flower);
        balloonFlower.setOnClickListener(this);
        balloonFlowertxt = (TextView) findViewById(R.id.balloon_flower_txt);
        balloonFlowertxt.setOnClickListener(this);

        bambooOrchid = (ImageView) findViewById(R.id.bamboo_orchid);
        bambooOrchid.setOnClickListener(this);
        bambooOrchidtxt = (TextView) findViewById(R.id.bamboo_orchid_txt);
        bambooOrchidtxt.setOnClickListener(this);

        calendula = (ImageView) findViewById(R.id.calendula);
        calendula.setOnClickListener(this);
        calendulatxt = (TextView) findViewById(R.id.calendula_txt);
        calendulatxt.setOnClickListener(this);

        candytuft = (ImageView) findViewById(R.id.candytuft);
        candytuft.setOnClickListener(this);
        candytufttxt = (TextView) findViewById(R.id.candytuft_txt);
        candytufttxt.setOnClickListener(this);

        cantaloup = (ImageView) findViewById(R.id.cantaloup);
        cantaloup.setOnClickListener(this);
        cantalouptxt = (TextView) findViewById(R.id.cantalup_txt);
        cantalouptxt.setOnClickListener(this);

        capePrimrose = (ImageView) findViewById(R.id.cape_primrose);
        capePrimrose.setOnClickListener(this);
        capePrimrosetxt = (TextView) findViewById(R.id.cape_primrose_txt);
        capePrimrosetxt.setOnClickListener(this);

        caper = (ImageView) findViewById(R.id.caper);
        caper.setOnClickListener(this);
        capertxt = (TextView) findViewById(R.id.caper_txt);
        capertxt.setOnClickListener(this);

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

        if (view.getId() == R.id.arisaema || view.getId() == R.id.arisaema_txt) {
            tts.speak("Arisaema", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.authurium || view.getId() == R.id.authurium_txt) {
            tts.speak("Authurium", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.artichoke || view.getId() == R.id.authurium_txt) {
            tts.speak("Artichoke", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.aster || view.getId() == R.id.aster_txt) {
            tts.speak("Aster", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.avens || view.getId() == R.id.avens_txt) {
            tts.speak("Avens", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.angle_wing_begonia || view.getId() == R.id.angel_wing_bego_txt) {
            tts.speak("Angel Wing Begonia", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.balloom_flower || view.getId() == R.id.balloon_flower_txt) {
            tts.speak("Balloom Flower", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.blue_star || view.getId() == R.id.blue_star_txt) {
            tts.speak("Blue Star", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.bamboo_orchid || view.getId() == R.id.bamboo_orchid_txt) {
            tts.speak("Bamboo Orchid", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.brasilian_blume || view.getId() == R.id.brasilian_blume_txt) {
            tts.speak("Brasilian Blume", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.buddha_belly || view.getId() == R.id.buddha_belly_txt) {
            tts.speak("Buddha Belly", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.calendula || view.getId() == R.id.calendula_txt) {
            tts.speak("Calendula", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.candytuft || view.getId() == R.id.candytuft_txt) {
            tts.speak("Candytuft", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.cantaloup || view.getId() == R.id.cantalup_txt) {
            tts.speak("Cantaloup", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.cape_primrose || view.getId() == R.id.cape_primrose_txt) {
            tts.speak("Cape Primrose", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.caper || view.getId() == R.id.caper_txt) {
            tts.speak("Caper", TextToSpeech.QUEUE_FLUSH, null);
        }

    }
}
