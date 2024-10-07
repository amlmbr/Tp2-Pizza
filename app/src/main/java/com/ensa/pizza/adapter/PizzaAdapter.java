package com.ensa.pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ensa.pizza.R;
import com.ensa.pizza.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private List<Produit> pizza;
    private LayoutInflater inflater;

    public PizzaAdapter(List<Produit> pizza , Activity activity) {
        this.pizza = pizza;
        inflater=(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return pizza.size();
    }

    @Override
    public Object getItem(int position) {
        return pizza.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.itempizza,null);

        TextView id = convertView.findViewById(R.id.id);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView durre = convertView.findViewById(R.id.duree);
        TextView nbringredients = convertView.findViewById(R.id.nbrIngredients);
        ImageView image = convertView.findViewById(R.id.image);



        id.setText(pizza.get(position).getId()+"");
        nom.setText(pizza.get(position).getNom()+"");
        nbringredients.setText(pizza.get(position).getNbringredients()+" ");
        durre.setText(pizza.get(position).getDuree()+" min ");
        image.setImageResource(pizza.get(position).getPhoto());
        return convertView;
    }
}
