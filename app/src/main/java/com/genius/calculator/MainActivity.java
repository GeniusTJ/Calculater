package com.genius.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Int2;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    double in1 = 0, i2 = 0;
    EditText editTextNumber;
    boolean Add, Sub, Multiply, Divide, Remainder, deci, Clear;
    Button button, button2, button3, button4, button5, button6, button7, button8, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);

        editTextNumber = (EditText) findViewById(R.id.display);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNumber.setText(editTextNumber.getText() + "7");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  NumberEntered =editTextNumber.getText().toString();
                if(NumberEntered.length() >0) {
                    NumberEntered = NumberEntered.substring(0, NumberEntered.length() - 1);
                    editTextNumber.setText(NumberEntered);
                }

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNumber.setText(editTextNumber.getText() + "8");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNumber.setText(editTextNumber.getText() + "9");
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNumber.setText(editTextNumber.getText() + "4");
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNumber.setText(editTextNumber.getText() + "5");
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNumber.setText(editTextNumber.getText() + "6");
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNumber.setText(editTextNumber.getText() + "1");
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNumber.setText(editTextNumber.getText() + "2");
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNumber.setText(editTextNumber.getText() + "3");
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNumber.setText(editTextNumber.getText() + "0");
            }
        });
        //functions
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextNumber.getText().length() != 0) {
                    in1 = Float.parseFloat(editTextNumber.getText() + "");
                    Add = true;
                    deci = false;
                    editTextNumber.setText(null);
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextNumber.getText().length() != 0) {
                    in1 = Float.parseFloat(editTextNumber.getText() + "");
                    Sub = true;
                    deci = false;
                    editTextNumber.setText(null);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextNumber.getText().length() != 0) {
                    in1 = Float.parseFloat(editTextNumber.getText() + "");
                    Multiply = true;
                    deci = false;
                    editTextNumber.setText(null);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextNumber.getText().length() != 0) {
                    in1 = Float.parseFloat(editTextNumber.getText() + "");
                    Divide = true;
                    deci = false;
                    editTextNumber.setText(null);
                }
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextNumber.getText().length() !=0){
                    in1 = Float.parseFloat(editTextNumber.getText() + "");
                    Remainder = true;
                    deci = false;
                    editTextNumber.setText(null);
                }
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Add || Sub || Multiply || Divide ||Remainder ) {
                    i2 = Float.parseFloat(editTextNumber.getText() + "");
                }
                if (Add) {
                    editTextNumber.setText(in1 + i2 + "");
                    Add = false;
                }
                if (Sub) {
                    editTextNumber.setText(in1 - i2 + "");
                    Sub = false;
                }
                if (Multiply) {
                    editTextNumber.setText(in1 * i2 + "");
                    Multiply = false;
                }
                if (Divide) {
                    editTextNumber.setText(in1 / i2 + "");
                    Divide = false;
                }
                if (Remainder){
                    editTextNumber.setText(in1 % i2 + "");
                    Remainder = false;
                }

        }});
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editTextNumber.setText("");
                in1 = 0.0;
                i2 = 0.0;
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (deci) {
                    //do nothing or you can show the error
                } else {
                    editTextNumber.setText(editTextNumber.getText() + ".");
                    deci = true;

                }
            }
        });

    }
}