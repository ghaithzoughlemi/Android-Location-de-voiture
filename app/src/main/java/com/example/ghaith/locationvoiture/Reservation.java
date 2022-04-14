package com.example.ghaith.locationvoiture;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.ghaith.locationvoiture.Helper.InputValidation;
import com.example.ghaith.locationvoiture.Model.Réservation;
import com.example.ghaith.locationvoiture.Model.User;
import com.example.ghaith.locationvoiture.Sql.DataBaseHelper;

import java.util.Calendar;

public class Reservation extends AppCompatActivity {
    private final AppCompatActivity activity = Reservation.this;

    private NestedScrollView nestedScrollView;

    private TextInputLayout textInputLayoutNom;
    private TextInputLayout textInputLayoutPrenom;
    private TextInputLayout textInputLayoutCin;
    private TextInputLayout textInputLayoutVille;
    private TextInputLayout textInputLayoutAgenc;
    private TextInputLayout textInputLayoutVehicule;


    private TextInputEditText textInputEditTextNom;
    private TextInputEditText textInputEditTextPrenom;
    private TextInputEditText textInputEditTextCin;
    private TextInputEditText textInputEditTextVille;
    private TextInputEditText textInputEditTextAgence;
    private TextInputEditText textInputEditTextVehicule;


    private AppCompatButton appCompatButtonRegister;
    private AppCompatTextView appCompatTextViewLoginLink;

    private InputValidation inputValidation;
    private DataBaseHelper databaseHelper;
    private Réservation reservation;
    private Button bt_date_debut;
    private Button bt_date_fin;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    private static final String TAG = "Reservation";
    private TextView tx_date_debut;
    private TextView tx_date_fin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        initcomposant();
        initlestener();



    }
    private void initcomposant(){
        bt_date_debut = (Button) findViewById(R.id.bt_date_debut);
        bt_date_fin = (Button) findViewById(R.id.bt_date_fin);
        tx_date_debut = (TextView) findViewById(R.id.tx_date_debut);
        tx_date_fin = (TextView) findViewById(R.id.tx_date_fin);
    }
    private void initlestener(){
        bt_date_debut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initdatedebut();
                datepicker();

            }
        });
        bt_date_fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initdatefin();
                datepicker();

            }
        });
    }
    private void datepicker (){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog = new DatePickerDialog(
                Reservation.this,
                android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                mDateSetListener,
                year,month,day);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

    }
    private void initdatedebut(){
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateSet: mm/dd/yyy: " + month + "/" + day + "/" + year);

                String date = month + "/" + day + "/" + year;
                tx_date_debut.setText(date);
            }
        };
    }
    private void initdatefin() {
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateSet: mm/dd/yyy: " + month + "/" + day + "/" + year);

                String date = month + "/" + day + "/" + year;
                tx_date_fin.setText(date);
            }
        };
    }
}
