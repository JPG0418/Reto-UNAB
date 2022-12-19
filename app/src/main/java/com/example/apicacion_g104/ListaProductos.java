package com.example.apicacion_g104;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaProductos extends AppCompatActivity {
    private Button btnProduct1, btnProduct2, btnProduct3 ;
    private TextView textProduct1, textProduct2, textProduct3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_producto);

        btnProduct1 = (Button) findViewById(R.id.btnProduct1);
        btnProduct2 = (Button) findViewById(R.id.btnProduct2);
        btnProduct3 = (Button) findViewById(R.id.btnProduct3);
        textProduct1 = (TextView) findViewById(R.id.textProduct1);
        textProduct2 = (TextView) findViewById(R.id.textProduct2);
        textProduct3 = (TextView) findViewById(R.id.textProduct3);

        btnProduct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InfoProducto1.class);
                intent.putExtra("title", textProduct1.getText().toString());
                intent.putExtra("description", "Descripcion del producto 1");
                intent.putExtra("image", R.drawable.imagen1);
                startActivity(intent);
            }
        });

        btnProduct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InfoProducto1.class);
                intent.putExtra("title", textProduct2.getText().toString());
                intent.putExtra("description", "Descripcion del producto 2");
                intent.putExtra("image", R.drawable.imagen2);
                startActivity(intent);
            }
        });

        btnProduct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InfoProducto1.class);
                intent.putExtra("title", textProduct3.getText().toString());
                intent.putExtra("description", "Descripcion del producto 3");
                intent.putExtra("image", R.drawable.fondo1);
                startActivity(intent);
            }
        });

    }
}