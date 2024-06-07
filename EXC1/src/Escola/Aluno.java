package Escola;


public class Aluno {
	
	
	private int matricula;
	private String nome;
	private Serie serie;
	private Periodo periodo;
	
	public Aluno(int matricula, String nome, String periodo,String serie) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.serie = Serie.valueOf(serie);
		this.periodo = Periodo.valueOf(periodo);
		
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	
		@Override
	    public String toString() {
	        return  "Matricula= " + matricula +
	                "| Nome ='" + nome + '\'' +
	                "| Serie = '" + serie + '\'' +
	                "| Periodo ='" + periodo + '\'' +
	                '|';
	    }

}