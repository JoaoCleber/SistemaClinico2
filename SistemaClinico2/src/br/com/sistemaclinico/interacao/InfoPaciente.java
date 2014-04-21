package br.com.sistemaclinico.interacao;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.sismaclinico.interfaces.CadastrarPaciente;
import br.com.sistemaclinico.model2.Paciente;

public class InfoPaciente extends Paciente implements CadastrarPaciente {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Paciente> paciente = new ArrayList<>();
	
	protected void Paciente(){
		
	}
	
	void Paciente (String nome, String cpf, String rg){
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	

	@Override
	public void CadastrarPaciente() {
		Paciente p = new Paciente();
		System.out.println("Digite o nome do Paciente");
		this.nome = sc.next();
		p.setNome(nome);
		System.out.println("Digite o CPF ");
		this.cpf = sc.next();
		p.setCpf(cpf);
		System.out.println("Digite o RG");
		this.rg = sc.next();
		p.setCpf(cpf);
		
		paciente.add(p);
		
		
	}

	@Override
	public void ListarPaciente() {
		if (paciente.size() == 0){
			System.out.println("Lista de Paciente Vazia !");
		}else{
			for (Paciente pac : paciente) {
				System.out.println("Lista de Pacientes");
				System.out.println("NOME " + pac.getNome());
				System.out.println("CPF" + pac.getCpf());
				System.out.println("RG" + pac.getRg());
				
			}
		}
		
	}
	public void ExcluirPaciente(String nomePaciente) {
		
		for (int i = 0; i < paciente.size(); i++) {
			if (paciente.get(i).getNome().equals(nomePaciente)) {
				paciente.remove(i);
				System.out.println("Paciente Removido com Sucesso!");
				
			} else {
				System.out.println("Funcionario Inexistente !!!");

			}
			
		}
		
		
	}

	@Override
	public void AlterarPaciente() {
		System.out.println("Digite o nome do Paciente a ser Alterado!!!");
		String nome = sc.next();
		System.out.println("Digite o novo nome");
		String novoNome = sc.next();
		
		for (int i = 0; i < paciente.size(); i++) {
			if(paciente.get(i).getNome().equals(nome)){
				paciente.get(i).setNome(novoNome);
				System.out.println("Nome alterado com Sucesso");
			}else{
				System.out.println("Paciente Inexistente");
			}
			
		}
		
	}
}
