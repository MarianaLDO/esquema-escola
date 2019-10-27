package interfaceAcademico;

import esquemaEscola.Aluno;
import esquemaEscola.Disciplina;
import esquemaEscola.Professor;
import esquemaEscola.Turma;

public interface Academico {
	
	void adicionarDisciplina(String nome);
	
	void adicionarProfessor(String matricula, String nome);
	
	void adicionarAluno(String matricula, String nome);
	
	void adicionarTurma(Professor[] profs, Disciplina d, Aluno[] alunos);
	
	Turma[] listarTurmas();
	
	Turma[] listarTurmas(Aluno aluno);
}
