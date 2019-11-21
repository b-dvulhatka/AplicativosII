package com.example.atividade1109;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ProdAdapter extends ArrayAdapter<Produto> {

    private int rId;

    public ProdAdapter(Context context, int resource, List<Produto> list) {
        super(context, resource, list);
        rId = resource;
    }

    @Override
    public View getView(int position, View currentView, ViewGroup parent) {
        View mView = currentView;

        if (mView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(rId, null);
        }

        Produto prod = getItem(position);

        TextView Tprod = mView.findViewById(R.id.Tprod);
        TextView Tqtd = mView.findViewById(R.id.Tqtd);

        if(prod.isPriority()){
            Tprod.setTextColor(Color.RED);
            Tqtd.setTextColor(Color.RED);
        }


        String qtd=prod.getQtd()+" "+prod.getUnit();

        Tprod.setText(prod.getName());
        Tqtd.setText(qtd);

        return mView;
    }

}
