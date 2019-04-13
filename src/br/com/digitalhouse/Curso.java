package br.com.digitalhouse;

import java.util.List;
import java.util.Set;

public class Curso {
    private String nome;
    private Set<Aula> aulas;
    private List<Aluno> alunos;
    private Professor professor;

    Curso() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Aula> getAulas() {
        return this.aulas;
    }

    public void setAulas(Set<Aula> aulas) {
        this.aulas = aulas;
    }

    public List<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}


