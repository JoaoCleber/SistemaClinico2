package br.com.sistemaclinico.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.util.PSQLException;

public class Teste {


	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		ConnectionFactory cone = new ConnectionFactory();
		cone.getConnection();
		
		
}
}