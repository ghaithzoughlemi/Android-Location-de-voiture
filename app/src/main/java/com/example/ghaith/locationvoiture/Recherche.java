package com.example.ghaith.locationvoiture;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.ghaith.locationvoiture.Helper.InputValidation;
import com.example.ghaith.locationvoiture.Model.User;
import com.example.ghaith.locationvoiture.Sql.DataBaseHelper;

public class Recherche extends AppCompatActivity {
    private Spinner spinner;
    private ArrayAdapter<CharSequence> adapter;
    private AutoCompleteTextView edtauto1;
    private AutoCompleteTextView edtauto2;
    private Button button_reserve;
    private InputValidation inputValidation;
    private DataBaseHelper databaseHelper;
    private Reservation reservation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche);

        initview();
        initObjects();
        edtauto1.addTextChangedListener(RemplirTextWatcher);
        button_reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    private void initview (){
        spinner = (Spinner) findViewById(R.id.spinner_Rech);
        edtauto1 = (AutoCompleteTextView) findViewById(R.id.actv1);
        edtauto2 =(AutoCompleteTextView) findViewById(R.id.actv2);
        button_reserve = (Button) findViewById(R.id.bt_reserve);
        adapter = ArrayAdapter.createFromResource(this, R.array.ville, android.R.layout.simple_list_item_1);
        edtauto1.setAdapter(adapter);
    }
    private void inteview (){
        if (edtauto1.getText().toString().trim().equals("Tunis")) {
            adapter = ArrayAdapter.createFromResource(this, R.array.agence_tunis, android.R.layout.simple_list_item_1);
            edtauto2.setAdapter(adapter);
        }
        else if (edtauto1.getText().toString().trim().equals("Manouba")){
            adapter = ArrayAdapter.createFromResource(this, R.array.agence_manouba, android.R.layout.simple_list_item_1);
            edtauto2.setAdapter(adapter);
        }
        else if (edtauto1.getText().toString().trim().equals("Ben arous")) {
                adapter = ArrayAdapter.createFromResource(this, R.array.agence_benarous, android.R.layout.simple_list_item_1);
                edtauto2.setAdapter(adapter);
        }
        else if (edtauto1.getText().toString().trim().equals("Ariana")) {
            adapter = ArrayAdapter.createFromResource(this, R.array.agence_ariana, android.R.layout.simple_list_item_1);
            edtauto2.setAdapter(adapter);
        }

    }

    private TextWatcher RemplirTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               inteview();
            edtauto2.setEnabled(true);

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    private void initObjects() {
        inputValidation = new InputValidation(this);
        databaseHelper = new DataBaseHelper(this);
        reservation = new Reservation();

    }




}
