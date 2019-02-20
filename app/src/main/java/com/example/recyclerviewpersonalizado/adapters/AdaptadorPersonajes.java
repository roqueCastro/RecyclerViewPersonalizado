package com.example.recyclerviewpersonalizado.adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewpersonalizado.PersonajeVo;
import com.example.recyclerviewpersonalizado.R;

import java.util.ArrayList;

public class AdaptadorPersonajes extends RecyclerView.Adapter<AdaptadorPersonajes.ViewHolderPersonajes> {

    ArrayList<PersonajeVo> personajeVos;


    public AdaptadorPersonajes(ArrayList<PersonajeVo> personajeVos) {
        this.personajeVos = personajeVos;
    }

    @Override
    public ViewHolderPersonajes onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_personajes, null, false);
        return new ViewHolderPersonajes(view);

    }

    @Override
    public void onBindViewHolder(ViewHolderPersonajes holder, int position) {

        holder.etiNombre.setText(personajeVos.get(position).getNombre());
        holder.etiInformacion.setText(personajeVos.get(position).getInfo());
        holder.foto.setImageResource(personajeVos.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return personajeVos.size();
    }

    public class ViewHolderPersonajes extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformacion;
        ImageView foto;

        public ViewHolderPersonajes(View itemView) {
            super(itemView);

            etiNombre =(TextView) itemView.findViewById(R.id.IdNombre);
            etiInformacion =(TextView) itemView.findViewById(R.id.IdInfo);
            foto =(ImageView) itemView.findViewById(R.id.IdImagen);

        }
    }
}
