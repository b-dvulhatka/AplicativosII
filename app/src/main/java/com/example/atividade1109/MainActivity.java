package com.example.atividade1109;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText prod, quant;
    private ListView list;
    private List<Produto> prods;
    private ArrayAdapter adapter;
    private Spinner Sunit;
    private CheckBox priority;
    private boolean checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prod = findViewById(R.id.prod);
        quant = findViewById(R.id.quant);
        list = findViewById(R.id.list);
        Sunit=findViewById(R.id.unit);
        priority=findViewById(R.id.prioriy);

        priority.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                checked=b;
            }
        });

    }

    @Override
    protected void onStart(){
        super.onStart();

        prods = new ArrayList<>();
        adapter = new ProdAdapter(getApplicationContext(),R.layout.product_item,prods);
        list.setAdapter(adapter);
    }

    public void add(View view) {
        String nome = prod.getText().toString();
        int qtd = Integer.parseInt(quant.getText().toString());
        String unit= Sunit.getSelectedItem().toString();


        Produto product = new Produto(nome, qtd, unit, checked);

        prods.add(product);

        adapter.notifyDataSetChanged();
    }
}
