package com.example.sercanyusuf.temazsizbankacilik;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Options extends AppCompatActivity {

    private Button mQROdeme, mParaTransferi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        mQROdeme=(Button)findViewById(R.id.qrOdeme);
        mParaTransferi=(Button)findViewById(R.id.paraTransferi);

        mQROdeme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        mParaTransferi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ParaTransferi.class));
            }
        });


    }
}
