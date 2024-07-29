package com.example.a20240729teslachargerapplicationdesign;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EastCharger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_east_charger);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Add click listener for the "返回" button
        Button backButton=findViewById(R.id.button28);
        backButton.setOnClickListener(new View.OnClickListener()
        {
          @Override
          public void onClick(View v)
          {
              finish();
          }
        }
        );
    }
    public void HuaLienTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:23.988721428076357, 121.60653682099837?q=tesla supercharger"));
        startActivity(i);
    }
    public void TaiTungTeslaSuperCharger(View view)
    {
     Intent i=new Intent(Intent.ACTION_VIEW);
     i.setData(Uri.parse("geo:22.758048710526634, 121.14399570991563?q=tesla supercharger"));
     startActivity(i);
    }
}