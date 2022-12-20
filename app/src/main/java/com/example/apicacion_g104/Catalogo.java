package com.example.apicacion_g104;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.apicacion_g104.Adaptadores.ProductoAdapter;
import com.example.apicacion_g104.DB.DBFirebase;
import com.example.apicacion_g104.Entidades.Producto;

import java.util.ArrayList;

public class Catalogo extends AppCompatActivity {
    private DBFirebase dbFirebase;
    private ListView listViewProductos;
    private ProductoAdapter productoAdapter;
    private ArrayList<Producto> arrayProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        listViewProductos = (ListView) findViewById(R.id.listViewProductos);
        arrayProductos = new ArrayList<>();
        dbFirebase = new DBFirebase();
        //** Creacion de Productos

        /*
        Producto producto1= new Producto("Protector 1", "Desc1", 1000, R.drawable.imagen1);
        Producto producto2= new Producto("Protector 2", "Desc1", 1500, R.drawable.imagen2);
        Producto producto3= new Producto("Protector 3", "Desc1", 2000, R.drawable.fondo1);
        Producto producto4= new Producto("Prptector 1 x2", "Desc1", 1800, R.drawable.imagen1);
        Producto producto5= new Producto("Prptector 2 x2", "Desc1", 2700, R.drawable.imagen2);
        Producto producto6= new Producto("Prptector 3 x2", "Desc1", 3600, R.drawable.fondo1);
        Producto producto7= new Producto("Prptector 1 x3", "Desc1", 2400, R.drawable.imagen1);
        Producto producto8= new Producto("Prptector 2 x3", "Desc1", 4000, R.drawable.imagen2);
        Producto producto9= new Producto("Prptector 3 x3", "Desc1", 5000, R.drawable.fondo1);

        dbFirebase.insertData(producto1);
        dbFirebase.insertData(producto2);
        dbFirebase.insertData(producto3);
        dbFirebase.insertData(producto4);
        dbFirebase.insertData(producto5);
        dbFirebase.insertData(producto6);
        dbFirebase.insertData(producto7);
        dbFirebase.insertData(producto8);
        dbFirebase.insertData(producto9);

        /*
        arrayProductos.add(producto1);
        arrayProductos.add(producto2);
        arrayProductos.add(producto3);
        arrayProductos.add(producto4);
        arrayProductos.add(producto5);
        arrayProductos.add(producto6);
        arrayProductos.add(producto7);
        arrayProductos.add(producto8);
        arrayProductos.add(producto9);
        */

        //************
        productoAdapter = new ProductoAdapter(this, arrayProductos);
        listViewProductos.setAdapter(productoAdapter);

        dbFirebase.getData(productoAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.addItem:
                Intent intent = new Intent(getApplicationContext(), ListaProductos.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}