package com.example.hp.actividad5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button sumar, restar;
    private TextView textoid;
    private int contador = 0;
    private TextView tvContador;

    @Override
    public void onCreate(final Bundle estado) {
        super.onCreate(estado);
        setContentView(R.layout.activity_main);
        textoid = (TextView) findViewById(R.id.textoid);

        sumar = (Button) findViewById(R.id.sumarbutton);
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                textoid.setText("Contador: " + contador);

                restar = (Button) findViewById(R.id.restarbutton);
                restar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contador--;
                        textoid.setText("Contador: " + contador);
                    }
                });
            }

        });
    }

    @Override
    protected void onSaveInstanceState(Bundle  estado) {
        super.onSaveInstanceState(estado);
        estado.putInt("posicion", contador);
    }

    @Override
    protected void onRestoreInstanceState(Bundle estado){
        super.onRestoreInstanceState(estado);
        contador = estado.getInt("posicion");
        textoid.setText("Contador: " + contador);
    }



}