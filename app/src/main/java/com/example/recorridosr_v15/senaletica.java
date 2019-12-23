package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class senaletica extends AppCompatActivity {

    private static File directorio2;
    private static File directorio;
    private static File pdfFile;
    static int i = 0;
    static String señaleticas = "";
    Button boton ;
    static String vector[] = {"", "", "", ""};
    EditText et1, et2, et3;
    private String htmlToPDF;
    TextView tv1;
    static ArrayList<String> fotosFile = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senaletica);

        directorio2 = new File(index_QuintanaRoo.file());
        if(directorio2 != null) {
            pdfFile = new File(directorio2.getPath(), "Señaletica.pdf");
            directorio = new File(index_QuintanaRoo.file(), "fotos");
            directorio.mkdirs();
        }

        et1  = (EditText) findViewById(R.id.et1);
        et2  = (EditText) findViewById(R.id.et2);
        et3  = (EditText) findViewById(R.id.et3);
        tv1 = (TextView) findViewById(R.id.tv1);
        boton = (Button) findViewById(R.id.bt1);


        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[0]   = et1.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[1]   = et2.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[2]   = et3.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

    }

    public void onClickFoto(View view) {
        File mi_foto = new File( directorio.getPath(), vector[0]+i+".jpg" );
        try {
            mi_foto.createNewFile();
        } catch (IOException ex) {
            Log.e("ERROR ", "Error:" + ex);
        }
        //
        Uri uri = Uri.fromFile( mi_foto );
        //Abre la camara para tomar la foto
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //Guarda imagen
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
        fotosFile.add(i,mi_foto.getPath());
        i++;
        //Retorna a la actividad
        startActivityForResult(cameraIntent, 0);
    }

    public void generarPdf (View view){

        try {

            Document document = new Document(PageSize.LETTER.rotate());
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFile.getPath()));

            document.open();
            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
            //String htmlToPDF="<html><head></head><body><h1>Hola que tal</h1><p>Shalalala que pazo</p></body></html>";
            htmlToPDF="<html>" +
                    "<head>" +
                    "<title>Señaletica</title>" +
                    "</head>" +
                    "<body>" +
                    "Señaletica"+
                    "<TABLE border=\"1\" WIDTH=\"100%\" style=\"text-align:center;\">" +
        /*"<colgroup>" +
        "<col style=\"width: 20%\"/>" +
        "<col style=\"width: 40%\"/>" +
        "<col style=\"width: 40%\"/>" +
        "</colgroup>" +*/
                    "<thead>" +
                    "<tr>" +
                    "<th colspan=\"4\">Señaletica</th>" +
                    "</tr>" +
                    "<tr>" +
                    "<th WIDTH=\"20%\">Nombre</th>" +
                    "<th WIDTH=\"10%\">Cantidad</th>" +
                    "<th WIDTH=\"25%\">Ubicacion</th>" +
                    "<th WIDTH=\"45%\">Fotos</th>" +
                    "</tr>" +
                    "</thead>" +
                    "<tbody>" +
                    señaleticas;


            /*htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Otros, especificar:</th>";
            agregarColumna(vector[38], et39.getText().toString());
            */

            htmlToPDF= htmlToPDF +"</tbody>" + "</table>" + "</body>" + "</html>";

            worker.parseXHtml(pdfWriter, document, new StringReader(htmlToPDF));

            document.close();

            Intent intent = new Intent(this, com.example.recorridosr_v15.ViewPdf.class);
            intent.putExtra("File", pdfFile.getPath());
            startActivity(intent);

        } catch (IOException e) {
            Toast.makeText(this,"NO SE PUDO GENERAR EL DOCUMENTO", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } catch (DocumentException e) {
            Toast.makeText(this,"NO SE PUDO GENERAR EL DOCUMENTO", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }

    }

    public void agregarSeñaletica(View view){
        señaleticas=señaleticas +
                "<tr>" +
                "<td>"+vector[0]+"</td>" +
                "<td>"+vector[1]+"</td>" +
                "<td>"+vector[2]+"</td>" +
                "<td>";

        for(int x = 0; x<i; x++){
            señaleticas = señaleticas +
                    "<img src='"+fotosFile.get(x)+ "' width='50' height='50'></img>";
            señaleticas = señaleticas + " ";
        }

        señaleticas=señaleticas +
                "</td>" +
                "</tr>";

        i=0;
        fotosFile.clear();
    }

}