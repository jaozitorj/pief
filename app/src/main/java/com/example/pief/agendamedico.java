package com.example.pief;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class agendamedico extends AppCompatActivity {
    RadioGroup horas1;
    RadioButton btn1, btn2,btn3, btn4,btn5,btn6,btn7, btn8;
    RadioButton btn9, btn10,btn11, btn12,btn13,btn14,btn15, btn16;
    TextView tarde, manha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamedico);

        btn1 = findViewById(R.id.horas8);
        btn2 = findViewById(R.id.horas830);
        btn3 = findViewById(R.id.horas9);
        btn4 = findViewById(R.id.horas930);
        btn5 = findViewById(R.id.horas10);
        btn6 = findViewById(R.id.horas130);
        btn7 = findViewById(R.id.horas11);
        btn8 = findViewById(R.id.horas1130);

        tarde = findViewById(R.id.textView26);
        manha = findViewById(R.id.textView4);

        btn9 = findViewById(R.id.horas12);
        btn10 = findViewById(R.id.horas1230);
        btn11 = findViewById(R.id.horas13);
        btn12 = findViewById(R.id.horas1330);
        btn13 = findViewById(R.id.horas14);
        btn14 = findViewById(R.id.horas1430);
        btn15 = findViewById(R.id.horas15);
        btn16 = findViewById(R.id.horas1530);

        ImageButton voltar = findViewById(R.id.voltar);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));

                tarde.setVisibility(View.INVISIBLE);

                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));

                tarde.setVisibility(View.INVISIBLE);

                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));

                tarde.setVisibility(View.INVISIBLE);

                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));

                tarde.setVisibility(View.INVISIBLE);

                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));

                tarde.setVisibility(View.INVISIBLE);

                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));

                tarde.setVisibility(View.INVISIBLE);

                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));
                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));

                tarde.setVisibility(View.INVISIBLE);

                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));

                tarde.setVisibility(View.INVISIBLE);

                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));

                manha.setVisibility(View.INVISIBLE);

                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));

            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));

                manha.setVisibility(View.INVISIBLE);

                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));

                manha.setVisibility(View.INVISIBLE);

                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });


        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));

                manha.setVisibility(View.INVISIBLE);

                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });


        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));

                manha.setVisibility(View.INVISIBLE);

                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });


        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));

                manha.setVisibility(View.INVISIBLE);

                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });


        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));
                btn16.setEnabled(false);
                btn16.setTextColor(Color.parseColor("#FAFAFA"));

                manha.setVisibility(View.INVISIBLE);

                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setEnabled(false);
                btn9.setTextColor(Color.parseColor("#FAFAFA"));
                btn11.setEnabled(false);
                btn11.setTextColor(Color.parseColor("#FAFAFA"));
                btn12.setEnabled(false);
                btn12.setTextColor(Color.parseColor("#FAFAFA"));
                btn13.setEnabled(false);
                btn13.setTextColor(Color.parseColor("#FAFAFA"));
                btn14.setEnabled(false);
                btn14.setTextColor(Color.parseColor("#FAFAFA"));
                btn15.setEnabled(false);
                btn15.setTextColor(Color.parseColor("#FAFAFA"));
                btn10.setEnabled(false);
                btn10.setTextColor(Color.parseColor("#FAFAFA"));

                manha.setVisibility(View.INVISIBLE);

                btn8.setEnabled(false);
                btn8.setTextColor(Color.parseColor("#FAFAFA"));
                btn2.setEnabled(false);
                btn2.setTextColor(Color.parseColor("#FAFAFA"));
                btn3.setEnabled(false);
                btn3.setTextColor(Color.parseColor("#FAFAFA"));
                btn4.setEnabled(false);
                btn4.setTextColor(Color.parseColor("#FAFAFA"));
                btn5.setEnabled(false);
                btn5.setTextColor(Color.parseColor("#FAFAFA"));
                btn6.setEnabled(false);
                btn6.setTextColor(Color.parseColor("#FAFAFA"));
                btn7.setEnabled(false);
                btn7.setTextColor(Color.parseColor("#FAFAFA"));
                btn1.setEnabled(false);
                btn1.setTextColor(Color.parseColor("#FAFAFA"));
            }
        });


        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(agendamedico.this, servicos.class);
                startActivity(intent);
            }
        });



    }
}