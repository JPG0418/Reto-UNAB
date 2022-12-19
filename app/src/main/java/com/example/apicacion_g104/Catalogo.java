package com.example.apicacion_g104;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.apicacion_g104.Adaptadores.ProductoAdapter;
import com.example.apicacion_g104.Entidades.Producto;

import java.util.ArrayList;

public class Catalogo extends AppCompatActivity {
    private ListView listViewProductos;
    private ProductoAdapter productoAdaaptar;
    private ArrayList<Producto> arrayProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        listViewProductos = (ListView) findViewById(R.id.listViewProductos);
        arrayProductos = new ArrayList<>();
        //** Creacion de Productos
        Producto producto1= new Producto("Producto1", "Desc1", 1000, R.drawable.imagen1);
        Producto producto2= new Producto("Producto2", "Desc1", 2000, R.drawable.imagen1);
        Producto producto3= new Producto("Producto3", "Desc1", 3000, R.drawable.imagen1);
        Producto producto4= new Producto("Producto4", "Desc1", 4000, R.drawable.imagen1);
        Producto producto5= new Producto("Producto5", "Desc1", 5000, R.drawable.imagen1);
        Producto producto6= new Producto("Producto6", "Desc1", 6000, R.drawable.imagen1);
        Producto producto7= new Producto("Producto7", "Desc1", 7000, R.drawable.imagen1);
        Producto producto8= new Producto("Producto8", "Desc1", 8000, R.drawable.imagen1);
        Producto producto9= new Producto("Producto9", "Desc1", 9000, R.drawable.imagen1);

        arrayProductos.add(producto1);
        arrayProductos.add(producto2);
        arrayProductos.add(producto3);
        arrayProductos.add(producto4);
        arrayProductos.add(producto5);
        arrayProductos.add(producto6);
        arrayProductos.add(producto7);
        arrayProductos.add(producto8);
        arrayProductos.add(producto9);

        //************
        productoAdaaptar = new ProductoAdapter(this, arrayProductos);
        listViewProductos.setAdapter(productoAdaaptar);


    }
}