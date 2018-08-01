package com.example.aluno.aula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        private Button btnTela2;
        private Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTela2 = (Button) findViewById(R.id.buttonTela2);

        buttonCalcular = (Button) findViewById(R.id.buttonCalcular);

        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //O que fazer quando clicar neste botão

                startActivity(new Intent(MainActivity.this, Tela2Activity.class));//primeiro tela em que estamos, tela que queremos ir
            }
        });

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Tela3Activity.class));
            }
        });
    }
}
