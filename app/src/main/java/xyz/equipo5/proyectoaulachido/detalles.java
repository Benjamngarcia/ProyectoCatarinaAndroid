package xyz.equipo5.proyectoaulachido;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class detalles extends AppCompatActivity {
    TextView tvid,tvname,tvemail,tvcontact,tvmatricula,tvgrupo;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        tvid = findViewById(R.id.txtid);
        tvname = findViewById(R.id.txtname);
        tvemail = findViewById(R.id.txtemail);
        tvcontact = findViewById(R.id.txtcontact);
        tvmatricula = findViewById(R.id.txtmatricula);
        tvgrupo = findViewById(R.id.txtgrupo);



        Intent intent = getIntent();
        position = intent.getExtras().getInt("position");

        tvid.setText("ID: " + MainActivity.usuariosArrayList.get(position).getId());
        tvname.setText("Nombre: " + MainActivity.usuariosArrayList.get(position).getNombre());
        tvemail.setText("Correo: " + MainActivity.usuariosArrayList.get(position).getCorreo());
        tvcontact.setText("Teléfono: " + MainActivity.usuariosArrayList.get(position).getTelefono());
        tvmatricula.setText("Matrícula: " + MainActivity.usuariosArrayList.get(position).getMatricula());
        tvgrupo.setText("Grupo: " + MainActivity.usuariosArrayList.get(position).getGrupo());
    }
}