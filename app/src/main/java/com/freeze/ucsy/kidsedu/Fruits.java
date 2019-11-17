package com.freeze.ucsy.kidsedu;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class Fruits extends AppCompatActivity implements View.OnClickListener {
private TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView apples,apricot,asparagus,avocado,bananas,beans,beetroot,blackberry,blueberry,broccoli,cabbage,cantaloupe,carrot,cauliflower,celery,cherry,cloudberry,cowberry,cranberry,cucumber;
        TextView applesTxt,apricotTxt,asparagusTxt,avocadoTxt,bananasTxt,beansTxt,beetrootTxt,blackberryTxt,blueberryTxt,broccoliTxt,cabbageTxt,cantaloupeTxt,carrotTxt,cauliflowerTxt,celeryTxt,cherryTxt,cloudberryTxt,cowberryTxt,cranberryTxt,cucumberTxt;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        apples = (ImageView)findViewById(R.id.apple);
        apples.setOnClickListener(this);
        applesTxt = (TextView)findViewById(R.id.apple_txt);
        applesTxt.setOnClickListener(this);

        asparagus = (ImageView)findViewById(R.id.asparagus);
        asparagus.setOnClickListener(this);
        asparagusTxt = (TextView)findViewById(R.id.asparagus_txt);
        asparagusTxt.setOnClickListener(this);

        apricot = (ImageView)findViewById(R.id.apricot);
        apricot.setOnClickListener(this);
        apricotTxt = (TextView)findViewById(R.id.apricot_txt);
        apricotTxt.setOnClickListener(this);

        avocado = (ImageView)findViewById(R.id.avocado);
        avocado.setOnClickListener(this);
        avocadoTxt = (TextView)findViewById(R.id.avocado_txt);
        avocadoTxt.setOnClickListener(this);

        bananas = (ImageView)findViewById(R.id.banana);
        bananas.setOnClickListener(this);
        bananasTxt = (TextView)findViewById(R.id.banana_txt);
        bananasTxt.setOnClickListener(this);

        beans = (ImageView)findViewById(R.id.beans);
        beans.setOnClickListener(this);
        beansTxt = (TextView)findViewById(R.id.beans_txt);
        beansTxt.setOnClickListener(this);

        beetroot = (ImageView)findViewById(R.id.beetroot);
        beetroot.setOnClickListener(this);
        beetrootTxt = (TextView)findViewById(R.id.beetroot_txt);
        beetrootTxt.setOnClickListener(this);

        blackberry = (ImageView)findViewById(R.id.blackberry);
        blackberry.setOnClickListener(this);
        blackberryTxt = (TextView)findViewById(R.id.blackberry_txt);
        blackberryTxt.setOnClickListener(this);

        blueberry = (ImageView)findViewById(R.id.blueberry);
        blueberry.setOnClickListener(this);
        blueberryTxt = (TextView)findViewById(R.id.blueberry_txt);
        blueberryTxt.setOnClickListener(this);

        broccoli = (ImageView)findViewById(R.id.broccoli);
        broccoli.setOnClickListener(this);
        broccoliTxt = (TextView)findViewById(R.id.broccoli_txt);
        broccoliTxt.setOnClickListener(this);

        cabbage = (ImageView)findViewById(R.id.cabbage);
        cabbage.setOnClickListener(this);
        cabbageTxt = (TextView)findViewById(R.id. cabbage_txt);
        cabbageTxt.setOnClickListener(this);

        cantaloupe = (ImageView)findViewById(R.id.cantaloupe);
        cantaloupe.setOnClickListener(this);
        cantaloupeTxt = (TextView)findViewById(R.id.cantaloupe_txt);
        cantaloupeTxt.setOnClickListener(this);

        carrot = (ImageView)findViewById(R.id.carrot);
        carrot.setOnClickListener(this);
        carrotTxt = (TextView)findViewById(R.id.carrot_txt);
        carrotTxt.setOnClickListener(this);

        cauliflower = (ImageView)findViewById(R.id.cauliflower);
        cauliflower.setOnClickListener(this);
        cauliflowerTxt = (TextView)findViewById(R.id.cauliflower_txt);
        cauliflowerTxt.setOnClickListener(this);

        celery = (ImageView)findViewById(R.id.celery);
        celery.setOnClickListener(this);
        celeryTxt = (TextView)findViewById(R.id.celery_txt);
        celeryTxt.setOnClickListener(this);

        cherry = (ImageView)findViewById(R.id.cherry);
        cherry.setOnClickListener(this);
        cherryTxt = (TextView)findViewById(R.id.cherry_txt);
        cherryTxt.setOnClickListener(this);

        cloudberry = (ImageView)findViewById(R.id.cloudberry);
        cloudberry.setOnClickListener(this);
        cloudberryTxt = (TextView)findViewById(R.id.cloudberry_txt);
        cloudberryTxt.setOnClickListener(this);

        cowberry = (ImageView)findViewById(R.id.cowberry);
        cowberry.setOnClickListener(this);
        cowberryTxt = (TextView)findViewById(R.id.cowberry_txt);
        cowberryTxt.setOnClickListener(this);

        cranberry = (ImageView)findViewById(R.id.cranberry);
        cranberry.setOnClickListener(this);
        cranberryTxt = (TextView)findViewById(R.id.cranberry_txt);
        cranberryTxt.setOnClickListener(this);

        cucumber = (ImageView)findViewById(R.id.cucumber);
        cucumber.setOnClickListener(this);
        cucumberTxt = (TextView)findViewById(R.id.cucumber_txt);
        cucumberTxt.setOnClickListener(this);

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR){
                    tts.setLanguage(Locale.UK);
                }
            }
        });
    }

    @Override
    protected void onPause() {
        if(tts != null){
            tts.stop();
            tts.shutdown();
        }
        super.onPause();
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.apple || view.getId() == R.id.apple_txt){
            tts.speak("Apple",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.apricot || view.getId() == R.id.apricot_txt){
            tts.speak("Apricot",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.asparagus || view.getId() == R.id.asparagus_txt){
            tts.speak("Asparagus",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.avocado || view.getId() == R.id.avocado_txt){
            tts.speak("Avocado",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.banana || view.getId() == R.id.banana_txt){
            tts.speak("Banana",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.beans || view.getId() == R.id.beans_txt){
            tts.speak("Beans",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.beetroot || view.getId() == R.id.beetroot_txt){
            tts.speak("Beetroot",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.blackberry || view.getId() == R.id.blackberry_txt){
            tts.speak("Black Berry",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.blueberry || view.getId() == R.id.blueberry_txt){
            tts.speak("Blue Berry",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.broccoli || view.getId() == R.id.broccoli_txt){
            tts.speak("Broccoli",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.cabbage || view.getId() == R.id.cabbage_txt){
            tts.speak("Cabbage",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.cantaloupe || view.getId() == R.id.cantaloupe_txt){
            tts.speak("Cantaloupe",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.carrot || view.getId() == R.id.carrot_txt){
            tts.speak("Carrot",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.cauliflower || view.getId() == R.id.cauliflower_txt){
            tts.speak("Cauliflower",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.celery || view.getId() == R.id.celery_txt){
            tts.speak("Celery",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.cherry || view.getId() == R.id.cherry_txt){
            tts.speak("Cherry",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.cloudberry || view.getId() == R.id.cloudberry_txt){
            tts.speak("Cloud Berry",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.cowberry || view.getId() == R.id.cowberry_txt){
            tts.speak("Cow Berry",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.cranberry || view.getId() == R.id.cranberry_txt){
            tts.speak("Cran Berry",TextToSpeech.QUEUE_FLUSH,null);
        }else if(view.getId() == R.id.cucumber || view.getId() == R.id.cucumber_txt){
            tts.speak("Cucumber",TextToSpeech.QUEUE_FLUSH,null);
        }
    }
}
