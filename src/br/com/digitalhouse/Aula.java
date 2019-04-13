package br.com.digitalhouse;

class Aula {
    private Materia materia;
    private String horarioInicio;
    private String horarioTermino;

    public Aula(Materia materia, String horarioInicio, String horarioTermino) {
        this.materia = materia;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
    }

    public Materia getMateria() {
        return this.materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getHorarioInicio() {
        return this.horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioTermino() {
        return this.horarioTermino;
    }

    public void setHorarioTermino(String horarioTermino) {
        this.horarioTermino = horarioTermino;
    }
}

