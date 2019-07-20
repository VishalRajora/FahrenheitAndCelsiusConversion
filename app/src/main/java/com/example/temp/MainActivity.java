package com.example.temp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    TextView tv;
    EditText ev;
    Button button;
    RadioButton r,r1;
    Double d,d1,d2;
    public void convert(View view) {

         d = Double.parseDouble(ev.getText().toString());

        if (r.isChecked())
        {
            view.setBackgroundResource(R.color.CYAN);
             d1 = (d*9)/5+32;


             tv.setText(d1+" Degree F");
        }
        else
        {
            view.setBackgroundResource(R.color.yellow);
             d2=(d-32)*5/9;
            tv.setText(d2+" Degree C");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getSupportActionBar().hide();

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView);
        ev=(EditText)findViewById(R.id.editText);
        r=(RadioButton)findViewById(R.id.fn);
        r1=(RadioButton)findViewById(R.id.cs);

    }
}
