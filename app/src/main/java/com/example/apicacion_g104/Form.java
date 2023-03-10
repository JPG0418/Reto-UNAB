package com.example.apicacion_g104;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.apicacion_g104.DB.DBFirebase;
import com.example.apicacion_g104.Entidades.Producto;

public class ListaProductos extends AppCompatActivity {
    private Button btnForm;
    private EditText editeName, editDescription, editPrice;
    private DBFirebase dbFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_producto);

        btnForm = (Button) findViewById(R.id.btnForm);
        editeName = (EditText) findViewById(R.id.editName);
        editDescription = (EditText) findViewById(R.id.editDescription);
        editPrice = (EditText) findViewById(R.id.editPrice);
        dbFirebase = new DBFirebase();

        btnForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Producto producto = new Producto(
                        editeName.getText().toString(),
                        editDescription.getText().toString(),
                        Integer.parseInt(editPrice.getText().toString()),
                        R.drawable.imagen1,
                        "",
                        ""
                );
                dbFirebase.insertData(producto);
                Intent intent = new Intent(getApplicationContext(), Catalogo.class);
                startActivity(intent);
            }
        });

    }
}
