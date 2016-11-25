package br.com.estadio.dao;

import br.com.estadio.connection.ConnectionFactory;
import br.com.estadio.model.FileiraEstadio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ControleDeFileiras {

    Connection conexao;

    public ControleDeFileiras() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void cadastraFileira(FileiraEstadio fileiraEstadio) {
        String sql = "insert into fileira(fil_nome, fil_setor) values(?,?)";
        try {
            PreparedStatement stmt = conexao.prepareCall(sql);
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, fileiraEstadio.getFil());
            stmt.setString(2, fileiraEstadio.getFileira());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar > " + e);
        }
    }

    public List<FileiraEstadio> getListaF() {
        String list = "select * from fileira order by id_fil desc";
        List<FileiraEstadio> fila = new ArrayList<>();
        try {
            PreparedStatement stmt = conexao.prepareCall(list);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                FileiraEstadio fil = new FileiraEstadio();
                fil.setFileira(rs.getString(list));
                fil.setFil(rs.getInt(list));
                fila.add(fil);
            }
            stmt.close();
            return fila;
        } catch (Exception e) {
            System.out.println("Erro ao listar a Fileira > "+e);
            return null;
        }
    }
    public void removerFileira(){
        
    }
}
