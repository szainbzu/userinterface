package edu.cs.birzeit.userinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chk1_onClick(View view) {
        CheckBox chk1 = (CheckBox)view;
        String str = "";
        if(chk1.isChecked()){
             str = "Option1 is Checked";
        }
        else{
            str = "Option1 is unchecked";
        }
        Toast.makeText(this, str,
                Toast.LENGTH_SHORT).show();
    }

    public void swt_OnClick(View view) {
        Switch swt = (Switch)view;
        String info = "";
        if(swt.isChecked()){
            info = "The switch is on";
        }
        else{
            info = "The switch is of";
        }
        displayInfo(info);
    }

    private void displayInfo(String info) {
        Toast.makeText(this, info,
                Toast.LENGTH_SHORT).show();
    }

    public void btnNext_OnClick(View view) {
        RadioButton rdo1 = findViewById(R.id.rdo1);
        RadioButton rdo2 = findViewById(R.id.rdo2);
        
        if(rdo1.isChecked()){
            displayInfo("Rdo1 is checked");
        }
        else{
            displayInfo("Rdo2 is checked.");
        }
    }
}
