package br.com.sistemaclinico.model2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.sismaclinico.interfaces.CadastrarFuncionario;

//@Desenvolvido por Joao Cleber

public class Funcionario extends Pessoa {
	
	public int matricula;
	protected String cargo;
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
		// TODO Auto-generated method stub
		
	}

	
}
	

	
	
	

