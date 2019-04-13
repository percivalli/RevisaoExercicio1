package br.com.digitalhouse;

class Professor implements Docente {
    private String nome;
    private String rd;

    Professor() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRd() {
        return this.rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    public void darAula() {
        System.out.println("Professor está dando aula.");
    }

    public void fazerChamada() {
        System.out.println("Professor está fazendo a chamada dos alunos.");
    }
}
