package com.example.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText vl1;
    EditText vl2;
    Button btSomar;
    Button btSubtrair;
    Button btMultiplicar;
    Button btDividr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vl1 = (EditText)findeViewById(R.id.editTextNumberDecimal2);
        vl2 = (EditText)findeViewById(R.id.editTextNumberDecimal3);
        btSomar = (Button)findViewById(R.id.Somar);
        btSubtrair = (Button)findViewById(R.id.Subtrair);
        btMultiplicar = (Button)findViewById(R.id.Multiplicar);
        btDividr = (Button)findViewById(R.id.Dividir);

        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valor1;
                Double valor2;
                Double result;
                valor1 = Double.parseDouble(vl1.getText().toString());
                valor2 = Double.parseDouble(vl2.getText().toString());
                if(valor1 != null){
                    if(valor2 !=null || valor2 > 0){
                        result = valor1+valor2;
                            AlertDialog.Builder alert = new AlertDialog.Builder(context);
                            alert.setTitle("Resultado"); // Titulo
                            alert.setMessage("O resultado é: "+result); // mensagem
                            alert.setPositiveButton("Botao", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    // Fecho o botao
                                    dialogInterface.dismiss();
                                }
                            });
                            alert.show();
                    }else{
                        AlertDialog.Builder alert = new AlertDialog.Builder(context);
                        alert.setTitle("Resultado"); // Titulo
                        alert.setMessage("Numero inválido"); // mensagem
                        alert.setPositiveButton("Botao", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Fecho o botao
                                dialogInterface.dismiss();
                            }
                        });
                        alert.show();
                    }
                }else{
                    AlertDialog.Builder alert = new AlertDialog.Builder(context);
                    alert.setTitle("Resultado"); // Titulo
                    alert.setMessage("Numero Inválido"); // mensagem
                    alert.setPositiveButton("Botao", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            // Fecho o botao
                            dialogInterface.dismiss();
                        }
                    });
                    alert.show();
                }

            }
        });

        btSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valor1;
                Double valor2;
                Double result;
                valor1 = Double.parseDouble(vl1.getText().toString());
                valor2 = Double.parseDouble(vl2.getText().toString());
                if(valor1 != null){
                    if(valor2 !=null || valor2 > 0){
                        result = valor1-valor2;
                        AlertDialog.Builder alert = new AlertDialog.Builder(context);
                        alert.setTitle("Resultado"); // Titulo
                        alert.setMessage("O resultado é: "+result); // mensagem
                        alert.setPositiveButton("Botao", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Fecho o botao
                                dialogInterface.dismiss();
                            }
                        });
                        alert.show();
                    }else{
                        AlertDialog.Builder alert = new AlertDialog.Builder(context);
                        alert.setTitle("Resultado"); // Titulo
                        alert.setMessage("Numero inválido"); // mensagem
                        alert.setPositiveButton("Botao", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Fecho o botao
                                dialogInterface.dismiss();
                            }
                        });
                        alert.show();
                    }
                }else{
                    AlertDialog.Builder alert = new AlertDialog.Builder(context);
                    alert.setTitle("Resultado"); // Titulo
                    alert.setMessage("Numero Inválido"); // mensagem
                    alert.setPositiveButton("Botao", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            // Fecho o botao
                            dialogInterface.dismiss();
                        }
                    });
                    alert.show();
                }
            }
        });

        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valor1;
                Double valor2;
                Double result;
                valor1 = Double.parseDouble(vl1.getText().toString());
                valor2 = Double.parseDouble(vl2.getText().toString());
                if(valor1 != null){
                    if(valor2 !=null || valor2 > 0){
                        result = valor1*valor2;
                        AlertDialog.Builder alert = new AlertDialog.Builder(context);
                        alert.setTitle("Resultado"); // Titulo
                        alert.setMessage("O resultado é: "+result); // mensagem
                        alert.setPositiveButton("Botao", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Fecho o botao
                                dialogInterface.dismiss();
                            }
                        });
                        alert.show();
                    }else{
                        AlertDialog.Builder alert = new AlertDialog.Builder(context);
                        alert.setTitle("Resultado"); // Titulo
                        alert.setMessage("Numero inválido"); // mensagem
                        alert.setPositiveButton("Botao", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Fecho o botao
                                dialogInterface.dismiss();
                            }
                        });
                        alert.show();
                    }
                }else{
                    AlertDialog.Builder alert = new AlertDialog.Builder(context);
                    alert.setTitle("Resultado"); // Titulo
                    alert.setMessage("Numero Inválido"); // mensagem
                    alert.setPositiveButton("Botao", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            // Fecho o botao
                            dialogInterface.dismiss();
                        }
                    });
                    alert.show();
                }
            }
        });

        btDividr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valor1;
                Double valor2;
                Double result;
                valor1 = Double.parseDouble(vl1.getText().toString());
                valor2 = Double.parseDouble(vl2.getText().toString());
                if(valor1 != null){
                    if(valor2 !=null || valor2 > 0){
                        result = valor1/valor2;
                        AlertDialog.Builder alert = new AlertDialog.Builder(context);
                        alert.setTitle("Resultado"); // Titulo
                        alert.setMessage("O resultado é: "+result); // mensagem
                        alert.setPositiveButton("Botao", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Fecho o botao
                                dialogInterface.dismiss();
                            }
                        });
                        alert.show();
                    }else{
                        AlertDialog.Builder alert = new AlertDialog.Builder(context);
                        alert.setTitle("Resultado"); // Titulo
                        alert.setMessage("Numero inválido"); // mensagem
                        alert.setPositiveButton("Botao", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Fecho o botao
                                dialogInterface.dismiss();
                            }
                        });
                        alert.show();
                    }
                }else{
                    AlertDialog.Builder alert = new AlertDialog.Builder(context);
                    alert.setTitle("Resultado"); // Titulo
                    alert.setMessage("Numero Inválido"); // mensagem
                    alert.setPositiveButton("Botao", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            // Fecho o botao
                            dialogInterface.dismiss();
                        }
                    });
                    alert.show();
                }
            }
        });

    }
}