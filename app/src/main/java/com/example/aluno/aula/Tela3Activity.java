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
    private double valorSalgado = 3.80;
    int salgados = 0;
//refri
    private Button refriMais;
    private Button menosRefri;
    private TextView qtdRefri;
    private double valorRefri = 1.50;
    int refris = 0;

    //Bolo
    private Button maisBolo;
    private Button menosBolo;
    private TextView qtdBolo;
    private double valorBolo = 2.00;
    int bolos = 0;


    private Button botaoCalcular;




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



        //Salgado
        salgadoMais = (Button) findViewById(R.id.salgadoMais);
        salgadoMenos = (Button) findViewById(R.id.salgadoMenos);
        qtdSalgado = (TextView) findViewById(R.id.qtdSalgado);
        valorSalgado=3.80;


        salgadoMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                   salgados= salgados+1;
                qtdSalgado.setText(""+salgados);
                calcularTotal();


            }
        });

        salgadoMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 salgados = salgados-1;

                qtdSalgado.setText(""+salgados);

                calcularTotal();


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

                refris= refris+1;


                qtdRefri.setText(""+refris);

                calcularTotal();


            }
        });

        menosRefri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                refris= refris-1;

                qtdRefri.setText(""+refris);

                calcularTotal();


            }
        });

        //Bolo

        maisBolo = (Button) findViewById(R.id.maisBolo);
         menosBolo= (Button) findViewById(R.id.menosBolo);
        qtdBolo = (TextView) findViewById(R.id.qtdBolo);



        maisBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bolos = bolos+1;

                qtdBolo.setText(""+bolos);

                calcularTotal();

            }
        });

        menosBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bolos= bolos-1;

                qtdBolo.setText(""+bolos);

                calcularTotal();

            }
        });


    }

    public void calcularTotal(){

        double valor = 0;
        valor = ((bolos*valorBolo) + (refris*valorRefri) + (salgados*valorSalgado)) ;

        preco.setText(""+ df.format(valor));

    }

        botaoCalcular.OnClickListener(new Button)
        @Override
        public void onClick(View v) {

        }


}
