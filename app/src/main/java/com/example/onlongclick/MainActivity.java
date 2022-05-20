package com.example.onlongclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button)findViewById(R.id.b_escuchador)).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View View) {
                ((TextView)findViewById(R.id.tv_mensaje)).setText("  pulsacion larga ");
                return true;
            }
        });
        ((Button)findViewById(R.id.b_escuchador)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                ((TextView)findViewById(R.id.tv_mensaje)).setText(" pulsacion corta ");
            }
        });



    }
}