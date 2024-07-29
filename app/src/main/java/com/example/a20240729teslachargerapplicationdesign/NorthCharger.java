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

public class NorthCharger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_north_charger);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Add click listener for the "返回" button
        Button backButton = findViewById(R.id.button26);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // This will close the current activity and return to the previous one
            }
        });
    }
    public void KeelungTeslaSuperCharger(View view)
    {
        Intent i =new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:25.127532429076116, 121.73952648232363?q=tesla supercharger"));
        startActivity(i);
    }
    public void TaipeiTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:25.032208787619034, 121.55759693563817?q=tesla supercharger"));
        startActivity(i);
    }
    public void NewTaipeiTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:25.06219406877244, 121.45996660287139?q=tesla supercharger"));
        startActivity(i);
    }
    public void YilanTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:24.589788198852663, 121.65934561511496?q=tesla supercharger"));
        startActivity(i);
    }
    public void TaoyuanTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:24.994201823608147, 121.29724783477648?q=tesla supercharger"));
        startActivity(i);
    }
    public void HsinchuCityTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:24.813280310917975, 120.96805406827507?q=tesla supercharger"));
        startActivity(i);
    }
    public void HisnchuCountryTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:24.692538981321082, 121.139235980007?q=tesla supercharger"));
        startActivity(i);
    }


}