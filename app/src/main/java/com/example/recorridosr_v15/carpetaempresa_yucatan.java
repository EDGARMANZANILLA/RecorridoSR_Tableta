package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;

import static android.widget.Toast.LENGTH_SHORT;

public class carpetaempresa_yucatan extends AppCompatActivity {
    private EditText et1;
    static File directorio2;
    static File directorio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carpetaempresa_yucatan);
        this.setTitle("Yucatan");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        directorio2 = new File(getIntent().getStringExtra("File"));
        et1  = (EditText) findViewById(R.id.editText);
    }
    public void inicio_yucatan (View view){
        if (et1.length() == 0) {
            Toast.makeText(this, "REVISA LOS DATOS E INTENTA DE NUEVO", LENGTH_SHORT).show();
        }else{
            onClick(view, et1.getText().toString());
            Intent ext = new Intent(this, index_Yucatan.class);
            ext.putExtra("File", directorio.getPath());
            startActivity(ext);
        }
    }

    public void onClick(View v, String nombre){
        directorio = new File(directorio2.getPath(),nombre);
        directorio.mkdir();
    }
}
