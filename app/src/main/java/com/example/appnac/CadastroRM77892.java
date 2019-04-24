package com.example.appnac;

import java.io.Serializable;

public class CadastroRM77892 implements Serializable {
    private String nomeRM77892;
    private String emailRM77892;
    private Boolean notificacaoRM77892;
    private String nascimentoRM77892;
    private String idadeRM77892;
    private String estadoRM77892;

    public CadastroRM77892(String nomeRM77892, String emailRM77892, Boolean notificacaoRM77892, String nascimentoRM77892, String idadeRM77892, String estadoRM77892) {
        this.nomeRM77892 = nomeRM77892;
        this.emailRM77892 = emailRM77892;
        this.notificacaoRM77892 = notificacaoRM77892;
        this.nascimentoRM77892 = nascimentoRM77892;
        this.idadeRM77892 = idadeRM77892;
        this.estadoRM77892 = estadoRM77892;
    }

    public String getNotificacaoRM77892() {
        if(notificacaoRM77892){
            return "Ser notificado";
        }else {
            return "Não ser notificado";
        }
    }

    public void setNotificacaoRM77892(boolean notificacaoRM77892) {
        this.notificacaoRM77892 = notificacaoRM77892;
    }

    public String getNomeRM77892() {
        return nomeRM77892;
    }

    public String getEmailRM77892() {
        return emailRM77892;
    }

    public String getNascimentoRM77892() {
        return nascimentoRM77892;
    }

    public String getIdadeRM77892() {
        return idadeRM77892;
    }

    public String getEstadoRM77892() {
        return estadoRM77892;
    }

    public void setNomeRM77892(String nomeRM77892) {
        this.nomeRM77892 = nomeRM77892;
    }

    public void setEmailRM77892(String emailRM77892) {
        this.emailRM77892 = emailRM77892;
    }

    public void setNascimentoRM77892(String nascimentoRM77892) {
        this.nascimentoRM77892 = nascimentoRM77892;
    }

    public void setIdadeRM77892(String idadeRM77892) {
        this.idadeRM77892 = idadeRM77892;
    }

    public void setEstadoRM77892(String estadoRM77892) {
        this.estadoRM77892 = estadoRM77892;
    }
}
