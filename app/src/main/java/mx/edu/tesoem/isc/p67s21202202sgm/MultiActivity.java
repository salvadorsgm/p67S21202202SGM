package mx.edu.tesoem.isc.p67s21202202sgm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MultiActivity extends AppCompatActivity {
    EditText txtnum1,txtnum2;
    Button btnmulti,btnregresar;
    TextView lblresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);
        btnregresar = findViewById(R.id.btnregresar);
        btnmulti = findViewById(R.id.btnmulti);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);


        lblresultado = findViewById(R.id.lblresultado);
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                int num1 = Integer.parseInt(txtnum1.getText().toString()) ;
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                lblresultado.setText("la suma es"+String.valueOf(num1*num2));
            }
        });
        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

}