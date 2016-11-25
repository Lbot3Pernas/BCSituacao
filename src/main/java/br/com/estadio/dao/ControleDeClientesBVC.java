package br.com.estadio.dao;

import br.com.estadio.connection.ConnectionFactory;
import br.com.estadio.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ControleDeClientesBVC {

    Connection conexao;

    public ControleDeClientesBVC() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void cadastraCliente(Cliente clientess) {
        String sql = "insert into clientela(nom_cli,cpf_cli,sex_cli,dat_nasc, email) values (?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareCall(sql);
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, clientess.getNomeClientela());
            stmt.setString(2, clientess.getCpfClientela());
            stmt.setString(3, clientess.getSexoClientela());
            stmt.setString(4, clientess.getNascimentoClientela());
            stmt.setString(5, clientess.getEmailClientela());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar cliente > " + e);
        }
    }

    public List<Cliente> getLista() {
        String sql = "select * from clientela order by id_cli desc";
        List<Cliente> comprador = new ArrayList<>();
        try {
            PreparedStatement stmt = conexao.prepareCall(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente fregues = new Cliente();
                fregues.setCliId(rs.getInt("id_cli"));
                fregues.setNomeClientela(rs.getString("cli_nome"));
                fregues.setCpfClientela(rs.getString("cli_cpf"));
                fregues.setSexoClientela(rs.getString("cli_sexo"));
                fregues.setNascimentoClientela(rs.getString("cli_nascimento"));
                fregues.setData(rs.getDate("DATA_CAD"));
                comprador.add(fregues);
            }
            stmt.close();
            return comprador;
        } catch (Exception e) {
            System.out.println("Erro ao listar > " + e);
            return null;
        }
    }

    public boolean excluirClientela(int cliente) {
        String sql = "delete from clientela where id_cli = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, cliente);
            stmt.execute();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao excluir cliente > " + e);
            return false;
        }
    }

    public boolean alterarClientela(Cliente clientela, int idClientela) {
        String sql = "update clientela set id_cli where id = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, clientela.getNomeClientela());
            stmt.setString(2, clientela.getNascimentoClientela());
            stmt.setString(3, clientela.getCpfClientela());
            stmt.setString(4, clientela.getSexoClientela());
            stmt.execute();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao alterar cliente > " + e);
            return false;
        }
    }
}
