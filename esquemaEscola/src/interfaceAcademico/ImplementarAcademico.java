package interfaceAcademico;

import java.util.ArrayList;

import esquemaEscola.Aluno;
import esquemaEscola.Disciplina;
import esquemaEscola.Professor;
import esquemaEscola.Turma;

public class ImplementarAcademico {
		
	private Professor nome;
	private Professor matricula;
	private Aluno nomeAluno;
	private Aluno matriculaAluno;
	private Disciplina nomeDisciplina;
	private ArrayList<Disciplina> disciplinas;
	private ArrayList<Professor> professores;
	private ArrayList<Aluno> alunos;
	private ArrayList<Turma> turmas;
	public Professor getNome() {
		return nome;
	}
	public void setNome(Professor nome) {
		this.nome = nome;
	}
	public Professor getMatricula() {
		return matricula;
	}
	public void setMatricula(Professor matricula) {
		this.matricula = matricula;
	}
	public Aluno getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(Aluno nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public Aluno getMatriculaAluno() {
		return matriculaAluno;
	}
	public void setMatriculaAluno(Aluno matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
	public Disciplina getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(Disciplina nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public ArrayList<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public ArrayList<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(ArrayList<Turma> turmas) {
		this.turmas = turmas;
	}
	
	public void adicionarDisciplina(String nome) {
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		disciplinas.add(getNomeDisciplina());
	
	}
	public void adicionarProfessor(String matricula, String nome) {
		ArrayList<Professor> professores = new ArrayList<Professor>();
		professores.add(getMatricula());
	}
	
	public void adicionarAluno(String matricula, String nome) {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(getMatriculaAluno());
	}
	public void adicionarTurma(Professor[] profs, Disciplina d, Aluno[] aluno) {
		ArrayList<Professor> professores = new ArrayList<Professor>();
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		professores.add(getMatricula());
		disciplinas.add(getNomeDisciplina());
		alunos.add(getMatriculaAluno());
	}
}
