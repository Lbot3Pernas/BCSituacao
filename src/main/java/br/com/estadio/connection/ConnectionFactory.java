package br.com.estadio.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {

            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            String servName = "192.68.0.200:3306";
            String db = "BCSituation";
            String url = "jdbc:mysql://" + servName + "/" + db;
            String usr = "aluno";
            String pw = "123456";

            Connection connection = DriverManager.getConnection(url, usr, pw);
            return connection;

        } catch (ClassNotFoundException e) {
            System.out.println("Erro no Driver." + e);
            return null;
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar no Banco de Dados." + e);
            return null;
        }
    }
}
