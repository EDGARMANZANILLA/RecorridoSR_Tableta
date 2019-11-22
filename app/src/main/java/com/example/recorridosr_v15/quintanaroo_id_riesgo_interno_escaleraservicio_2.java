package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class quintanaroo_id_riesgo_interno_escaleraservicio_2 extends AppCompatActivity {
    private Spinner spin1, spin2, spin3, spin4, spin5, spin6, spin7, spin8, spin9, spin10;
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16, rb17, rb18,rb19,rb20;
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9, rg10;
    String vector[][] =new String[10][2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_interno_escaleraservicio_2);

        this.setTitle("Riesgo interno_chetumal");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //Asigna los Rg y rb del xml a los de aqui
        rg1= (RadioGroup) findViewById(R.id.Rg1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);

        rg2= (RadioGroup) findViewById(R.id.Rg2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);

        rg3= (RadioGroup) findViewById(R.id.Rg3);
        rb5 = (RadioButton) findViewById(R.id.rb5);
        rb6 = (RadioButton) findViewById(R.id.rb6);

        rg4= (RadioGroup) findViewById(R.id.Rg4);
        rb7 = (RadioButton) findViewById(R.id.rb7);
        rb8 = (RadioButton) findViewById(R.id.rb8);

        rg5= (RadioGroup) findViewById(R.id.Rg5);
        rb9 = (RadioButton) findViewById(R.id.rb9);
        rb10 = (RadioButton) findViewById(R.id.rb10);

        rg6= (RadioGroup) findViewById(R.id.Rg6);
        rb11 = (RadioButton) findViewById(R.id.rb11);
        rb12 = (RadioButton) findViewById(R.id.rb12);

        rg7= (RadioGroup) findViewById(R.id.Rg7);
        rb13 = (RadioButton) findViewById(R.id.rb13);
        rb14 = (RadioButton) findViewById(R.id.rb14);

        rg8= (RadioGroup) findViewById(R.id.Rg8);
        rb15 = (RadioButton) findViewById(R.id.rb15);
        rb16 = (RadioButton) findViewById(R.id.rb16);

        rg9= (RadioGroup) findViewById(R.id.Rg9);
        rb17 = (RadioButton) findViewById(R.id.rb17);
        rb18 = (RadioButton) findViewById(R.id.rb18);

        rg10= (RadioGroup) findViewById(R.id.Rg10);
        rb19 = (RadioButton) findViewById(R.id.rb19);
        rb20 = (RadioButton) findViewById(R.id.rb20);



        //asigna los espiner del xml a los espiner aqui declarados
        spin1 =(Spinner)findViewById(R.id.spinner1);
        spin2 =(Spinner)findViewById(R.id.spinner2);
        spin3 =(Spinner)findViewById(R.id.spinner3);
        spin4 =(Spinner)findViewById(R.id.spinner4);
        spin5 =(Spinner)findViewById(R.id.spinner5);
        spin6 =(Spinner)findViewById(R.id.spinner6);
        spin7 =(Spinner)findViewById(R.id.spinner7);
        spin8 =(Spinner)findViewById(R.id.spinner8);
        spin9 =(Spinner)findViewById(R.id.spinner9);
        spin10=(Spinner)findViewById(R.id.spinner10);

        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String [] opciones ={"Selecione:","BUENO","REGULAR","MALO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);

        //se asigna la variable adapter a cada espiner para mostrarle al usuario
        spin1.setAdapter(adapter);
        spin2.setAdapter(adapter);
        spin3.setAdapter(adapter);
        spin4.setAdapter(adapter);
        spin5.setAdapter(adapter);
        spin6.setAdapter(adapter);
        spin7.setAdapter(adapter);
        spin8.setAdapter(adapter);
        spin9.setAdapter(adapter);
        spin10.setAdapter(adapter);



        //Ocultar SPINNER
        spin1.setVisibility(View.GONE);
        spin2.setVisibility(View.GONE);
        spin3.setVisibility(View.GONE);
        spin4.setVisibility(View.GONE);
        spin5.setVisibility(View.GONE);
        spin6.setVisibility(View.GONE);
        spin7.setVisibility(View.GONE);
        spin8.setVisibility(View.GONE);
        spin9.setVisibility(View.GONE);
        spin10.setVisibility(View.GONE);







        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb1){
                    vector[0][0]="SI";
                    spin1.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb2) {
                    vector[0][0]="NO";
                    spin1.setVisibility(View.GONE);

                }

            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb3){

                    vector[1][0]="SI";
                    spin2.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb4) {

                    vector[1][0]="NO";
                    spin2.setVisibility(View.GONE);


                }

            }
        });


        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb5){
                    vector[2][0]="SI";
                    spin3.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb6) {

                    vector[2][0]="NO";
                    spin3.setVisibility(View.GONE);


                }

            }
        });


        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb7){

                    vector[3][0]="SI";
                    spin4.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb8) {

                    vector[3][0]="NO";
                    spin4.setVisibility(View.GONE);
                }

            }
        });


        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb9){
                    vector[4][0]="SI";
                    spin5.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb10) {

                    vector[4][0]="NO";
                    spin5.setVisibility(View.GONE);

                }

            }
        });


        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb11){

                    vector[5][0]="SI";
                    spin6.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb12) {

                    vector[5][0]="NO";
                    spin6.setVisibility(View.GONE);

                }

            }
        });



        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb13){

                    vector[6][0]="SI";
                    spin7.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb14) {

                    vector[6][0]="NO";
                    spin7.setVisibility(View.GONE);

                }

            }
        });


        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb15){

                    vector[7][0]="SI";
                    spin8.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb16) {

                    vector[7][0]="NO";
                    spin8.setVisibility(View.GONE);

                }

            }
        });


        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb17){

                    vector[8][0]="SI";
                    spin9.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb18) {

                    vector[8][0]="NO";
                    spin9.setVisibility(View.GONE);


                }

            }
        });


        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb19){

                    vector[9][0]="SI";
                    spin10.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb20) {

                    vector[9][0]="NO";
                    spin10.setVisibility(View.GONE);


                }

            }
        });


    }



    public void siguiente3(View view){
        Boolean bandera = true;


        //selecciona lo que carga el spinner
        vector[0][1] = spin1.getSelectedItem().toString();
        vector[1][1] = spin2.getSelectedItem().toString();
        vector[2][1] = spin3.getSelectedItem().toString();
        vector[3][1] = spin4.getSelectedItem().toString();
        vector[4][1] = spin5.getSelectedItem().toString();
        vector[5][1] = spin6.getSelectedItem().toString();
        vector[6][1] = spin7.getSelectedItem().toString();
        vector[7][1] = spin8.getSelectedItem().toString();
        vector[8][1] = spin9.getSelectedItem().toString();
        vector[9][1] = spin10.getSelectedItem().toString();


        if( vector[0][0]=="SI"){
            if(vector[0][1]=="Selecione:"){
                bandera= false;
            }

        }


        if( vector[1][0]=="SI"){
            if(vector[1][1]=="Selecione:"){
                bandera= false;
            }




        }


        if( vector[2][0]=="SI"){
            if(vector[2][1]=="Selecione:"){
                bandera= false;
            }

        }

        if( vector[3][0]=="SI"){
            if(vector[3][1]=="Selecione:"){
                bandera= false;
            }



        }

        if( vector[4][0]=="SI"){
            if(vector[4][1]=="Selecione:"){
                bandera= false;
            }


        }

        if( vector[5][0]=="SI"){
            if(vector[5][1]=="Selecione:"){
                bandera= false;
            }

        }

        if( vector[6][0]=="SI"){
            if(vector[6][1]=="Selecione:"){
                bandera= false;
            }

        }

        if( vector[7][0]=="SI"){
            if(vector[7][1]=="Selecione:"){
                bandera= false;
            }


        }

        if( vector[8][0]=="SI"){
            if(vector[8][1]=="Selecione:"){
                bandera= false;
            }


        }

        if( vector[9][0]=="SI"){
            if(vector[9][1]=="Selecione:"){
                bandera= false;
            }


        }



        if (bandera) {
            Toast.makeText(this, "vamos al siguiente", LENGTH_SHORT).show();



        } else {
            Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
        }



    }





}
