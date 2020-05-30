package com.example.buenosmodales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_gracias;
    private Button btn_estornudar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btn_gracias = (Button)findViewById(R.id.button_gracias);
         btn_estornudar = (Button) findViewById(R.id.button_estornudar);
          btn_gracias.setOnClickListener(graciasListener);
          btn_estornudar.setOnClickListener(estornudarListener);
    }

    private View.OnClickListener graciasListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"De nada",Toast.LENGTH_LONG).show();
        }
    };

    private View.OnClickListener estornudarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"Salud!",Toast.LENGTH_LONG).show();
        }
    };
}
