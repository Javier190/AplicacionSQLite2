package com.example.aplicacionsqlite2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {


    private ImageView imageView;
    private TextView textView;
    private String recibirnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageView = (ImageView)findViewById(R.id.imageView_SobrePersona);
        textView = (TextView)findViewById(R.id.textView3);


        //Esta es una variable encargada de recibir el intent de la activity2 y lo hace a traves de la position
        recibirnombre = getIntent().getStringExtra("position");



        if(recibirnombre != null){
            textView.setText(recibirnombre);
        }


    }
}