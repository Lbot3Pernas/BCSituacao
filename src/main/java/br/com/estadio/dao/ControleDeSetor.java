package br.com.estadio.dao;

import br.com.estadio.connection.ConnectionFactory;
import br.com.estadio.model.Setor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ControleDeSetor {

    Connection conexao;

    public ControleDeSetor() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void cadastraSetor(Setor cor) {
        String sql = "insert into setor(NOME_SET) values(?)";
        try {
            PreparedStatement stmt = conexao.prepareCall(sql);
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cor.getNomeSetor());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar >" +e);
        }
    }

    public List<Setor> getListaS() {
        String sql = "select * from setor";
        List<Setor> setorr = new ArrayList<>();
        
        try {
            PreparedStatement stmt = conexao.prepareCall(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Setor set = new Setor();
                set.setNomeSetor(rs.getString(sql));
                setorr.add(set);
            }
            stmt.close();
            return setorr;
        } catch (Exception e) {
            System.out.println("Erro ao listar >" + e);
            return null;
        }
    }
    public void removeSetor(){
        
    }

}
