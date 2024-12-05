

package sct.contornos.persona;

import java.util.Date;

/**
 *
 * @author A19AlbertoNS
 */
public class Profesor extends Persona {
    private String especialidad;
    private String cuerpo;
    private boolean sustituto;
    private Date fecOposicion;

    public Profesor() {
        super();
    }

    public Profesor(String especialidad, String cuerpo, boolean sustituto, Date fecOposicion, String dni, String nombre, String apellido1, String apellido2, String correo, Integer movil, Date fecNacimiento) {
        super(dni, nombre, apellido1, apellido2, correo, movil, fecNacimiento);
        this.especialidad = especialidad;
        this.cuerpo = cuerpo;
        this.sustituto = sustituto;
        this.fecOposicion = fecOposicion;
    }

    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public boolean isSustituto() {
        return sustituto;
    }

    public void setSustituto(boolean sustituto) {
        this.sustituto = sustituto;
    }

    public Date getFecOposicion() {
        return fecOposicion;
    }

    public void setFecOposicion(Date fecOposicion) {
        this.fecOposicion = fecOposicion;
    }

    @Override
    public String toString() {
        return "Profesor{"+ super.toString() + "especialidad=" + especialidad + ", cuerpo=" + cuerpo + ", sustituto=" + sustituto + ", fecOposicion=" + fecOposicion + '}';
    }
    
    
}
