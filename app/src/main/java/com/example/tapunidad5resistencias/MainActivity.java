package com.example.tapunidad5resistencias;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner_color_1, spinner_color_2, spinner_color_3, spinner_color_4;
    TextView resultado_ohm, resultado_porcentaje;
    View ractangle_1, ractangle_2, ractangle_3, ractangle_4;

    String[] lista_colores = {"Negro","Cafe","Rojo","Naranja","Amarillo","Verde","Azul","Violeta","Gris","Blanco"};
    String[] lista_tolerancia = {"Oro","Plata","Sin Color"};

    String valor_1 = "", valor_2 = "", valor_3 = "", tolerancia = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_color_1 = findViewById(R.id.spinner_color_1);
        spinner_color_2 = findViewById(R.id.spinner_color_2);
        spinner_color_3 = findViewById(R.id.spinner_color_3);
        spinner_color_4 = findViewById(R.id.spinner_color_4);

        resultado_ohm = findViewById(R.id.resultado_ohm);
        resultado_porcentaje = findViewById(R.id.resultado_porcentaje);

        ractangle_1 = findViewById(R.id.ractangle_1);
        ractangle_2 = findViewById(R.id.ractangle_2);
        ractangle_3 = findViewById(R.id.ractangle_3);
        ractangle_4 = findViewById(R.id.ractangle_4);

        ArrayAdapter<String> colores_adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_colores);
        ArrayAdapter<String> tolerencia_adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_tolerancia);
        spinner_color_1.setAdapter(colores_adapter);
        spinner_color_2.setAdapter(colores_adapter);
        spinner_color_3.setAdapter(colores_adapter);
        spinner_color_4.setAdapter(tolerencia_adapter);

        spinner_color_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        valor_1 = "";
                        ractangle_1.setBackgroundColor(Color.parseColor("#000000"));
                        break;
                    case 1:
                        valor_1 = "1";
                        ractangle_1.setBackgroundColor(Color.parseColor("#58463B"));
                        break;
                    case 2:
                        valor_1 = "2";
                        ractangle_1.setBackgroundColor(Color.parseColor("#FF0000"));
                        break;
                    case 3:
                        valor_1 = "3";
                        ractangle_1.setBackgroundColor(Color.parseColor("#FFA500"));
                        break;
                    case 4:
                        valor_1 = "4";
                        ractangle_1.setBackgroundColor(Color.parseColor("#FFFF00"));
                        break;
                    case 5:
                        valor_1 = "5";
                        ractangle_1.setBackgroundColor(Color.parseColor("#00FF00"));
                        break;
                    case 6:
                        valor_1 = "6";
                        ractangle_1.setBackgroundColor(Color.parseColor("#233DFF"));
                        break;
                    case 7:
                        valor_1 = "7";
                        ractangle_1.setBackgroundColor(Color.parseColor("#800080"));
                        break;
                    case 8:
                        valor_1 = "8";
                        ractangle_1.setBackgroundColor(Color.parseColor("#AEB79B"));
                        break;
                    case 9:
                        valor_1 = "9";
                        ractangle_1.setBackgroundColor(Color.parseColor("#ffffff"));
                        break;
                }
                resultado_ohm.setText(valor_1 + valor_2 + valor_3);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_color_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        valor_2 = "0";
                        ractangle_2.setBackgroundColor(Color.parseColor("#000000"));
                        break;
                    case 1:
                        valor_2 = "1";
                        ractangle_2.setBackgroundColor(Color.parseColor("#58463B"));
                        break;
                    case 2:
                        valor_2 = "2";
                        ractangle_2.setBackgroundColor(Color.parseColor("#FF0000"));
                        break;
                    case 3:
                        valor_2 = "3";
                        ractangle_2.setBackgroundColor(Color.parseColor("#FFA500"));
                        break;
                    case 4:
                        valor_2 = "4";
                        ractangle_2.setBackgroundColor(Color.parseColor("#FFFF00"));
                        break;
                    case 5:
                        valor_2 = "5";
                        ractangle_2.setBackgroundColor(Color.parseColor("#00FF00"));
                        break;
                    case 6:
                        valor_2 = "6";
                        ractangle_2.setBackgroundColor(Color.parseColor("#233DFF"));
                        break;
                    case 7:
                        valor_2 = "7";
                        ractangle_2.setBackgroundColor(Color.parseColor("#800080"));
                        break;
                    case 8:
                        valor_2 = "8";
                        ractangle_2.setBackgroundColor(Color.parseColor("#AEB79B"));
                        break;
                    case 9:
                        valor_2 = "9";
                        ractangle_2.setBackgroundColor(Color.parseColor("#ffffff"));
                        break;
                }
                resultado_ohm.setText(valor_1 + valor_2 + valor_3);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_color_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        valor_3 = "";
                        ractangle_3.setBackgroundColor(Color.parseColor("#000000"));
                        break;
                    case 1:
                        valor_3 = "0";
                        ractangle_3.setBackgroundColor(Color.parseColor("#58463B"));
                        break;
                    case 2:
                        valor_3 = "00";
                        ractangle_3.setBackgroundColor(Color.parseColor("#FF0000"));
                        break;
                    case 3:
                        valor_3 = "000";
                        ractangle_3.setBackgroundColor(Color.parseColor("#FFA500"));
                        break;
                    case 4:
                        valor_3 = "0000";
                        ractangle_3.setBackgroundColor(Color.parseColor("#FFFF00"));
                        break;
                    case 5:
                        valor_3 = "00000";
                        ractangle_3.setBackgroundColor(Color.parseColor("#00FF00"));
                        break;
                    case 6:
                        valor_3 = "000000";
                        ractangle_3.setBackgroundColor(Color.parseColor("#233DFF"));
                        break;
                    case 7:
                        valor_3 = "0000000";
                        ractangle_3.setBackgroundColor(Color.parseColor("#800080"));
                        break;
                    case 8:
                        valor_3 = "00000000";
                        ractangle_3.setBackgroundColor(Color.parseColor("#AEB79B"));
                        break;
                    case 9:
                        valor_3 = "000000000";
                        ractangle_3.setBackgroundColor(Color.parseColor("#ffffff"));
                        break;
                }
                resultado_ohm.setText(valor_1 + valor_2 + valor_3);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_color_4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ractangle_4.setVisibility(View.VISIBLE);
                switch (position) {
                    case 0:
                        tolerancia = "5%";
                        ractangle_4.setBackgroundColor(Color.parseColor("#FFFF66"));
                        break;
                    case 1:
                        tolerancia = "10%";
                        ractangle_4.setBackgroundColor(Color.parseColor("#E0D3ED"));
                        break;
                    case 2:
                        tolerancia = "20%";
                        ractangle_4.setVisibility(View.INVISIBLE);
                        break;
                }
                resultado_porcentaje.setText(tolerancia);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}