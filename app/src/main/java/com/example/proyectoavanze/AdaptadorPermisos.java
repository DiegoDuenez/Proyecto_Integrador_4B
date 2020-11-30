package com.example.proyectoavanze;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorPermisos extends RecyclerView.Adapter<AdaptadorPermisos.MiHolder> {

    private List<Permiso> permisosList;

    public AdaptadorPermisos(List<Permiso> permisosList) { //SE CREA UN COSNTRUCTOR QUE RECIBE LA LISTA DEL MODELO PERSONA
        this.permisosList = permisosList;
    }
    private View.OnClickListener listener;

    @NonNull
    @Override
    public AdaptadorPermisos.MiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //CON EL LAYOUTINFLATER ESTAMOS CREANDO UNA VISTA APARTIR DEL XML YA DEFINIDO QUE ES EL ITEM_LAYOUT QUE CREAMOS
        View vistaPermisos = LayoutInflater.from(parent.getContext()).inflate(R.layout.permisos_item_layout, parent, false);
        return new MiHolder(vistaPermisos);

    }

    @Override
    public void onBindViewHolder(@NonNull MiHolder holder, int position) {


        holder.setData(permisosList.get(position));

    }

    @Override
    public int getItemCount() { //CONTEO DE LOS ITEMS
        return permisosList.size();
    }

    public class MiHolder extends RecyclerView.ViewHolder {


        private TextView texto;

        public MiHolder(@NonNull View itemView) {
            super(itemView);

            texto = itemView.findViewById(R.id.permiso);

        }

        private void setData(Permiso p){ //RECIBE UNA PERSONA Y LE SACA LA INFORMACION


            texto.setText(p.getNombre());

        }



    }



}
