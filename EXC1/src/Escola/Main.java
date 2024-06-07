package Escola;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		
		
		int op = 0;
		Scanner sc = new Scanner(System.in);
		
	       
	        do {
	            System.out.println("\n--- Menu Principal ---");
	            System.out.println("1. Adicionar Aluno");
	            System.out.println("2. Remover Aluno");
	            System.out.println("3. Atualizar Aluno");
	            System.out.println("4. Listar Alunos");
	            System.out.println("5. Sair");
	            System.out.print("Escolha uma opção: ");
	            op = sc.nextInt();
	            sc.nextLine();

	            
	            
	            switch (op) {
	            
	                case 1:
	                	menu.cadastrarAluno();
	                    break;
	                    
	                case 2:
	                	
	                    menu.removerAluno();
	                    break;
	                    
	                case 3:
	                	
	                    menu.atualizarAlunos();   
	                    break;
	                 
	                case 4:
	  
	                    menu.listarAlunos();
	                    break; 
	                    
	                case 5:
	                    System.out.println("Saindo do sistema...");
	                    break;
	                    
	                default:
	                    System.out.println("Opção inválida, tente novamente.");
	            }
	        } while (op != 5);
	    }
	} 


