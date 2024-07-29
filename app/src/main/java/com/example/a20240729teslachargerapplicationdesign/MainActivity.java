package com.example.a20240729teslachargerapplicationdesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Add click listener for the "北部充電樁" button
        Button northButton = findViewById(R.id.button2);
        northButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NorthCharger.class);
                startActivity(intent);
            }
        });
        //Add click listener for"中部充電樁"button
        Button midButton=findViewById(R.id.button3);
        midButton.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View v){
              Intent intent=new Intent(MainActivity.this,MidCharger.class);
              startActivity(intent);
          }
        });
        //Add click listener for"南部充電樁"button
        Button southButton=findViewById(R.id.button4);
        southButton.setOnClickListener(new View.OnClickListener()
       {
           public void onClick(View v)
           {
               Intent intent=new Intent(MainActivity.this,SouthCharger.class);
               startActivity(intent);

           }
       });
        //Add click listener for "東部充電樁"button
        Button eastButton=findViewById(R.id.button5);
        eastButton.setOnClickListener(new View.OnClickListener()
        {
         public void onClick(View v)
         {
          Intent intent=new Intent
          (MainActivity.this,EastCharger.class);
          startActivity(intent);
         }
        });
    }
}