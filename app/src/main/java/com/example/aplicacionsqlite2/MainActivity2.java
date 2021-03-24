package com.example.aplicacionsqlite2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listview2;
    private List<ModeloMain2> listamodelo2 = new ArrayList<>();
    private AdapterJJ adapterJJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        listview2 = (ListView)findViewById(R.id.listview2);

        listamodelo2.add(new ModeloMain2(R.drawable.user1,"John Doe", R.drawable.arrow2editado));
        listamodelo2.add(new ModeloMain2(R.drawable.user2,"Bruce Wayne", R.drawable.arrow2editado));
        listamodelo2.add(new ModeloMain2(R.drawable.user3,"Diana Prince", R.drawable.arrow2editado));
        listamodelo2.add(new ModeloMain2(R.drawable.user1,"John Doe", R.drawable.arrow2editado));
        listamodelo2.add(new ModeloMain2(R.drawable.user2,"Bruce Wayne", R.drawable.arrow2editado));
        listamodelo2.add(new ModeloMain2(R.drawable.user3,"Diana Prince", R.drawable.arrow2editado));
        listamodelo2.add(new ModeloMain2(R.drawable.user1,"John Doe", R.drawable.arrow2editado));
        listamodelo2.add(new ModeloMain2(R.drawable.user2,"Bruce Wayne", R.drawable.arrow2editado));
        listamodelo2.add(new ModeloMain2(R.drawable.user3,"Diana Prince", R.drawable.arrow2editado));

        adapterJJ = new AdapterJJ(this,R.layout.layout_main2, listamodelo2);
        listview2.setAdapter(adapterJJ);

        listview2.setOnItemClickListener(this);

    }

    //Aca estamos pasando a la activity detalle de cada empleado y usamos un intent para pasar el nombre de una activity a otra a traves del putextra
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position){

            case 0:
                Toast.makeText(this,"Redirigiendo hacia " + listamodelo2.get(position).getNombrePersona(), Toast.LENGTH_SHORT).show();
                Intent intent0 = new Intent(MainActivity2.this,MainActivity4.class);
                intent0.putExtra("position",listamodelo2.get(position).getNombrePersona());
                startActivity(intent0);

            case 1:
                Toast.makeText(this,"Redirigiendo hacia " + listamodelo2.get(position).getNombrePersona(), Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity2.this,MainActivity3.class);
                intent1.putExtra("position",listamodelo2.get(position).getNombrePersona());
                startActivity(intent1);
        }

    }
}