package com.example.aluno.aula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Tela3Activity extends AppCompatActivity {
//salgado
    private  Button salgadoMais;
    private Button salgadoMenos;
    private TextView qtdSalgado;
    private double valorSalgado;
//refri
    private Button refriMais;
    private Button menosRefri;
    private TextView qtdRefri;
    private double valorRefri;

    //Bolo
    private Button maisBolo;
    private Button menosBolo;
    private TextView qtdBolo;
    private double valorBolo;



    private int a;
    private TextView preco;
    private double total;
    private DecimalFormat df;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        df = new DecimalFormat("#0.00");

        //Padrão em todos
        preco= (TextView) findViewById(R.id.preco);
        a=0;


        //Salgado
        salgadoMais = (Button) findViewById(R.id.salgadoMais);
        salgadoMenos = (Button) findViewById(R.id.salgadoMenos);
        qtdSalgado = (TextView) findViewById(R.id.qtdSalgado);
        valorSalgado=3.80;


        salgadoMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                   a= a+1;
                qtdSalgado.setText(""+a);

                double valorS= 0.0;
                        valorS= a*valorSalgado;

                preco.setText(""+ df.format(valorS));


            }
        });

        salgadoMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 a= a-1;

                qtdSalgado.setText(""+a);

                double valorS= 0.0;
                valorS= a*valorSalgado;

                preco.setText(""+ df.format(valorS));

            }
        });

        //Refrigerante

        refriMais= (Button) findViewById(R.id.refriMais);
        menosRefri= (Button) findViewById(R.id.menosRefri);
        qtdRefri= (TextView) findViewById(R.id.qtdRefri);
        valorRefri= 1.50;

        refriMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a= a+1;

                qtdRefri.setText(""+a);

                double valorR= 0.0;
                valorR= a*valorRefri;

                preco.setText(""+ df.format(valorR));

            }
        });

        menosRefri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a= a-1;

                qtdRefri.setText(""+a);

                double valorR= 0.0;
                valorR= a*valorRefri;

                preco.setText(""+ df.format(valorR));

            }
        });

        //Bolo

        maisBolo = (Button) findViewById(R.id.maisBolo);
         menosBolo= (Button) findViewById(R.id.menosBolo);
        qtdBolo = (TextView) findViewById(R.id.qtdBolo);
        valorBolo= 2.00;


        maisBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a= a+1;

                qtdBolo.setText(""+a);

                double valorB= 0.0;
                valorB= a*valorBolo;

                preco.setText(""+ df.format(valorB));

            }
        });

        menosBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= a-1;

                qtdBolo.setText(""+a);

                double valorB= 0.0;
                valorB= a*valorBolo;

                preco.setText(""+ df.format(valorB));
            }
        });


        //total =0.0;

       // total= qtdSalgado + qtdRefri + qtdBolo;
         //   preco.setText(""+ df.format(total));

    }
            }
