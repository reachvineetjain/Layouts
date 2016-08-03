package com.nehvin.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class VariousWidgets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_various_widgets);
    }

    public void onClickToggleButton(View view)
    {
        boolean on = ((ToggleButton) view).isChecked();
        if(on)
        {
            ((TextView) findViewById(R.id.textView4)).setText("On");
        }
        else
        {
            ((TextView) findViewById(R.id.textView4)).setText("Off");
        }
    }

    public void onClickToggleSwitch(View view)
    {
        boolean on = ((Switch) view).isChecked();
        if(on)
        {
            ((TextView) findViewById(R.id.textView5)).setText("On");
        }
        else
        {
            ((TextView) findViewById(R.id.textView5)).setText("Off");
        }
    }

    public void onClickCB(View view)
    {
//        CheckBox cbk_milk = (CheckBox) findViewById(R.id.checkBox_milk);
//        CheckBox cbk_sugar = (CheckBox) findViewById(R.id.checkBox_sugar);
        boolean b = ((CheckBox)view).isChecked();
        switch (view.getId())
        {
            case R.id.checkBox_milk:
                if(b)
                    ((TextView) findViewById(R.id.textView5)).setText("Milk");
                break;
            case R.id.checkBox_sugar:
                if(b)
                     ((TextView) findViewById(R.id.textView5)).setText("Sugar");
                break;
        }
    }

    public void onClickRB(View view)
    {
        RadioGroup RGrp = (RadioGroup) findViewById(R.id.radioGroup);
        int id = RGrp.getCheckedRadioButtonId();
//        if(id == -1)
//        {
//            ((TextView) findViewById(R.id.textView5)).setText("No RB Selected");
//        }
//        else
//        {
//            RadioButton rb = (RadioButton)view.findViewById(id);
//            ((TextView) findViewById(R.id.textView5)).setText(rb.getText());
//        }
        switch(id)
        {
            case(R.id.radioButton_android):
                ((TextView) findViewById(R.id.textView5)).setText(((RadioButton)view.findViewById(R.id.radioButton_android)).getText());
                break;
            case(R.id.radioButton_ios):
                ((TextView) findViewById(R.id.textView5)).setText(((RadioButton)view.findViewById(R.id.radioButton_ios)).getText());
                break;
        }
    }

    public void onClickSpinner(View view)
    {
        Spinner spin = (Spinner)findViewById(R.id.spinner);
        String str = String.valueOf(spin.getSelectedItem());
        ((TextView) findViewById(R.id.textView5)).setText(str);
    }
}