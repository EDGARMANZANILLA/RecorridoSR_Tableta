package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import java.io.File;

public class index_QuintanaRoo extends AppCompatActivity {

    static File directorio2;
    static File directorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index__quintana_roo);
        this.setTitle("Index");
        //Pantalla en vertical
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            directorio2 = new File(carpetaempresa_quintanaRoo.file());
    }

    public void Exterior_quintana (View view){
        //onClick(view, "Exterior");
        Intent ext = new Intent(this, quintanaroo_SeguridadExterior.class);
        ext.putExtra("File", directorio.getPath());
        startActivity(ext);
    }

    public void Analisis_quintana (View view){
        //onClick(view, "Analisis_de_recursos");
        Intent ext = new Intent(this, quintanaroo_AnalisisRecurso.class);
        ext.putExtra("File", directorio.getPath());
        startActivity(ext);
    }

    public void Circundantes_quintana (View view){
        //onClick(view, "Circundantes");
        Intent ext = new Intent(this, quintanaroo_RecursosCircundantes.class);
        ext.putExtra("File", directorio.getPath());
        startActivity(ext);
    }

    public void Anexo10 (View view){
        //onClick(view, "Anexo");
        Intent ext = new Intent(this, quintanaroo_anexo10.class);
        startActivity(ext);
    }



    public void Id_Riesgo (View view){
        //onClick(view, "Riesgos");
        Intent ext = new Intent(this, quintanaroo_id_riesgo.class);
        startActivity(ext);
    }

    public void Id_Señaletica (View view){
        //onClick(view, "Riesgos");
        Intent ext = new Intent(this, senaletica.class);
        startActivity(ext);
    }

    /*public void onClick(View v, String nombre){
            directorio = new File(directorio2.getPath(), nombre);
            directorio.mkdir();
    }*/

    static public String file(){
        return directorio2.getPath();
    }

}
