package br.com.sistemaclinico.interacao;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.sistemaclinico.model2.Funcionario;

public class InfFuncionario extends Funcionario  {
	String nome, cpf, rg;
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Funcionario> fun = new ArrayList<>();
	
	//Contrutor
	public void Funcionario (){
		
	}
	//Construtor
	void Funcionario(String nome, String cpf, String rg, String matricula, String cargo){
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.cargo = cargo;	
	}

	public void CadastrarFuncionario() {
		Funcionario f = new Funcionario();
		System.out.println("Digite o nome do Funcioanrio ");
		this.nome = sc.next();
		f.setNome(nome);
		System.out.println("Digite CPF");
		this.cpf = sc.next();
		
		int cpfInt = Integer.parseInt(cpf);
			
		
		f.setCpf(cpf);
		System.out.println("Digite RG");
		this.rg = sc.next();
		f.setRg(rg);
		System.out.println("Digite o Cargo");
		this.cargo = sc.next();
		f.setCargo(cargo);
		System.out.println("MATRICULA GERADA AUTOMATICA");
		this.matricula ++;
		f.setMatricula(matricula);
		
		fun.add(f);
		
	}		
	
	public void ListarFuncionario() {
		if(fun.size() == 0){
			System.out.println("Lista Vazia !");
		}else{
			for (Funcionario funcionarios : fun) {
				System.out.println("LISTA DE FUNCIONARIOS");
				System.out.println("NOME :" + funcionarios.getNome());
				System.out.println("CPF : " + funcionarios.getCpf());
				System.out.println("RG :" + funcionarios.getRg());
				System.out.println("CARGO :" + funcionarios.getCargo());
				System.out.println("MATRICULA : " + funcionarios.matricula);
				
			}
		}		
	}
	public void ExcluirFuncionario(String nomeFun) {
		for (int i = 0; i < fun.size(); i++) {
			if (fun.get(i).getNome().equals(nomeFun)){
				fun.remove(i);
				System.out.println("Funcionario Removido com Sucesso!!");
			}else{
				System.out.println("Funcionario Inexistente!");
			}
			
		}			
	}
	public void AlterarFuncionario() {
		System.out.println("Digite o Nome do Funcionario que deseja Alterar");
		String nome = sc.next();
		System.out.println("Digite o novo nome");
		String novoNome = sc.next();
		
		for (int i = 0; i < fun.size(); i++) {
			if(fun.get(i).getNome().equals(nome)){
				fun.get(i).setNome(novoNome);
				System.out.println("Nome Alterado com Sucesso!");
				
			}else{
				System.out.println("Funcionario nao Encontrado!!");
			}
			
		}		
	}

}
