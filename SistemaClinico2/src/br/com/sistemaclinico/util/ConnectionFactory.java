package br.com.sistemaclinico.util;

import java.sql.Connection;
import java.beans.Statement;
import java.sql.*;

public class ConnectionFactory {
	
	public Statement stm;//resposavel por preparar e realizar pesquisa no bd
	public ResultSet re;//responsavel por armazenar o resultado de uma pesquisa
	private String driver = "org.postgresql.Driver";
	private static String caminho = "jdbc.postgresql://localhost:5433/sistemaclinico";
	private static String usuario = "postgres";
	private static String senha = "adm";
	public static Connection con;
	
	
	
public static Connection getConnection() throws ClassNotFoundException{
		
		try{
			
			
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(caminho, usuario, senha);
			
			return con;
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
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


}
