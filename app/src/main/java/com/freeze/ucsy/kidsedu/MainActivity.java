package com.freeze.ucsy.kidsedu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnAlphabets, btnNumeric, btnTree, btnFruit, btnAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlphabets = (Button) findViewById(R.id.btn_alphabets);
        btnNumeric = (Button) findViewById(R.id.btn_numeric);
        btnTree = (Button) findViewById(R.id.btn_flower);
        btnFruit = (Button) findViewById(R.id.btn_fruits);
        btnAnimal = (Button) findViewById(R.id.btn_animal);

        btnAlphabets.setOnClickListener(this);
        btnNumeric.setOnClickListener(this);
        btnTree.setOnClickListener(this);
        btnFruit.setOnClickListener(this);
        btnAnimal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_alphabets) {
            Intent alpha = new Intent(MainActivity.this, Alphabets.class);
            startActivity(alpha);
        } else if (view.getId() == R.id.btn_numeric) {
            Intent num = new Intent(MainActivity.this, Numeric.class);
            startActivity(num);
        } else if (view.getId() == R.id.btn_flower) {
            Intent tree = new Intent(MainActivity.this, Flowers.class);
            startActivity(tree);
        } else if (view.getId() == R.id.btn_fruits) {
            Intent fruit = new Intent(MainActivity.this, Fruits.class);
            startActivity(fruit);
        } else if (view.getId() == R.id.btn_animal) {
            Intent animal = new Intent(MainActivity.this, Animal.class);
            startActivity(animal);
        }
    }
}
