package com.example.saeed.quizapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submit(View view) {
        EditText text = (EditText) findViewById(R.id.Name_Field);
        String Name = text.getText().toString();

        CheckBox mangendercheck = (CheckBox) findViewById(R.id.Whipped_Cream_Checkbox);
        boolean mangender = mangendercheck.isChecked();
        Log.v("MainActivity", "mangender" + mangender);

        CheckBox womangendercheck = (CheckBox) findViewById(R.id.chocolate_Checkbox);
        boolean womangender = womangendercheck.isChecked();
        Log.v("MainActivity", "haschocolatechek:" + womangender);


        String pricemessage = createordersummery(mangender, womangender, Name);
        if (number > 5) {
            Toast.makeText(getApplicationContext(), "your number is: "+number, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, HappyActivity.class);
            intent.putExtra("pricemessage", pricemessage);
            startActivity(intent);
        } else if (number <= 5) {
            Toast.makeText(getApplicationContext(), "your number is: "+number, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, UnhappyActivity.class);
            intent.putExtra("pricemessage", pricemessage);
            startActivity(intent);
        }

    }

    private String createordersummery(boolean Addmangender, boolean Addwomangender, String Name) {
        String pricemessage = "" + Name;
        pricemessage += "\nMan Gender?" + Addmangender;
        pricemessage += "\nWoman Gender?" + Addwomangender;
        pricemessage += "\nyour number is: " + number;
        pricemessage += "\n Thank you";
        return pricemessage;

    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_messi:
                if (checked)
                    number += 1;
                break;
            case R.id.radio_ronaldo:
                if (checked)

                    break;
        }

        switch (view.getId()) {
            case R.id.radio_buffon:
                if (checked)
                    number += 1;
                break;
            case R.id.radio_casillas:
                if (checked)

                    break;
        }
        switch (view.getId()) {
            case R.id.radio_cavani:
                if (checked)
                    number += 1;
                break;
            case R.id.radio_iniesta:
                if (checked)

                    break;
        }


        switch (view.getId()) {
            case R.id.radio_ibrahimovic:
                if (checked)
                    number += 1;
                break;
            case R.id.radio_levandowski:
                if (checked)

                    break;
        }

        switch (view.getId()) {
            case R.id.radio_2_iniesta:
                if (checked)
                    number += 1;
                break;
            case R.id.radio_piuqe:
                if (checked)

                    break;
        }
        switch (view.getId()) {
            case R.id.radio_2_levandowski:
                if (checked)
                    number += 1;
                break;
            case R.id.radio_neymar:
                if (checked)

                    break;
        }
        switch (view.getId()) {
            case R.id.radio_2_neymar:
                if (checked)
                    number += 1;
                break;
            case R.id.radio_3_iniesta:
                if (checked)

                    break;
        }
        switch (view.getId()) {
            case R.id.radio_1_pique:
                if (checked)
                    number += 1;
                break;
            case R.id.radio_1_messi:
                if (checked)

                    break;
        }
        switch (view.getId()) {
            case R.id.radio_2_ronaldo:
                if (checked)
                    number += 1;
                break;
            case R.id.radio_2_messi:
                if (checked)

                    break;
        }
        switch (view.getId()) {
            case R.id.radio_2_casillas:
                if (checked)
                    number += 1;
                break;
            case R.id.radio_2_buffon:
                if (checked)

                    break;
        }
    }
}



