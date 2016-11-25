package br.com.estadio.model;

import java.sql.Date;

public class Cliente {

    private int cliId;
    private String nomeClientela;
    private String nascimentoClientela;
    private String sexoClientela;
    private String cpfClientela;
    private String emailClientela;
    private Date data;

    public int getCliId() {
        return cliId;
    }

    public void setCliId(int cliId) {
        this.cliId = cliId;
    }

    public String getNomeClientela() {
        return nomeClientela;
    }

    public void setNomeClientela(String nomeClientela) {
        this.nomeClientela = nomeClientela;
    }

    public String getNascimentoClientela() {
        return nascimentoClientela;
    }

    public void setNascimentoClientela(String nascimentoClientela) {
        this.nascimentoClientela = nascimentoClientela;
    }

    public String getSexoClientela() {
        return sexoClientela;
    }

    public void setSexoClientela(String sexoClientela) {
        this.sexoClientela = sexoClientela;
    }

    public String getCpfClientela() {
        return cpfClientela;
    }

    public void setCpfClientela(String cpfClientela) {
        this.cpfClientela = cpfClientela;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
