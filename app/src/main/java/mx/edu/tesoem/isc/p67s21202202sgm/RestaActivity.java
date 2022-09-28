package mx.edu.tesoem.isc.p67s21202202sgm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RestaActivity extends AppCompatActivity {
    EditText txtnum1,txtnum2;
    Button btnresta,btnregresar;
    TextView lblresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        btnregresar = findViewById(R.id.btnregresar);
        btnresta = findViewById(R.id.btnresta);


        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);


        lblresultado = findViewById(R.id.lblresultado);
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                int num1 = Integer.parseInt(txtnum1.getText().toString()) ;
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                lblresultado.setText("la suma es"+String.valueOf(num1-num2));
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