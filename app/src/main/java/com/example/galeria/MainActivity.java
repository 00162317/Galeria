package com.example.galeria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public ArrayList<Integer> lista = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista.add(R.drawable.dulce);
        lista.add(R.drawable.dulceDos);
        lista.add(R.drawable.dulceTres);
        lista.add(R.drawable.dulceCuatro);

        ImageView pic1 = findViewById(R.id.foto1);
        ImageView pic2 = findViewById(R.id.foto2);
        ImageView pic3 = findViewById(R.id.foto3);
        ImageView pic4 = findViewById(R.id.foto4);
        ImageView pic5 = findViewById(R.id.foto5);
        ImageView pic6 = findViewById(R.id.foto6);
        ImageView pic7 = findViewById(R.id.foto7);
        ImageView pic8 = findViewById(R.id.foto8);
        ImageView pic9 = findViewById(R.id.foto9);
        ImageView pic10 = findViewById(R.id.foto10);
        ImageView pic11 = findViewById(R.id.foto11);
        ImageView pic12 = findViewById(R.id.foto12);

        pic1.setOnClickListener(this);
        pic2.setOnClickListener(this);
        pic3.setOnClickListener(this);
        pic4.setOnClickListener(this);
        pic5.setOnClickListener(this);
        pic6.setOnClickListener(this);
        pic7.setOnClickListener(this);
        pic8.setOnClickListener(this);
        pic9.setOnClickListener(this);
        pic10.setOnClickListener(this);
        pic11.setOnClickListener(this);
        pic12.setOnClickListener(this);

    }
    public int numeroRandom(){
        int n = (int) ((Math.random()*3));
        return n;
    }
    @Override
    public void onClick(View v) {
        ImageView foton = findViewById(v.getId());
        foton.setImageResource(lista.get(numeroRandom()));

    }
}
