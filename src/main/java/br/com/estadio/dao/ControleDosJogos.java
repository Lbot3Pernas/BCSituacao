package br.com.estadio.dao;

import br.com.estadio.connection.ConnectionFactory;
import br.com.estadio.model.JogosEstadio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ControleDosJogos {

    Connection conexao;

    public ControleDosJogos() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void cadastraJogos(JogosEstadio data) {
        String cadastra = "insert into jogo(jogo_num,jogo_data) values (?,?)";
        try {
            PreparedStatement stmt = conexao.prepareCall(cadastra);
            stmt = conexao.prepareStatement(cadastra);
            stmt.setDate(1, data.getDiaJogo());
            stmt.setInt(2, data.getNumJogo());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar > " + e);
        }
    }

    public List<JogosEstadio> getLista() {
        String lista = "select * from jogo order by id_jog desc";
        List<JogosEstadio> data = new ArrayList<>();
        try {
            PreparedStatement stmt = conexao.prepareCall(lista);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                JogosEstadio datJogos = new JogosEstadio();
                datJogos.setNumJogo(rs.getInt(lista));
                datJogos.setDiaJogo(rs.getDate(lista));
                data.add(datJogos);
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            System.out.println("");
            return null;
        }
    }
}
