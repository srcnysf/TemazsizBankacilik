package com.example.sercanyusuf.temazsizbankacilik;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlisverisSonucu extends AppCompatActivity {

    private Button btnCard1, btnCard2, btnCard3, btnOdemeYap;
    private TextView tvFiyat, tvIban, tvFirmaAdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alisveris_sonucu);

        btnCard1=(Button)findViewById(R.id.btnCard1);
        btnCard2=(Button)findViewById(R.id.btnCard2);
        btnCard3=(Button)findViewById(R.id.btnCard3);
        btnOdemeYap=(Button)findViewById(R.id.btnOdemeYap);

        tvFiyat=(TextView)findViewById(R.id.tvFiyat);
        tvIban=(TextView)findViewById(R.id.tvIban);
        tvFirmaAdi=(TextView)findViewById(R.id.tvFirmaAdi);


        btnCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        btnCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        btnCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


        btnOdemeYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        Bundle paket= getIntent().getExtras();
        String iban= paket.getString("iban");
        String firmaAdi= paket.getString("firmaAdi");
       int tutar = Integer.parseInt(paket.getString("tutar"));


        tvFiyat.setText(String.valueOf(tutar));
        tvIban.setText(iban);
        tvFirmaAdi.setText(firmaAdi);






    }
}
