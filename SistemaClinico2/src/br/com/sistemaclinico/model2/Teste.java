package br.com.sistemaclinico.model2;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.sistemaclinico.interacao.InfoFuncionario;

//@Desenvolvido por Joao Cleber


public class Teste {
	

	public static void main(String[] args) {
	
	
		Scanner sc = new Scanner(System.in);
		int opcao;
	
		
		Menu m = new Menu();
		
		
			try{
			
				m.Menu();
				InfoFuncionario info = new InfoFuncionario();
				
				
				System.out.println("Digite Sua Opcao :");
				opcao = sc.nextInt();
				
				do {
					if(opcao == 1){
						
							info.CadastrarFuncionario();
					
					}if(opcao == 2){
							
						info.ListarFuncionario();	
					}if (opcao == 3){
						System.out.println("Digite o nome a ser removido :");
						String nome = sc.next();
						info.ExcluirFuncionario(nome);
						
					}if (opcao == 4){
						info.AlterarFuncionario();
						
					}
					
					if(opcao == 0){
						break;
					}
				
					m.Menu();
					System.out.println("Digite outra opcao");
					sc.nextInt();
						
					
				} while (opcao != 0);
				
				} 
							
				catch (InputMismatchException e) {
					System.out.println("Opcao Invalida, Digite outra");
					sc.nextInt();
					
				
					
				}
				catch (NumberFormatException e1){
					System.out.println("CPF Invalido");
					
					sc.next();
				}
			
		} 


}