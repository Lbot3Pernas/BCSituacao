package br.com.estadio.dao;

import br.com.estadio.connection.ConnectionFactory;
import br.com.estadio.model.Ingresso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ControleDeIngressos {

    Connection conexao;

    public ControleDeIngressos() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void cadastrarIngresso(Ingresso entrada) {

        String sql = "insert into ingresso(ing_cli,ing_cad,ing_jogo) values(?,?,?)";

        try {

            PreparedStatement stmt = conexao.prepareCall(sql);
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, entrada.getCadeiroteIng());
            stmt.setInt(2, entrada.getClientelaIng());
            stmt.setInt(3, entrada.getDiajIng());
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            System.out.println("Erro ao inserir > " + e);
        }
    }

    public List<Ingresso> getLista() {
        String sql = "select * from ingresso order by id_ing desc";

        List<Ingresso> bilhete = new ArrayList<>();

        try {
            PreparedStatement stmt = conexao.prepareCall(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Ingresso ing = new Ingresso();
                ing.setCadeiroteIng(rs.getInt("ID"));
                ing.setClientelaIng(rs.getInt("cliIng"));
                ing.setDiajIng(rs.getInt("djIng"));
                bilhete.add(ing);
            }

            stmt.close();
            return bilhete;

        } catch (Exception e) {
            System.out.println("Erro ao Listar > " + e);
            return null;
        }
    }

    public boolean excluirIngresso(int ingress) {
        String sql = "delete from ingresso where id_ing = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, ingress);
            stmt.execute();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao excluir ingresso > " + e);
            return false;
        }
    }

    public boolean alterarIngresso(Ingresso ingress, int idIngresso) {
        String sql = "update ingresso set id_ing where id = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, ingress.getClientelaIng());
            stmt.setInt(2, ingress.getCadeiroteIng());
            stmt.setInt(3, ingress.getDiajIng());
            stmt.setInt(4, ingress.getIdIng());
            stmt.execute();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao alterar ingresso > " + e);
            return false;
        }
    }
}
