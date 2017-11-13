package com.example.in2dm3_15.calculadoraacalja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button cero;
    Button uno;
    Button dos= (Button)findViewById(R.id.dos);
    Button tres= (Button)findViewById(R.id.tres);
    Button cuatro= (Button)findViewById(R.id.cuatro);
    Button cinco= (Button)findViewById(R.id.cinco);
    Button seis= (Button)findViewById(R.id.seis);
    Button siete= (Button)findViewById(R.id.siete);
    Button ocho= (Button)findViewById(R.id.ocho);
    Button nueve= (Button)findViewById(R.id.nueve);
    Button suma= (Button)findViewById(R.id.suma);
    Button resta= (Button)findViewById(R.id.resta);
    Button signo= (Button)findViewById(R.id.signo);
    Button vib= (Button)findViewById(R.id.vib);
    Button anim= (Button)findViewById(R.id.anim);
    Button divi= (Button)findViewById(R.id.divi);
    Button frac= (Button)findViewById(R.id.frac);
    Button porcentaje= (Button)findViewById(R.id.porcentaje);
    Button CE= (Button)findViewById(R.id.CE);
    Button C= (Button)findViewById(R.id.C);
    Button borrarUno= (Button)findViewById(R.id.borrarUno);
    Button potencia= (Button)findViewById(R.id.potencia);
    Button decim= (Button)findViewById(R.id.decim);
    Button mult= (Button)findViewById(R.id.mult);
    Button igual= (Button)findViewById(R.id.igual);
    Button raiz= (Button)findViewById(R.id.raiz);
    TextView numGuardado= (TextView) findViewById(R.id.numGuardado);
    TextView numActual= (TextView) findViewById(R.id.numActual);
    String numeroS = "";
    Double numeroD = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain);
//fhgdfdhjfe
    Button cero= (Button)findViewById(R.id.cero);

        cero.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                numeroS=numeroS+"0";
                numeroD= (Double) numeroS;
            }
        });
    Button uno= (Button)findViewById(R.id.uno);
    Button dos= (Button)findViewById(R.id.dos);
    Button tres= (Button)findViewById(R.id.tres);
    Button cuatro= (Button)findViewById(R.id.cuatro);
    Button cinco= (Button)findViewById(R.id.cinco);
    Button seis= (Button)findViewById(R.id.seis);
    Button siete= (Button)findViewById(R.id.siete);
    Button ocho= (Button)findViewById(R.id.ocho);
    Button nueve= (Button)findViewById(R.id.nueve);
    Button suma= (Button)findViewById(R.id.suma);
    Button resta= (Button)findViewById(R.id.resta);
    Button signo= (Button)findViewById(R.id.signo);
    Button vib= (Button)findViewById(R.id.vib);
    Button anim= (Button)findViewById(R.id.anim);
    Button divi= (Button)findViewById(R.id.divi);
    Button frac= (Button)findViewById(R.id.frac);
    Button porcentaje= (Button)findViewById(R.id.porcentaje);
    Button CE= (Button)findViewById(R.id.CE);
    Button C= (Button)findViewById(R.id.C);
    Button borrarUno= (Button)findViewById(R.id.borrarUno);
    Button potencia= (Button)findViewById(R.id.potencia);
    Button decim= (Button)findViewById(R.id.decim);
    Button mult= (Button)findViewById(R.id.mult);
    Button igual= (Button)findViewById(R.id.igual);
    Button raiz= (Button)findViewById(R.id.raiz);


    }






}
