package br.com.estadio.dao;

import br.com.estadio.connection.ConnectionFactory;
import br.com.estadio.model.CadeirasBVC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ControleCadeiras {

    Connection conexao;

    public ControleCadeiras() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void cadastraCadeira(CadeirasBVC assento) {
        String sql = "insert into cadeirote (num_cad) values (?)";

        try {
            PreparedStatement stmt = conexao.prepareCall(sql);
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, assento.getFileiraCadeira());
            stmt.setInt(2, assento.getNumCad());
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar > " + e);
        }
    }

    public List<CadeirasBVC> getLista() {
        String sql = "select * from cadeira order by id_cad desc";
        List<CadeirasBVC> assento = new ArrayList<>();
        try {
            PreparedStatement stmt = conexao.prepareCall(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                CadeirasBVC cad = new CadeirasBVC();
                cad.setFileiraCadeira(rs.getInt(sql));
                cad.setNumCad(rs.getInt(sql));
                assento.add(cad);
            }
            stmt.close();
            return assento;
        } catch (Exception e) {
            System.out.println("Erro ao listar > " + e);
            return null;
        }
    }
}
