package com.ensa.pizza;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DescriprtionPizza extends AppCompatActivity {

    private ImageView imagez;
    private TextView nomz,descriptionz,ingredientsz,prepar;



    private Button back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_descriprtion_pizza);

        imagez=findViewById(R.id.image);
        nomz=findViewById(R.id.nom);
        descriptionz=findViewById(R.id.Description);
        ingredientsz=findViewById(R.id.Ingredients);
        prepar=findViewById(R.id.prepa);

        back=findViewById(R.id.back);
        Intent i =getIntent();

        String nom=i.getStringExtra("Nom");
        String description=i.getStringExtra("Description");
        String ingredients=i.getStringExtra("Ingredients");
        String preparation=i.getStringExtra("Preparation");
        int image=i.getIntExtra("image",0);



        nomz.setText(nom+" ");
        descriptionz.setText(description+" ");
        ingredientsz.setText(ingredients+" ");
        prepar.setText(preparation+" ");
        imagez.setImageResource(image);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DescriprtionPizza.this,ListPizza.class);
                startActivity(intent);
                DescriprtionPizza.this.finish();
            }
        });

    }
}