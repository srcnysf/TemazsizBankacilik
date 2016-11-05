package com.example.sercanyusuf.temazsizbankacilik;



import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Transaction;
import com.google.firebase.database.ValueEventListener;

public class Finans {

    FirebaseDatabase database;
    DatabaseReference myRef;
    String adSoyad,guvenlikKodu,iban,kartNo,sonKullanmaTarihi;

    public Finans(){
        database = FirebaseDatabase.getInstance();
    }



    public void bakiyeDusur(final int tutar){
        myRef = database.getReference("bakiye");
        myRef.runTransaction(new Transaction.Handler() {
            @Override
            public Transaction.Result doTransaction(final MutableData currentData) {
                if (currentData.getValue() == null) {
                    currentData.setValue(1);
                } else {
                    currentData.setValue((Long) currentData.getValue() - tutar);

                }

                return Transaction.success(currentData);
            }

            @Override
            public void onComplete(DatabaseError firebaseError, boolean committed, DataSnapshot currentData) {

            }
        });

    }


    public void getAdSoyad(final TextView tv){

        myRef=database.getReference("adSoyad");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("hata", "Failed to read value.", error.toException());
            }
        });

    }

    public void getIban(final TextView tv){

        myRef=database.getReference("iban");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("hata", "Failed to read value.", error.toException());
            }
        });

    }

    public void getKartNo(final TextView tv){

        myRef=database.getReference("kartNo");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("hata", "Failed to read value.", error.toException());
            }
        });

    }

    public void getBakiye(final TextView tv){

        myRef=database.getReference("bakiye");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(Integer.class);
                tv.setText(String.valueOf(value));

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("hata", "Failed to read value.", error.toException());
            }
        });

    }

}
