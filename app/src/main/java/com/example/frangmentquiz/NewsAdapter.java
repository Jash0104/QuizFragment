package com.example.frangmentquiz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private List<News> datos;

    public NewsAdapter(List<News> datos) {
        this.datos = datos;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_noticia, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        News dato = datos.get(position);
        holder.bind(dato);
    }


    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_titular, txt_subtitulo, txt_fechaCiudad, txt_autor, txt_descripcion;
        ImageView img_noticia;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_titular = itemView.findViewById(R.id.txt_titular);
            txt_subtitulo = itemView.findViewById(R.id.txt_subtitulo);
            txt_fechaCiudad = itemView.findViewById(R.id.txt_fechaCiudad);
            txt_autor = itemView.findViewById(R.id.txt_autor);
            txt_descripcion = itemView.findViewById(R.id.txt_descripcion);
            img_noticia = itemView.findViewById(R.id.img_noticia);
        }

        public void bind(News dato) {
            txt_titular.setText(dato.getAutor());
            txt_subtitulo.setText(dato.getSubtitulo());
            txt_fechaCiudad.setText(dato.getFechaHora() + ". " + dato.getCiudad());
            txt_autor.setText(dato.getAutor());
            txt_descripcion.setText(dato.getDescripcion());
            // Librería de la imagen
            Picasso.get().load(dato.getImage()).into(img_noticia);

        }
    }
}
