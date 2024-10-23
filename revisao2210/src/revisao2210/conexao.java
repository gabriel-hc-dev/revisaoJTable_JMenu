package revisao2210;

import java.sql.*;

public class conexao {

    public Connection conn = null;
    private final String driver = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://localhost:5432/cursos2210";
    private final String login = "postgres";
    private final String senha = "root";

    public boolean getConnection() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, login, senha);
            System.out.println("Conectou...");
            return true;
        } catch (ClassNotFoundException erro) {
            System.out.println("Driver não encontrado..." + erro.toString());
            return false;
        } catch (SQLException erro) {
            System.out.println("Erro no SQL..." + erro.toString());
            return false;
        }
    }
    
    public void close(){
        try{
            conn.close();
            System.out.println("Desconectou...");
        } catch(SQLException erro){  
        }
    }
}
