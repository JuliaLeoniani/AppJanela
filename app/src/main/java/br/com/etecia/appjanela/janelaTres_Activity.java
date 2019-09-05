package br.com.etecia.appjanela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class janelaTres_Activity extends AppCompatActivity {
    Button btnJanela01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela_tres_layout);
        btnJanela01=(Button) findViewById(R.id.btnAbrirJanela1);
        btnJanela01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}
