package com.example.sercanyusuf.temazsizbankacilik;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AlisverisSonucu extends AppCompatActivity {

    private Button btnCard1, btnCard2, btnCard3, btnOdemeYap;
    private TextView tvFiyat, tvFirmaAdi;

    int tutar;

    String[] hesaplar=new String[3];
    String secilenHesap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alisveris_sonucu);

        btnCard1=(Button)findViewById(R.id.btnCard1);
        btnCard2=(Button)findViewById(R.id.btnCard2);
        btnCard3=(Button)findViewById(R.id.btnCard3);
        btnOdemeYap=(Button)findViewById(R.id.btnOdemeYap);

        tvFiyat=(TextView)findViewById(R.id.tvFiyat);
        tvFirmaAdi=(TextView)findViewById(R.id.tvFirmaAdi);


        Bundle paket= getIntent().getExtras();
        String firmaAdi= paket.getString("firmaAdi");
        tutar = Integer.parseInt(paket.getString("tutar"));


        btnCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                secilenHesap="1000";

                Toast.makeText(getApplicationContext(),"Kart 1 seçildi",Toast.LENGTH_SHORT).show();

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

                alert("BİLGİLENDİRME", "Ödemenizi Onaylıyor Musunuz?");

            }
        });





        tvFiyat.setText(String.valueOf(tutar));
        tvFirmaAdi.setText(firmaAdi);


    }



    public void alert(String title, String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);

        builder.setPositiveButton("EVET", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Finans f=new Finans();
                f.bakiyeDusur(tutar);
                Toast.makeText(getApplicationContext(),"Ödemeniz Başarı ile Gerçekleşti :)", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("İPTAL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"İptal Edildi", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();

    }


    }

