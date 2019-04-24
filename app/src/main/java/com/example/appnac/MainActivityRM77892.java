package com.example.appnac;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivityRM77892 extends AppCompatActivity {
    private TextView nomeRM77892;
    private TextView emailRM77892;
    private Boolean notificacaoRM77892;
    private TextView nascimentoRM77892;
    private RadioGroup idadeRM77892;
    private RadioButton radioButtonRM77892;
    private Spinner estadoRM77892;
    private ArrayList<CadastroRM77892> cadastroRM77892;
    private CheckBox checkBoxRM77892;

    DatePickerDialog datePickerDialogRM77892;
    Calendar calendarRM77892;
    Date nascimento = null;

    private Button cadastrarRM77892;
    private Button visualizarRM77892;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItemSpinner();

        cadastroRM77892 = new ArrayList<CadastroRM77892>();

        nomeRM77892 = findViewById(R.id.nomeRM77892);
        emailRM77892 = findViewById(R.id.emailRM77892);
        nascimentoRM77892 = findViewById(R.id.nascimentoRM77892);
        idadeRM77892 = findViewById(R.id.idadeRM77892);
        checkBoxRM77892 = findViewById(R.id.enviarEmailRM77892);
        cadastrarRM77892 = findViewById(R.id.cadastrarRM77892);
        visualizarRM77892 = findViewById(R.id.visualizarRM77892);

        calendarRM77892 = Calendar.getInstance();
        datePickerDialogRM77892 = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Calendar dataSelecionadaRM77892 = Calendar.getInstance();
                dataSelecionadaRM77892.set(year, month, dayOfMonth);
                nascimento = dataSelecionadaRM77892.getTime();

                SimpleDateFormat formatRM77892 = new SimpleDateFormat("dd/MM/yyyy");
                nascimentoRM77892.setText(formatRM77892.format(dataSelecionadaRM77892.getTime()));
            }
        }, calendarRM77892.get(Calendar.YEAR),
        calendarRM77892.get(Calendar.MONTH),
        calendarRM77892.get(Calendar.DAY_OF_MONTH));

        nascimentoRM77892.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerDialogRM77892.show();
            }
        });

        cadastrarRM77892.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = idadeRM77892.indexOfChild(findViewById(idadeRM77892.getCheckedRadioButtonId()));
                radioButtonRM77892 = (RadioButton) idadeRM77892.getChildAt(index);

                if (checkBoxRM77892.isChecked()) {
                    notificacaoRM77892 = Boolean.TRUE;
                } else {
                    notificacaoRM77892 = Boolean.FALSE;
                }

                if("".equals(emailRM77892.getText().toString())) {
                    Toast.makeText(MainActivityRM77892.this, "Preencha o campo email",
                            Toast.LENGTH_SHORT).show();
                } else if("".equals(nascimentoRM77892.getText().toString())) {
                    Toast.makeText(MainActivityRM77892.this, "Preencha o campo nascimento",
                            Toast.LENGTH_SHORT).show();
                } else if("".equals(nomeRM77892.getText().toString())) {
                    Toast.makeText(MainActivityRM77892.this, "Preencha o campo nome",
                            Toast.LENGTH_SHORT).show();
                } else {
                    CadastroRM77892 cadastrosRM77892 = new CadastroRM77892(nomeRM77892.getText().toString(),
                            emailRM77892.getText().toString(),
                            notificacaoRM77892,
                            nascimentoRM77892.getText().toString(),
                            radioButtonRM77892.getText().toString(),
                            estadoRM77892.getSelectedItem().toString());
                    cadastroRM77892.add(cadastrosRM77892);
                    Toast.makeText(MainActivityRM77892.this, nomeRM77892.getText().toString() +
                            " cadastrado com sucesso", Toast.LENGTH_SHORT).show();
                }
            }
        });

        visualizarRM77892.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRM77892 = new Intent(MainActivityRM77892.this, ListagemActivityRM77892.class);
                intentRM77892.putExtra("listagem", cadastroRM77892);
                startActivity(intentRM77892);
            }
        });
    }

    private void addItemSpinner() {
        estadoRM77892 = (Spinner) findViewById(R.id.estadoRM77892);
        List<String> estadosRM77892 = new ArrayList<>();
        estadosRM77892.add("SP");
        estadosRM77892.add("RJ");
        estadosRM77892.add("BH");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, estadosRM77892);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        estadoRM77892.setAdapter(dataAdapter);
    }
}