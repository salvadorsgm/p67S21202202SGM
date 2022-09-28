package mx.edu.tesoem.isc.p67s21202202sgm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {

    Button btnsuma,btnresta,btnmulti,btndivicion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btnmulti = findViewById(R.id.bntmulti);
        btndivicion = findViewById(R.id.btndivicion);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(PrincipalActivity.this,SumaActivity.class);
                startActivity(intent);
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rest = new Intent(PrincipalActivity.this,RestaActivity.class);
                startActivity(rest);
            }
        });

    }
}