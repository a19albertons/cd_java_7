

package sct.contornos.persona;

import java.util.Date;

/**
 *
 * @author ladmin
 */
public class Profesor {
    String especialidad;
    String cuerpo;
    boolean sustituto;
    Date fecOposicion;

    public Profesor() {
    }

    public Profesor(String especialidad, String cuerpo, boolean sustituto, Date fecOposicion) {
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
        return "Profesor{" + "especialidad=" + especialidad + ", cuerpo=" + cuerpo + ", sustituto=" + sustituto + ", fecOposicion=" + fecOposicion + '}';
    }
    
    
}
