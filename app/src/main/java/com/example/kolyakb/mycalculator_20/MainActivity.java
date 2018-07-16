package com.example.kolyakb.mycalculator_20;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView_1, textView_2;
    Button one, two, three, four, five, six, seven, eight, nine, zero, clear, plus, minus, division, multiply, backspace, plus_minus, equal, dot;

    String enterText, historyText;

    Double result_1, result_2;

    static Boolean plusB, minusB, divisionB, multiplyB, oneB, twoB, threeB, fourB, fiveB, sixB, sevenB, eightB, nineB, zeroB, dotB, backspaceB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_2 = findViewById(R.id.textView_2);
        textView_1 = findViewById(R.id.textView_1);
        one = findViewById(R.id.one_id);
        two = findViewById(R.id.two_id);
        three = findViewById(R.id.three_id);
        four = findViewById(R.id.four_id);
        five = findViewById(R.id.five_id);
        six = findViewById(R.id.six_id);
        seven = findViewById(R.id.seven_id);
        eight = findViewById(R.id.eight_id);
        nine = findViewById(R.id.nine_id);
        zero = findViewById(R.id.zero_id);
        clear = findViewById(R.id.clear_id);
        plus = findViewById(R.id.plus_id);
        minus = findViewById(R.id.minus_id);
        division = findViewById(R.id.division_id);
        multiply = findViewById(R.id.multiply_id);
        backspace = findViewById(R.id.backspace_id);
        plus_minus = findViewById(R.id.minu_plus_id);
        equal = findViewById(R.id.equal_id);
        dot = findViewById(R.id.dot_id);


        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        clear.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        division.setOnClickListener(this);
        multiply.setOnClickListener(this);
        backspace.setOnClickListener(this);
        plus_minus.setOnClickListener(this);
        equal.setOnClickListener(this);
        dot.setOnClickListener(this);

        enterText = "";
        historyText = "";

        result_1 = 0.0;
        result_2 = 0.0;

        plusB = false;
        minusB = false;
        divisionB = false;
        multiplyB = false;
        oneB = false;
        twoB = false;
        threeB = false;
        fourB = false;
        fiveB = false;
        sixB = false;
        sevenB = false;
        eightB = false;
        nineB = false;
        zeroB = false;
        dotB = false;
        backspaceB = false;

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.one_id:

                enterText += "1";

                textView_2.setText(enterText);
                historyText += "1";
                textView_1.setText(historyText);



                one.setBackgroundColor(Color.rgb(255,148,77));
                two.setBackgroundColor(Color.rgb(0,0,0));
                three.setBackgroundColor(Color.rgb(0,0,0));
                four.setBackgroundColor(Color.rgb(0,0,0));
                five.setBackgroundColor(Color.rgb(0,0,0));
                six.setBackgroundColor(Color.rgb(0,0,0));
                seven.setBackgroundColor(Color.rgb(0,0,0));
                eight.setBackgroundColor(Color.rgb(0,0,0));
                nine.setBackgroundColor(Color.rgb(0,0,0));
                zero.setBackgroundColor(Color.rgb(0,0,0));
                clear.setBackgroundColor(Color.rgb(0,128,128));
                plus.setBackgroundColor(Color.rgb(0,128,128));
                minus.setBackgroundColor(Color.rgb(0,128,128));
                division.setBackgroundColor(Color.rgb(0,128,128));
                multiply.setBackgroundColor(Color.rgb(0,128,128));
                backspace.setBackgroundColor(Color.rgb(0,128,128));
                plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                equal.setBackgroundColor(Color.rgb(0,0,0));
                dot.setBackgroundColor(Color.rgb(0,0,0));


                break;

            case R.id.two_id:

                enterText += "2";

                textView_2.setText(enterText);
                historyText += "2";
                textView_1.setText(historyText);



                one.setBackgroundColor(Color.rgb(0,0,0));
                two.setBackgroundColor(Color.rgb(255,148,77));
                three.setBackgroundColor(Color.rgb(0,0,0));
                four.setBackgroundColor(Color.rgb(0,0,0));
                five.setBackgroundColor(Color.rgb(0,0,0));
                six.setBackgroundColor(Color.rgb(0,0,0));
                seven.setBackgroundColor(Color.rgb(0,0,0));
                eight.setBackgroundColor(Color.rgb(0,0,0));
                nine.setBackgroundColor(Color.rgb(0,0,0));
                zero.setBackgroundColor(Color.rgb(0,0,0));
                clear.setBackgroundColor(Color.rgb(0,128,128));
                plus.setBackgroundColor(Color.rgb(0,128,128));
                minus.setBackgroundColor(Color.rgb(0,128,128));
                division.setBackgroundColor(Color.rgb(0,128,128));
                multiply.setBackgroundColor(Color.rgb(0,128,128));
                backspace.setBackgroundColor(Color.rgb(0,128,128));
                plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                equal.setBackgroundColor(Color.rgb(0,0,0));
                dot.setBackgroundColor(Color.rgb(0,0,0));


                break;

            case R.id.three_id:

                enterText += "3";
                textView_2.setText(enterText);
                historyText += "3";
                textView_1.setText(historyText);



                one.setBackgroundColor(Color.rgb(0,0,0));
                two.setBackgroundColor(Color.rgb(0,0,0));
                three.setBackgroundColor(Color.rgb(255,148,77));
                four.setBackgroundColor(Color.rgb(0,0,0));
                five.setBackgroundColor(Color.rgb(0,0,0));
                six.setBackgroundColor(Color.rgb(0,0,0));
                seven.setBackgroundColor(Color.rgb(0,0,0));
                eight.setBackgroundColor(Color.rgb(0,0,0));
                nine.setBackgroundColor(Color.rgb(0,0,0));
                zero.setBackgroundColor(Color.rgb(0,0,0));
                clear.setBackgroundColor(Color.rgb(0,128,128));
                plus.setBackgroundColor(Color.rgb(0,128,128));
                minus.setBackgroundColor(Color.rgb(0,128,128));
                division.setBackgroundColor(Color.rgb(0,128,128));
                multiply.setBackgroundColor(Color.rgb(0,128,128));
                backspace.setBackgroundColor(Color.rgb(0,128,128));
                plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                equal.setBackgroundColor(Color.rgb(0,0,0));
                dot.setBackgroundColor(Color.rgb(0,0,0));


                break;

            case R.id.four_id:

                enterText += "4";
                textView_2.setText(enterText);
                historyText += "4";
                textView_1.setText(historyText);


                one.setBackgroundColor(Color.rgb(0,0,0));
                two.setBackgroundColor(Color.rgb(0,0,0));
                three.setBackgroundColor(Color.rgb(0,0,0));
                four.setBackgroundColor(Color.rgb(255,148,77));
                five.setBackgroundColor(Color.rgb(0,0,0));
                six.setBackgroundColor(Color.rgb(0,0,0));
                seven.setBackgroundColor(Color.rgb(0,0,0));
                eight.setBackgroundColor(Color.rgb(0,0,0));
                nine.setBackgroundColor(Color.rgb(0,0,0));
                zero.setBackgroundColor(Color.rgb(0,0,0));
                clear.setBackgroundColor(Color.rgb(0,128,128));
                plus.setBackgroundColor(Color.rgb(0,128,128));
                minus.setBackgroundColor(Color.rgb(0,128,128));
                division.setBackgroundColor(Color.rgb(0,128,128));
                multiply.setBackgroundColor(Color.rgb(0,128,128));
                backspace.setBackgroundColor(Color.rgb(0,128,128));
                plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                equal.setBackgroundColor(Color.rgb(0,0,0));
                dot.setBackgroundColor(Color.rgb(0,0,0));


                break;

            case R.id.five_id:

                enterText += "5";
                textView_2.setText(enterText);
                historyText += "5";
                textView_1.setText(historyText);


                one.setBackgroundColor(Color.rgb(0,0,0));
                two.setBackgroundColor(Color.rgb(0,0,0));
                three.setBackgroundColor(Color.rgb(0,0,0));
                four.setBackgroundColor(Color.rgb(0,0,0));
                five.setBackgroundColor(Color.rgb(255,148,77));
                six.setBackgroundColor(Color.rgb(0,0,0));
                seven.setBackgroundColor(Color.rgb(0,0,0));
                eight.setBackgroundColor(Color.rgb(0,0,0));
                nine.setBackgroundColor(Color.rgb(0,0,0));
                zero.setBackgroundColor(Color.rgb(0,0,0));
                clear.setBackgroundColor(Color.rgb(0,128,128));
                plus.setBackgroundColor(Color.rgb(0,128,128));
                minus.setBackgroundColor(Color.rgb(0,128,128));
                division.setBackgroundColor(Color.rgb(0,128,128));
                multiply.setBackgroundColor(Color.rgb(0,128,128));
                backspace.setBackgroundColor(Color.rgb(0,128,128));
                plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                equal.setBackgroundColor(Color.rgb(0,0,0));
                dot.setBackgroundColor(Color.rgb(0,0,0));


                break;

            case R.id.six_id:

                enterText += "6";
                textView_2.setText(enterText);
                historyText += "6";
                textView_1.setText(historyText);


                one.setBackgroundColor(Color.rgb(0,0,0));
                two.setBackgroundColor(Color.rgb(0,0,0));
                three.setBackgroundColor(Color.rgb(0,0,0));
                four.setBackgroundColor(Color.rgb(0,0,0));
                five.setBackgroundColor(Color.rgb(0,0,0));
                six.setBackgroundColor(Color.rgb(255,148,77));
                seven.setBackgroundColor(Color.rgb(0,0,0));
                eight.setBackgroundColor(Color.rgb(0,0,0));
                nine.setBackgroundColor(Color.rgb(0,0,0));
                zero.setBackgroundColor(Color.rgb(0,0,0));
                clear.setBackgroundColor(Color.rgb(0,128,128));
                plus.setBackgroundColor(Color.rgb(0,128,128));
                minus.setBackgroundColor(Color.rgb(0,128,128));
                division.setBackgroundColor(Color.rgb(0,128,128));
                multiply.setBackgroundColor(Color.rgb(0,128,128));
                backspace.setBackgroundColor(Color.rgb(0,128,128));
                plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                equal.setBackgroundColor(Color.rgb(0,0,0));
                dot.setBackgroundColor(Color.rgb(0,0,0));


                break;

            case R.id.seven_id:

                enterText += "7";
                textView_2.setText(enterText);
                historyText += "7";
                textView_1.setText(historyText);


                one.setBackgroundColor(Color.rgb(0,0,0));
                two.setBackgroundColor(Color.rgb(0,0,0));
                three.setBackgroundColor(Color.rgb(0,0,0));
                four.setBackgroundColor(Color.rgb(0,0,0));
                five.setBackgroundColor(Color.rgb(0,0,0));
                six.setBackgroundColor(Color.rgb(0,0,0));
                seven.setBackgroundColor(Color.rgb(255,148,77));
                eight.setBackgroundColor(Color.rgb(0,0,0));
                nine.setBackgroundColor(Color.rgb(0,0,0));
                zero.setBackgroundColor(Color.rgb(0,0,0));
                clear.setBackgroundColor(Color.rgb(0,128,128));
                plus.setBackgroundColor(Color.rgb(0,128,128));
                minus.setBackgroundColor(Color.rgb(0,128,128));
                division.setBackgroundColor(Color.rgb(0,128,128));
                multiply.setBackgroundColor(Color.rgb(0,128,128));
                backspace.setBackgroundColor(Color.rgb(0,128,128));
                plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                equal.setBackgroundColor(Color.rgb(0,0,0));
                dot.setBackgroundColor(Color.rgb(0,0,0));


                break;

            case R.id.eight_id:

                enterText += "8";
                textView_2.setText(enterText);
                historyText += "8";
                textView_1.setText(historyText);


                one.setBackgroundColor(Color.rgb(0,0,0));
                two.setBackgroundColor(Color.rgb(0,0,0));
                three.setBackgroundColor(Color.rgb(0,0,0));
                four.setBackgroundColor(Color.rgb(0,0,0));
                five.setBackgroundColor(Color.rgb(0,0,0));
                six.setBackgroundColor(Color.rgb(0,0,0));
                seven.setBackgroundColor(Color.rgb(0,0,0));
                eight.setBackgroundColor(Color.rgb(255,148,77));
                nine.setBackgroundColor(Color.rgb(0,0,0));
                zero.setBackgroundColor(Color.rgb(0,0,0));
                clear.setBackgroundColor(Color.rgb(0,128,128));
                plus.setBackgroundColor(Color.rgb(0,128,128));
                minus.setBackgroundColor(Color.rgb(0,128,128));
                division.setBackgroundColor(Color.rgb(0,128,128));
                multiply.setBackgroundColor(Color.rgb(0,128,128));
                backspace.setBackgroundColor(Color.rgb(0,128,128));
                plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                equal.setBackgroundColor(Color.rgb(0,0,0));
                dot.setBackgroundColor(Color.rgb(0,0,0));


                break;

            case R.id.nine_id:

                enterText += "9";
                textView_2.setText(enterText);
                historyText += "9";
                textView_1.setText(historyText);

                one.setBackgroundColor(Color.rgb(0,0,0));
                two.setBackgroundColor(Color.rgb(0,0,0));
                three.setBackgroundColor(Color.rgb(0,0,0));
                four.setBackgroundColor(Color.rgb(0,0,0));
                five.setBackgroundColor(Color.rgb(0,0,0));
                six.setBackgroundColor(Color.rgb(0,0,0));
                seven.setBackgroundColor(Color.rgb(0,0,0));
                eight.setBackgroundColor(Color.rgb(0,0,0));
                nine.setBackgroundColor(Color.rgb(255,148,77));
                zero.setBackgroundColor(Color.rgb(0,0,0));
                clear.setBackgroundColor(Color.rgb(0,128,128));
                plus.setBackgroundColor(Color.rgb(0,128,128));
                minus.setBackgroundColor(Color.rgb(0,128,128));
                division.setBackgroundColor(Color.rgb(0,128,128));
                multiply.setBackgroundColor(Color.rgb(0,128,128));
                backspace.setBackgroundColor(Color.rgb(0,128,128));
                plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                equal.setBackgroundColor(Color.rgb(0,0,0));
                dot.setBackgroundColor(Color.rgb(0,0,0));

                break;

            case R.id.zero_id:

                if (!textView_1.getText().equals("") ) {
                    enterText += "0";
                    textView_2.setText(enterText);
                    historyText += "0";
                    textView_1.setText(historyText);


                    one.setBackgroundColor(Color.rgb(0,0,0));
                    two.setBackgroundColor(Color.rgb(0,0,0));
                    three.setBackgroundColor(Color.rgb(0,0,0));
                    four.setBackgroundColor(Color.rgb(0,0,0));
                    five.setBackgroundColor(Color.rgb(0,0,0));
                    six.setBackgroundColor(Color.rgb(0,0,0));
                    seven.setBackgroundColor(Color.rgb(0,0,0));
                    eight.setBackgroundColor(Color.rgb(0,0,0));
                    nine.setBackgroundColor(Color.rgb(0,0,0));
                    zero.setBackgroundColor(Color.rgb(255,148,77));
                    clear.setBackgroundColor(Color.rgb(0,128,128));
                    plus.setBackgroundColor(Color.rgb(0,128,128));
                    minus.setBackgroundColor(Color.rgb(0,128,128));
                    division.setBackgroundColor(Color.rgb(0,128,128));
                    multiply.setBackgroundColor(Color.rgb(0,128,128));
                    backspace.setBackgroundColor(Color.rgb(0,128,128));
                    plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                    equal.setBackgroundColor(Color.rgb(0,0,0));
                    dot.setBackgroundColor(Color.rgb(0,0,0));
                }

                break;

            case R.id.clear_id:

                textView_2.setText("");
                textView_1.setText("");
                enterText = "";
                historyText = "";

                plusB = false;
                minusB = false;
                divisionB = false;
                multiplyB = false;



                one.setBackgroundColor(Color.rgb(0,0,0));
                two.setBackgroundColor(Color.rgb(0,0,0));
                three.setBackgroundColor(Color.rgb(0,0,0));
                four.setBackgroundColor(Color.rgb(0,0,0));
                five.setBackgroundColor(Color.rgb(0,0,0));
                six.setBackgroundColor(Color.rgb(0,0,0));
                seven.setBackgroundColor(Color.rgb(0,0,0));
                eight.setBackgroundColor(Color.rgb(0,0,0));
                nine.setBackgroundColor(Color.rgb(0,0,0));
                zero.setBackgroundColor(Color.rgb(0,0,0));
                clear.setBackgroundColor(Color.rgb(255,148,77));
                plus.setBackgroundColor(Color.rgb(0,128,128));
                minus.setBackgroundColor(Color.rgb(0,128,128));
                division.setBackgroundColor(Color.rgb(0,128,128));
                multiply.setBackgroundColor(Color.rgb(0,128,128));
                backspace.setBackgroundColor(Color.rgb(0,128,128));
                plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                equal.setBackgroundColor(Color.rgb(0,0,0));
                dot.setBackgroundColor(Color.rgb(0,0,0));


                break;

            case R.id.plus_id:

                if (!textView_1.getText().toString().equals("")) {

                    result_1 = Double.parseDouble(textView_2.getText().toString());

                    plusB = true;
                    minusB = false;
                    divisionB = false;
                    multiplyB = false;

                    historyText += "+";
                    textView_1.setText(historyText);
                    textView_2.setText("+");
                    enterText = "";



                    one.setBackgroundColor(Color.rgb(0,0,0));
                    two.setBackgroundColor(Color.rgb(0,0,0));
                    three.setBackgroundColor(Color.rgb(0,0,0));
                    four.setBackgroundColor(Color.rgb(0,0,0));
                    five.setBackgroundColor(Color.rgb(0,0,0));
                    six.setBackgroundColor(Color.rgb(0,0,0));
                    seven.setBackgroundColor(Color.rgb(0,0,0));
                    eight.setBackgroundColor(Color.rgb(0,0,0));
                    nine.setBackgroundColor(Color.rgb(0,0,0));
                    zero.setBackgroundColor(Color.rgb(0,0,0));
                    clear.setBackgroundColor(Color.rgb(0,128,128));
                    plus.setBackgroundColor(Color.rgb(255,148,77));
                    minus.setBackgroundColor(Color.rgb(0,128,128));
                    division.setBackgroundColor(Color.rgb(0,128,128));
                    multiply.setBackgroundColor(Color.rgb(0,128,128));
                    backspace.setBackgroundColor(Color.rgb(0,128,128));
                    plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                    equal.setBackgroundColor(Color.rgb(0,0,0));
                    dot.setBackgroundColor(Color.rgb(0,0,0));
                }

                break;

            case R.id.minus_id:

                if (!textView_1.getText().toString().equals("")) {

                    result_1 = Double.parseDouble(textView_2.getText().toString());

                    plusB = false;
                    minusB = true;
                    divisionB = false;
                    multiplyB = false;

                    historyText += "-";
                    textView_1.setText(historyText);
                    textView_2.setText("-");
                    enterText = "";


                    one.setBackgroundColor(Color.rgb(0,0,0));
                    two.setBackgroundColor(Color.rgb(0,0,0));
                    three.setBackgroundColor(Color.rgb(0,0,0));
                    four.setBackgroundColor(Color.rgb(0,0,0));
                    five.setBackgroundColor(Color.rgb(0,0,0));
                    six.setBackgroundColor(Color.rgb(0,0,0));
                    seven.setBackgroundColor(Color.rgb(0,0,0));
                    eight.setBackgroundColor(Color.rgb(0,0,0));
                    nine.setBackgroundColor(Color.rgb(0,0,0));
                    zero.setBackgroundColor(Color.rgb(0,0,0));
                    clear.setBackgroundColor(Color.rgb(0,128,128));
                    plus.setBackgroundColor(Color.rgb(0,128,128));
                    minus.setBackgroundColor(Color.rgb(255,148,77));
                    division.setBackgroundColor(Color.rgb(0,128,128));
                    multiply.setBackgroundColor(Color.rgb(0,128,128));
                    backspace.setBackgroundColor(Color.rgb(0,128,128));
                    plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                    equal.setBackgroundColor(Color.rgb(0,0,0));
                    dot.setBackgroundColor(Color.rgb(0,0,0));

                }

                break;

            case R.id.division_id:

                if (!textView_1.getText().toString().equals("")) {
                    result_1 = Double.parseDouble(textView_2.getText().toString());

                    plusB = false;
                    minusB = false;
                    divisionB = true;
                    multiplyB = false;

                    historyText += "/";
                    textView_1.setText(historyText);
                    textView_2.setText("/");
                    enterText = "";



                    one.setBackgroundColor(Color.rgb(0,0,0));
                    two.setBackgroundColor(Color.rgb(0,0,0));
                    three.setBackgroundColor(Color.rgb(0,0,0));
                    four.setBackgroundColor(Color.rgb(0,0,0));
                    five.setBackgroundColor(Color.rgb(0,0,0));
                    six.setBackgroundColor(Color.rgb(0,0,0));
                    seven.setBackgroundColor(Color.rgb(0,0,0));
                    eight.setBackgroundColor(Color.rgb(0,0,0));
                    nine.setBackgroundColor(Color.rgb(0,0,0));
                    zero.setBackgroundColor(Color.rgb(0,0,0));
                    clear.setBackgroundColor(Color.rgb(0,128,128));
                    plus.setBackgroundColor(Color.rgb(0,128,128));
                    minus.setBackgroundColor(Color.rgb(0,128,128));
                    division.setBackgroundColor(Color.rgb(255,148,77));
                    multiply.setBackgroundColor(Color.rgb(0,128,128));
                    backspace.setBackgroundColor(Color.rgb(0,128,128));
                    plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                    equal.setBackgroundColor(Color.rgb(0,0,0));
                    dot.setBackgroundColor(Color.rgb(0,0,0));

                }

                break;

            case R.id.multiply_id:

                if (!textView_1.getText().toString().equals("")) {

                    result_1 = Double.parseDouble(textView_2.getText().toString());

                    plusB = false;
                    minusB = false;
                    divisionB = false;
                    multiplyB = true;

                    historyText += "*";
                    textView_1.setText(historyText);
                    textView_2.setText("");
                    enterText = "";




                    one.setBackgroundColor(Color.rgb(0,0,0));
                    two.setBackgroundColor(Color.rgb(0,0,0));
                    three.setBackgroundColor(Color.rgb(0,0,0));
                    four.setBackgroundColor(Color.rgb(0,0,0));
                    five.setBackgroundColor(Color.rgb(0,0,0));
                    six.setBackgroundColor(Color.rgb(0,0,0));
                    seven.setBackgroundColor(Color.rgb(0,0,0));
                    eight.setBackgroundColor(Color.rgb(0,0,0));
                    nine.setBackgroundColor(Color.rgb(0,0,0));
                    zero.setBackgroundColor(Color.rgb(0,0,0));
                    clear.setBackgroundColor(Color.rgb(0,128,128));
                    plus.setBackgroundColor(Color.rgb(0,128,128));
                    minus.setBackgroundColor(Color.rgb(0,128,128));
                    division.setBackgroundColor(Color.rgb(0,128,128));
                    multiply.setBackgroundColor(Color.rgb(255,148,77));
                    backspace.setBackgroundColor(Color.rgb(0,128,128));
                    plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                    equal.setBackgroundColor(Color.rgb(0,0,0));
                    dot.setBackgroundColor(Color.rgb(0,0,0));

                }

                break;

            case R.id.backspace_id:

                if (!textView_2.getText().toString().equals("")) {
                    textView_2.setText(textView_2.getText().toString().substring(0, textView_2.getText().toString().length() - 1));
                    textView_1.setText("");
                    enterText = textView_2.getText().toString();
                    historyText = textView_2.getText().toString();





                    one.setBackgroundColor(Color.rgb(0,0,0));
                    two.setBackgroundColor(Color.rgb(0,0,0));
                    three.setBackgroundColor(Color.rgb(0,0,0));
                    four.setBackgroundColor(Color.rgb(0,0,0));
                    five.setBackgroundColor(Color.rgb(0,0,0));
                    six.setBackgroundColor(Color.rgb(0,0,0));
                    seven.setBackgroundColor(Color.rgb(0,0,0));
                    eight.setBackgroundColor(Color.rgb(0,0,0));
                    nine.setBackgroundColor(Color.rgb(0,0,0));
                    zero.setBackgroundColor(Color.rgb(0,0,0));
                    clear.setBackgroundColor(Color.rgb(0,128,128));
                    plus.setBackgroundColor(Color.rgb(0,128,128));
                    minus.setBackgroundColor(Color.rgb(0,128,128));
                    division.setBackgroundColor(Color.rgb(0,128,128));
                    multiply.setBackgroundColor(Color.rgb(0,128,128));
                    backspace.setBackgroundColor(Color.rgb(255,148,77));
                    plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                    equal.setBackgroundColor(Color.rgb(0,0,0));
                    dot.setBackgroundColor(Color.rgb(0,0,0));
                }

                break;

            case R.id.minu_plus_id:

                enterText += "-";
                textView_2.setText(enterText);
                historyText += "-";
                textView_1.setText(historyText);



                one.setBackgroundColor(Color.rgb(0,0,0));
                two.setBackgroundColor(Color.rgb(0,0,0));
                three.setBackgroundColor(Color.rgb(0,0,0));
                four.setBackgroundColor(Color.rgb(0,0,0));
                five.setBackgroundColor(Color.rgb(0,0,0));
                six.setBackgroundColor(Color.rgb(0,0,0));
                seven.setBackgroundColor(Color.rgb(0,0,0));
                eight.setBackgroundColor(Color.rgb(0,0,0));
                nine.setBackgroundColor(Color.rgb(0,0,0));
                zero.setBackgroundColor(Color.rgb(0,0,0));
                clear.setBackgroundColor(Color.rgb(0,128,128));
                plus.setBackgroundColor(Color.rgb(0,128,128));
                minus.setBackgroundColor(Color.rgb(0,128,128));
                division.setBackgroundColor(Color.rgb(0,128,128));
                multiply.setBackgroundColor(Color.rgb(0,128,128));
                backspace.setBackgroundColor(Color.rgb(0,128,128));
                plus_minus.setBackgroundColor(Color.rgb(255,148,77));
                equal.setBackgroundColor(Color.rgb(0,0,0));
                dot.setBackgroundColor(Color.rgb(0,0,0));

                break;

            case R.id.equal_id:

                try {

                    if (plusB) {
                        result_2 = result_1 + Double.parseDouble(textView_2.getText().toString());
                        textView_2.setText(result_2.toString());
                    } else if (minusB) {
                        result_2 = result_1 - Double.parseDouble(textView_2.getText().toString());
                        textView_2.setText(result_2.toString());
                    } else if (divisionB) {
                        result_2 = result_1 / Double.parseDouble(textView_2.getText().toString());
                        textView_2.setText(result_2.toString());
                    } else if (multiplyB) {
                        result_2 = result_1 * Double.parseDouble(textView_2.getText().toString());
                        textView_2.setText(result_2.toString());
                    }
                    enterText = textView_2.getText().toString();
                    plusB = false;
                    minusB = false;
                    divisionB = false;
                    multiplyB = false;



                    one.setBackgroundColor(Color.rgb(0,0,0));
                    two.setBackgroundColor(Color.rgb(0,0,0));
                    three.setBackgroundColor(Color.rgb(0,0,0));
                    four.setBackgroundColor(Color.rgb(0,0,0));
                    five.setBackgroundColor(Color.rgb(0,0,0));
                    six.setBackgroundColor(Color.rgb(0,0,0));
                    seven.setBackgroundColor(Color.rgb(0,0,0));
                    eight.setBackgroundColor(Color.rgb(0,0,0));
                    nine.setBackgroundColor(Color.rgb(0,0,0));
                    zero.setBackgroundColor(Color.rgb(0,0,0));
                    clear.setBackgroundColor(Color.rgb(0,128,128));
                    plus.setBackgroundColor(Color.rgb(0,128,128));
                    minus.setBackgroundColor(Color.rgb(0,128,128));
                    division.setBackgroundColor(Color.rgb(0,128,128));
                    multiply.setBackgroundColor(Color.rgb(0,128,128));
                    backspace.setBackgroundColor(Color.rgb(0,128,128));
                    plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                    equal.setBackgroundColor(Color.rgb(255,148,77));
                    dot.setBackgroundColor(Color.rgb(0,0,0));

                } catch (Exception e){

                    textView_2.setText("error");

                }

                break;

            case R.id.dot_id:

                if (!textView_1.getText().equals("") ){
                    enterText += ".";
                    textView_2.setText(enterText);
                    historyText += ".";
                    textView_1.setText(historyText);



                    one.setBackgroundColor(Color.rgb(0,0,0));
                    two.setBackgroundColor(Color.rgb(0,0,0));
                    three.setBackgroundColor(Color.rgb(0,0,0));
                    four.setBackgroundColor(Color.rgb(0,0,0));
                    five.setBackgroundColor(Color.rgb(0,0,0));
                    six.setBackgroundColor(Color.rgb(0,0,0));
                    seven.setBackgroundColor(Color.rgb(0,0,0));
                    eight.setBackgroundColor(Color.rgb(0,0,0));
                    nine.setBackgroundColor(Color.rgb(0,0,0));
                    zero.setBackgroundColor(Color.rgb(0,0,0));
                    clear.setBackgroundColor(Color.rgb(0,128,128));
                    plus.setBackgroundColor(Color.rgb(0,128,128));
                    minus.setBackgroundColor(Color.rgb(0,128,128));
                    division.setBackgroundColor(Color.rgb(0,128,128));
                    multiply.setBackgroundColor(Color.rgb(0,128,128));
                    backspace.setBackgroundColor(Color.rgb(0,128,128));
                    plus_minus.setBackgroundColor(Color.rgb(0,128,128));
                    equal.setBackgroundColor(Color.rgb(0,0,0));
                    dot.setBackgroundColor(Color.rgb(255,148,77));
                }

                break;
        }
    }
}
