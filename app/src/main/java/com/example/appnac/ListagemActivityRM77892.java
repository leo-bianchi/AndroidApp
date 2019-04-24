package com.example.appnac;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListagemActivityRM77892 extends AppCompatActivity {

    private ListView listViewRM77892;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_rm77892);
        listViewRM77892 = findViewById(R.id.listViewRM77892);

        ArrayList<CadastroRM77892> lista = new ArrayList<CadastroRM77892>();
        lista = (ArrayList<CadastroRM77892>)getIntent().getExtras().get("listagem");

        AdapterRM77892 adapterRM77892 = new AdapterRM77892(ListagemActivityRM77892.this, lista);
        listViewRM77892.setAdapter(adapterRM77892);
    }
}
