package com.example.frangmentquiz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public NewsFragment() {
        // Required empty public constructor
    }

    public static NewsFragment newInstance(String param1, String param2) {
        NewsFragment fragment = new NewsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    RecyclerView rcv_news;
    List<News> listaNews = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_news, container, false);

        rcv_news = view.findViewById(R.id.rcv_news);

        News new1 = new News(
                "https://www.acnur.org/sites/default/files/2023-04/63e220ab3.jpg",
                "Fuerte terremoto sacude la costa del Pacífico",
                "Las autoridades reportan daños materiales, pero sin víctimas fatales hasta el momento.",
                "2025-04-30 08:45",
                "Valparaíso",
                "Agencia Nacional de Noticias",
                "María López",
                "Un sismo de magnitud 6.8 sacudió esta mañana la zona costera de Chile, generando alarma entre los habitantes. "
                        + "Equipos de emergencia ya están desplegados en las zonas afectadas. Las autoridades llaman a mantener la calma "
                        + "y seguir los protocolos de evacuación."
        );

        News new2 = new News(
                "https://www.biu.us/sites/biu.us/files/images/Qu%C3%A9%20es%20la%20Inteligencia%20Artificial.jpg",
                "Startup lanza revolucionario asistente de IA para estudiantes",
                "La herramienta promete mejorar el rendimiento académico mediante tutorías personalizadas.",
                "2025-04-29 14:10",
                "Medellín",
                "TechNews Latinoamérica",
                "Juan Esteban Ramírez",
                "La empresa Edutech AI presentó su nueva plataforma impulsada por inteligencia artificial que actúa como tutor personal "
                        + "para estudiantes de secundaria y universitarios. La solución ya ha sido implementada en más de 20 colegios y promete "
                        + "revolucionar la educación digital en la región."
        );

        listaNews.add(new1);
        listaNews.add(new2);

        rcv_news.setLayoutManager(new LinearLayoutManager(getContext()));
        rcv_news.setAdapter(new NewsAdapter(listaNews));



        // Inflate the layout for this fragment
        return view;
    }
}