package com.example.a20240729teslachargerapplicationdesign;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MidCharger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mid_charger);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Add click listener for the "返回" button
        Button backButton=findViewById(R.id.button25);
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
    public void MiaoliTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:24.563722414629687, 120.81382110998501?q=tesla supercharger"));
        startActivity(i);
    }
    public void TaichungTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:24.163455941727886, 120.67420408342764?q=tesla supercharger"));
        startActivity(i);
    }
    public void ChangHuaTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:24.068831060479734, 120.55482218788259?=tesla supercharger"));
        startActivity(i);
    }
    public void YunlinTeslaSuperCharger(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:23.70953196108341, 120.44131737885986?q=tesla supercharger"));
    }
    public void NantoTeslaSuperCharger(View view)
    {
     Intent i=new Intent(Intent.ACTION_VIEW);
     i.setData(Uri.parse("geo:23.833647434398046, 120.99323474579853?q=tesla supercharger"));
    }
}