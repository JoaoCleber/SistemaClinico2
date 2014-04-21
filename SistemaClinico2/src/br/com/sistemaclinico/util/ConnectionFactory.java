package br.com.sistemaclinico.util;

import java.beans.Statement;
import java.sql.*;

public class ConnectionFactory {
	
	public Statement stm;//resposavel por preparar e realizar pesquisa no bd
	public ResultSet re;//responsavel por armazenar o resultado de uma pesquisa
	private String driver = "org.postgresql.Driver";
	private String caminho = "jdbc.postgresql://localhost:5433/sistemaclinico";
	private String usuario = "postgres";
	private String senha = "adm";
	public Connection con;
	
	public void conexao() throws ClassNotFoundException{
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(caminho, usuario, senha);
			System.out.println("Conectado");
		} catch (SQLException e) {
			System.out.println("Erros");
			e.printStackTrace();
		}
	}
	public void desconecta(){
		try {
			con.close();
			
			System.out.println("Fechou");
		} catch (SQLException e) {
			
			System.out.println("Erro ao fechar");
			
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
