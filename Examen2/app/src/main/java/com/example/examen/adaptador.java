package com.example.examen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adaptador extends BaseAdapter {
    Context contexto;
    String listaletras[];
    int listaimg[];

    LayoutInflater inflater;

    public adaptador(Context contexto, String[] listaletras, int[] listaimg) {
        this.contexto = contexto;
        this.listaletras = listaletras;
        this.listaimg = listaimg;
        this.inflater = LayoutInflater.from(contexto);//cambiar aqui uwu
    }

    @Override
    public int getCount() {
        return listaletras.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.menuu, null);
        TextView text1=convertView.findViewById(R.id.tex1);
        ImageView img=convertView.findViewById(R.id.imagencon);
        text1.setText(listaletras[i]);
        img.setImageResource(listaimg[i]);
        return convertView;
    }
}
