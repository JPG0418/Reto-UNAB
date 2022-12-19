package com.example.apicacion_g104;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoProducto1 extends AppCompatActivity {

    private Button btnReturn;
    private TextView textTitleProduct, textDescription;
    private ImageView imgProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_producto1);

        btnReturn = (Button) findViewById(R.id.btnReturn);
        textTitleProduct = (TextView) findViewById(R.id.textTitleProduct);
        textDescription = (TextView)  findViewById(R.id.textDescription);
        imgProduct = (ImageView) findViewById(R.id.imgproduct);

        Intent intentIn = getIntent();
        textTitleProduct.setText(intentIn.getStringExtra("title"));
        textDescription.setText(intentIn.getStringExtra("description"));
        imgProduct.setImageResource(intentIn.getIntExtra("image", 0));

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListaProductos.class);
                startActivity(intent);
            }
        });

    }
}