package br.com.digitalhouse;

import java.util.Iterator;
import java.util.Set;

class Aluno {
    private String nome;
    private String sobrenome;
    private String ra;

    public Aluno(String nome, String sobrenome, String ra) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ra = ra;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void assistirAula(Set<Aula> aulas) {
        Iterator var2 = aulas.iterator();

        while(var2.hasNext()) {
            Aula aula = (Aula)var2.next();
            System.out.println(this.nome + " está assistindo a aula de " + aula.getMateria().getNome());
        }

    }

    public void fazerLicaoDeCasa() {
        System.out.println(this.nome + " está fazendo lição de casa.");
    }
}
