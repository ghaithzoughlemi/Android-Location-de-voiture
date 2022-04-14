package com.example.ghaith.locationvoiture;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;

import com.example.ghaith.locationvoiture.Model.Réservation;
import com.example.ghaith.locationvoiture.Sql.DataBaseHelper;
import com.example.ghaith.locationvoiture.adapter.ReservationRecyclerAdapter;

import java.util.List;

public class ReservationListActivity extends AppCompatActivity {
    private AppCompatActivity activity = ReservationListActivity.this;
    private AppCompatTextView textViewName;
    private RecyclerView recyclerViewUsers;
    private List<Réservation> listUsers;
    private ReservationRecyclerAdapter usersRecyclerAdapter;
    private DataBaseHelper databaseHelper; {
}
}
