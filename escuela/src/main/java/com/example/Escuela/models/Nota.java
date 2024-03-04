package com.example.Escuela.models;

public class Nota {
    private Integer id;
    private double nota;
    private Estudiante estudiante;
    private Asignatura asignatura;

    public Nota (int id, double nota, Estudiante estudiante, Asignatura asignatura) {
        this.id = id;
        this.nota = nota;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    public int getId() {
        return id;
    }

    public double getNota() {
        return nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
