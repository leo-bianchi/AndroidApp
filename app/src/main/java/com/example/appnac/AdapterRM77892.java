package com.example.appnac;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterRM77892 extends BaseAdapter {
    private Context context;
    ArrayList<CadastroRM77892> lista;

    public AdapterRM77892(Context context, ArrayList<CadastroRM77892> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View inflater = LayoutInflater.from(context).inflate(R.layout.item_rm77892, parent, false);
        TextView nome = inflater.findViewById(R.id.nomeRM77892);
        TextView email = inflater.findViewById(R.id.emailRM77892);
        TextView nascimento = inflater.findViewById(R.id.nascimentoRM77892);
        TextView receberNotificacao = inflater.findViewById(R.id.notificacaoRM77892);
        TextView idade = inflater.findViewById(R.id.idadeRM77892);
        TextView estado = inflater.findViewById(R.id.estadoRM77892);
        CadastroRM77892 cadastro = lista.get(position);

        nome.setText(cadastro.getNomeRM77892());
        email.setText(cadastro.getEmailRM77892());
        nascimento.setText(cadastro.getNascimentoRM77892());
        receberNotificacao.setText(cadastro.getNotificacaoRM77892());
        idade.setText(cadastro.getIdadeRM77892());
        estado.setText(cadastro.getEstadoRM77892());

        return inflater;
    }
}
