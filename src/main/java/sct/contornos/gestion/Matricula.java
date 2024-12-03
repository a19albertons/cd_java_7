

package sct.contornos.gestion;

import sct.contornos.persona.Alumno;

/**
 *
 * @author ladmin
 */
public class Matricula {
    Alumno Alumno;
    Modulo Modulo;
    Integer nota;
    String Curso;

    public Matricula() {
    }

    public Matricula(Alumno Alumno, Modulo Modulo, Integer nota, String Curso) {
        this.Alumno = Alumno;
        this.Modulo = Modulo;
        this.nota = nota;
        this.Curso = Curso;
    }

    public Alumno getAlumno() {
        return Alumno;
    }

    public void setAlumno(Alumno Alumno) {
        this.Alumno = Alumno;
    }

    public Modulo getModulo() {
        return Modulo;
    }

    public void setModulo(Modulo Modulo) {
        this.Modulo = Modulo;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    @Override
    public String toString() {
        return "Matricula{" + "Alumno=" + Alumno + ", Modulo=" + Modulo + ", nota=" + nota + ", Curso=" + Curso + '}';
    }
    
    
}
