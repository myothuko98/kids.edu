package com.freeze.ucsy.kidsedu;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Locale;

public class Alphabets extends AppCompatActivity implements View.OnClickListener {

    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        ImageView a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;

        a = (ImageView) findViewById(R.id.a);
        b = (ImageView) findViewById(R.id.b);
        c = (ImageView) findViewById(R.id.c);
        d = (ImageView) findViewById(R.id.d);
        e = (ImageView) findViewById(R.id.e);
        f = (ImageView) findViewById(R.id.f);
        g = (ImageView) findViewById(R.id.g);
        h = (ImageView) findViewById(R.id.h);
        i = (ImageView) findViewById(R.id.i);
        j = (ImageView) findViewById(R.id.j);
        k = (ImageView) findViewById(R.id.k);
        l = (ImageView) findViewById(R.id.l);
        m = (ImageView) findViewById(R.id.m);
        n = (ImageView) findViewById(R.id.n);
        o = (ImageView) findViewById(R.id.o);
        p = (ImageView) findViewById(R.id.p);
        q = (ImageView) findViewById(R.id.q);
        r = (ImageView) findViewById(R.id.r);
        s = (ImageView) findViewById(R.id.s);
        t = (ImageView) findViewById(R.id.t);
        u = (ImageView) findViewById(R.id.u);
        v = (ImageView) findViewById(R.id.v);
        w = (ImageView) findViewById(R.id.w);
        x = (ImageView) findViewById(R.id.x);
        y = (ImageView)findViewById(R.id.y);
        z = (ImageView)findViewById(R.id.z);

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR) {
                    tts.setLanguage(Locale.UK);
                }
            }
        });

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);
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
        if (view.getId() == R.id.a) {
            tts.speak("A...", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.b) {
            tts.speak("B", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.c) {
            tts.speak("C", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.d) {
            tts.speak("D", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.e) {
            tts.speak("E...", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.f) {
            tts.speak("F", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.g) {
            tts.speak("G", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.h) {
            tts.speak("H", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.i) {
            tts.speak("I", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.j) {
            tts.speak("J", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.k) {
            tts.speak("K", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.l) {
            tts.speak("L", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.m) {
            tts.speak("M", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.n) {
            tts.speak("N", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.o) {
            tts.speak("O", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.p) {
            tts.speak("P", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.q) {
            tts.speak("Q", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.r) {
            tts.speak("R", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.s) {
            tts.speak("S", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.t) {
            tts.speak("T", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.u) {
            tts.speak("U", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.v) {
            tts.speak("V", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.w) {
            tts.speak("W", TextToSpeech.QUEUE_FLUSH, null);
        } else if (view.getId() == R.id.x) {
            tts.speak("X", TextToSpeech.QUEUE_FLUSH, null);
        }else if (view.getId()==R.id.y){
                   tts.speak("Y", TextToSpeech.QUEUE_FLUSH, null);
               }else if (view.getId()==R.id.z){
                   tts.speak("Z", TextToSpeech.QUEUE_FLUSH, null);
               }
    }
}
