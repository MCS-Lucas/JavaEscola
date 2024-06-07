package Escola;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private List<Integer> removedAlunos = new ArrayList<>();
	
	private Random gerador = new Random();	
	
	public Menu(){
		 
	}
	
	
	private int gerarMatricula() {
	
		if(!removedAlunos.isEmpty()) {
			
			return removedAlunos.remove(0);
		}
		
	return gerador.nextInt(10000);
		
	}

	public Aluno cadastrarAluno() {
		
		
		boolean matriculaCorrecao;
		System.out.println("\nInsira o nome do Aluno = ");
		String nomeAluno = sc.nextLine();
		System.out.println("Insira o periodo do Aluno (MATUTINO, VESPERTINO OU NOTURNO)= ");
		String periodoAluno = sc.nextLine().toUpperCase();
		System.out.println("Insira a serie do Aluno (PRIMEIRA A NONA)= ");
		String serieAluno = sc.nextLine().toUpperCase();
		int matriculaAluno = gerarMatricula();
		
		Aluno aluno = new Aluno(matriculaAluno, nomeAluno, periodoAluno, serieAluno);	
		
		do {
		
			matriculaCorrecao = false;
				
			for(Aluno alunoI : alunos) {
				
				if(aluno.getMatricula() == alunoI.getMatricula()){
					
					matriculaCorrecao = true;
					aluno.setMatricula(gerarMatricula());
					
					break;	
				}
			}
		}while(matriculaCorrecao);
		
		this.alunos.add(aluno);
		
		System.out.println("\nAluno cadastrado com sucesso! \n");
		
		return aluno;
		
	}
	
	public void atualizarAlunos() {
		
		System.out.println("\nInsira a matrícula do aluno que deseja editar os dados: ");
		int matricula = sc.nextInt();
		sc.nextLine();
		Aluno alunoAtualizar = null;
		Periodo periodo;
		Serie serie;
		
			for(Aluno alunoI : alunos ) {
				
				if(alunoI.getMatricula() == matricula) {
					
					alunoAtualizar = alunoI;
					
					break;
				}
				
			}	
				
			if(alunoAtualizar != null) {
				
				 System.out.print("Insira o novo nome do Aluno: ");
		         String nomeAluno = sc.nextLine();
		         
		         
		         System.out.print("Insira o novo periodo do Aluno: ");
		         String periodoAluno = sc.nextLine().toUpperCase();
		         periodo = Periodo.valueOf(periodoAluno);
		         
		         System.out.print("Insira o nova serie do Aluno: ");
		         String serieAluno = sc.nextLine().toUpperCase();
		         serie = Serie.valueOf(serieAluno);
		       
		         
				alunoAtualizar.setNome(nomeAluno);
				alunoAtualizar.setPeriodo(periodo);
				alunoAtualizar.setSerie(serie);
			}
		
		
	}
	
 	public void removerAluno() {
		
		
		System.out.println("\nLista de alunos:\n");
		
		for(Aluno alunoI : alunos) {
			
			System.out.format("(%d) %s \n", alunoI.getMatricula(),  alunoI.getNome());
		}
		
		System.out.println("Qual matricula deseja remover? \n");
		int matricula  = sc.nextInt();
		sc.nextLine();
		Aluno alunoRemover = null;
		
		for(Aluno alunoI : alunos) {	
			
			if(alunoI.getMatricula() == matricula) {
				
				alunoRemover = alunoI;
				
				break;
			}
		}
		
		if(alunoRemover != null) {
			
			alunos.remove(alunoRemover);
			removedAlunos.add(alunoRemover.getMatricula());
			System.out.println("\nAluno removido com sucesso!");
			
		}else {
			
			 System.out.println("\nMatrícula não encontrada.");
			
		}
		 
	}
	
	public void listarAlunos() {
		
		if(alunos.isEmpty()) {
			
			System.out.println("\nNenum aluno cadastrado.");
			
		}else {
			
			System.out.println("\nLista de alunos:\n");
			
			for (Aluno aluno : this.alunos) {
				System.out.println(aluno);
			
			}
		
			
		}
	}
}
	
