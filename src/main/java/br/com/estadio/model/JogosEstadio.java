package br.com.estadio.model;

import java.sql.Date;

public class JogosEstadio {

    private int idJgo;
    private int numJogo;
    private Date diaJogo;

    public int getIdJgo() {
        return idJgo;
    }

    public void setIdJgo(int idJgo) {
        this.idJgo = idJgo;
    }

    public int getNumJogo() {
        return numJogo;
    }

    public void setNumJogo(int numJogo) {
        this.numJogo = numJogo;
    }

    public Date getDiaJogo() {
        return diaJogo;
    }

    public void setDiaJogo(Date diaJogo) {
        this.diaJogo = diaJogo;
    }
}
