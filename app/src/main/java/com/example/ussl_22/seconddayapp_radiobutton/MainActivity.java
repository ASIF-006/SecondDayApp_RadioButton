package com.example.ussl_22.seconddayapp_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        //is the button now checked?
        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.radio_pirates:
                if (checked)
                    //pirates are the best
                    Log.d("mainActivity", "Pirates are the best");
                break;
            case R.id.radio_ninjas:
                if(checked)
                    //ninjas rule
                    Log.d("mainActivity", "Ninjas rules");
                break;
        }
    }
}
