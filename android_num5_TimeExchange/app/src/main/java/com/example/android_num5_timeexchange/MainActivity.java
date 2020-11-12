package com.example.android_num5_timeexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(theTime);
    }
    
    private View.OnClickListener theTime = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat time = new DecimalFormat("0");
            EditText year = (EditText)findViewById(R.id.edit1);
            EditText mouth = (EditText)findViewById(R.id.edit2);
            EditText day = (EditText)findViewById(R.id.edit3);
            EditText hour = (EditText)findViewById(R.id.edit4);
            EditText minute = (EditText)findViewById(R.id.edit5);
            EditText secord = (EditText)findViewById(R.id.edit6);

            int years = Integer.parseInt(year.getText().toString());
            int mouths = Integer.parseInt(mouth.getText().toString());
            int days = Integer.parseInt(day.getText().toString());
            int hours = Integer.parseInt(hour.getText().toString());
            int minutes = Integer.parseInt(minute.getText().toString());
            int secords = Integer.parseInt(secord.getText().toString());

            TextView Ymd = (TextView)findViewById(R.id.setYmd);
            Ymd.setText(time.format(years) + "/" + time.format(mouths) + "/" + time.format(days));
            TextView Hms = (TextView)findViewById(R.id.setHms);
            Hms.setText(time.format(hours) + ":" + time.format(minutes) + ":" + time.format(secords));
            TextView leap = (TextView)findViewById(R.id.setLeapYear);
            if (years % 4 == 0)
                leap.setText("是");
            else if (years % 100 == 0)
                leap.setText("是");
            else if (years % 400 == 0)
                leap.setText("是");
            else
                leap.setText("不是");
        }
    };
}
