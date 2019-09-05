package br.com.etecia.appjanela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class janelaDois_Activity extends AppCompatActivity {
    Button btnAbrirJanela03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela_dois_layout);

        btnAbrirJanela03 = (Button) findViewById(R.id.btnAbrirJanela3);
        btnAbrirJanela03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), janelaTres_Activity.class));
            }
        });
    }
}
