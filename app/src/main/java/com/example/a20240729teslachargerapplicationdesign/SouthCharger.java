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

public class SouthCharger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_south_charger);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Add click listener for the "返回" button
        Button backButton=findViewById(R.id.button27);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                finish();
            }
         });
    }
    public void ChiaYiCityTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:23.48297709318243, 120.4535434140187?q=tesla supercharger"));
        startActivity(i);
    }
    public void ChiaYiCountryTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:23.458016747602887, 120.24879342283523?q=tesla supercharger"));
        startActivity(i);
    }
    public void KaohsiungTeslaSuperCharger(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:22.624954216595725, 120.31593473048233?q=tesla supercharger"));
        startActivity(i);
    }
    public void TainanTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:22.99071641889257, 120.22789055615459?q=tesla supercharger"));
        startActivity(i);
    }
    public void PingTungTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("seo:22.54843046155712, 120.62955204396573?q=tesla supercharger"));
        startActivity(i);
    }
    public void PengHuTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:23.579659176434106, 119.59497292729763?q=tesla supercharger"));
        startActivity(i);
    }

}