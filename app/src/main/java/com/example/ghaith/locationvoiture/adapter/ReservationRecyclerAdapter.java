package com.example.ghaith.locationvoiture.adapter;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ghaith.locationvoiture.Model.Réservation;
import com.example.ghaith.locationvoiture.R;

import java.util.List;

public class ReservationRecyclerAdapter extends RecyclerView.Adapter<ReservationRecyclerAdapter.ReservationViewHolder> {

    private List<Réservation> listReservations;

    public ReservationRecyclerAdapter(List<Réservation> listReservations) {
        this.listReservations = listReservations;
    }

    @Override
    public ReservationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflating recycler item view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_voiture_reservee, parent, false);

        return new ReservationViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ReservationViewHolder holder, int position) {
        holder.textViewVille.setText(listReservations.get(position).getVille());
        holder.textViewAgence.setText(listReservations.get(position).getAgence());
        holder.textViewNumserie.setText(listReservations.get(position).getNumserie());
        holder.textViewMarque.setText(listReservations.get(position).getMarque());
        holder.textViewDatdeb.setText(listReservations.get(position).getDatdeb());
        holder.textViewDatfin.setText(listReservations.get(position).getDatfin());
    }

    @Override
    public int getItemCount() {
        Log.v(UsersRecyclerAdapter.class.getSimpleName(),""+listReservations.size());
        return listReservations.size();
    }


    /**
     * ViewHolder class
     */
    public class ReservationViewHolder extends RecyclerView.ViewHolder {

        public AppCompatTextView textViewVille;
        public AppCompatTextView textViewAgence;
        public AppCompatTextView textViewNumserie;
        public AppCompatTextView textViewMarque;
        public AppCompatTextView textViewDatdeb;
        public AppCompatTextView textViewDatfin;

        public ReservationViewHolder(View view) {
            super(view);
            textViewVille = (AppCompatTextView) view.findViewById(R.id.ville);
            textViewAgence = (AppCompatTextView) view.findViewById(R.id.Agence);
            textViewNumserie = (AppCompatTextView) view.findViewById(R.id.Numserie);
            textViewMarque = (AppCompatTextView) view.findViewById(R.id.Marque);
            textViewDatdeb = (AppCompatTextView) view.findViewById(R.id.datdeb);
            textViewDatfin = (AppCompatTextView) view.findViewById(R.id.datfin);

        }
    }


}