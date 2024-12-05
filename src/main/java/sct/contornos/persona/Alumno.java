

package sct.contornos.persona;

import java.util.Date;

/**
 *
 * @author A19AlbertoNS
 */
public class Alumno extends Persona{
    private String codigoXade;
    private boolean autorizaTutores;

    public Alumno() {
    }

    public Alumno(String codigoXade, boolean autorizaTutores, String dni, String nombre, String apellido1, String apellido2,String correo, Integer movil, Date fecNacimiento) {
        super(dni, nombre, apellido1, apellido2, correo, movil, fecNacimiento);
        this.codigoXade = codigoXade;
        this.autorizaTutores = autorizaTutores;
    }


    public String getCodigoXade() {
        return codigoXade;
    }

    public void setCodigoXade(String codigoXade) {
        this.codigoXade = codigoXade;
    }

    public boolean isAutorizaTutores() {
        return autorizaTutores;
    }

    public void setAutorizaTutores(boolean autorizaTutores) {
        this.autorizaTutores = autorizaTutores;
    }

    @Override
    public String toString() {
        return "Alumno{"+ super.toString() + "codigoXade=" + codigoXade + ", autorizaTutores=" + autorizaTutores + '}';
    }
    
    
}
