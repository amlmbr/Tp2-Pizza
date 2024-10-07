package com.ensa.pizza.service;

import com.ensa.pizza.dao.IDao;
import com.ensa.pizza.classes.Produit;

import java.util.ArrayList;
import java.util.List;

public class PizzaService implements IDao<Produit> {

    private List<Produit> pizza;

    public PizzaService() {
        this.pizza = new ArrayList<>();
    }

    @Override
    public boolean create(Produit p) {
        return pizza.add(p);
    }

    @Override
    public boolean update(Produit p) {
        return false;
    }

    @Override
    public boolean delete(Produit p) {
        return pizza.remove(p);
    }

    @Override
    public Produit findById(int id) {
        for(Produit p:pizza){
            if(p.getId()==id){
                return p;
            }

        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return pizza;
    }
}
