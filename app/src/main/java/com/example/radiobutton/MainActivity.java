package com.example.radiobutton;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup group=(RadioGroup)findViewById(R.id.radioGroup);
        RadioButton red=(RadioButton)findViewById(R.id.rb_red);
        RadioButton blue=(RadioButton)findViewById(R.id.rb_blue);
        RadioButton green=(RadioButton)findViewById(R.id.rb_green);
        final LinearLayout container=(LinearLayout)findViewById(R.id.container);
        if(red.isChecked())
            container.setBackgroundColor(Color.rgb(255, 0, 0));
        else if(blue.isChecked())
            container.setBackgroundColor(Color.rgb(0, 0, 255));
        else if(green.isChecked())
            container.setBackgroundColor(Color.rgb(0, 255, 0));

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_red:
                        container.setBackgroundColor(Color.rgb(255, 0, 0));
                        break;
                    case R.id.rb_blue:
                        container.setBackgroundColor(Color.rgb(0, 0, 255));
                        break;
                    case R.id.rb_green:
                        container.setBackgroundColor(Color.rgb(0, 255, 0));
                        break;

                }
            }
        });


    }

}
