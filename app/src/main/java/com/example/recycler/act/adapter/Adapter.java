package com.example.recycler.act.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycler.R;
import com.example.recycler.act.model.WindBlade;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<WindBlade> listaBlade;
    public Adapter(List<WindBlade> lista) {
        this.listaBlade = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Provável mudança no parâmetro 'R'.
        View itemLista = LayoutInflater.from(parent.getContext())
                         .inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder( itemLista );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        WindBlade blade = listaBlade.get(position);
        holder.identificacaoDaPa.setText(blade.getNumeracao());
        holder.saida.setText(blade.getSaida());
        holder.set.setText(blade.getSet());
    }

    @Override
    public int getItemCount() {

        return listaBlade.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

            TextView identificacaoDaPa;
            TextView set;
            TextView saida;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                identificacaoDaPa = itemView.findViewById(R.id.textPa);
                set = itemView.findViewById(R.id.textSet);
                saida = itemView.findViewById(R.id.textSaida);
            }
        }
}
