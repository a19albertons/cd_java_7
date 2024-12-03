

package sct.contornos.persona;

/**
 *
 * @author ladmin
 */
public class Alumno {
    String codigoXade;
    boolean autorizaTutores;

    public Alumno() {
    }

    public Alumno(String codigoXade, boolean autorizaTutores) {
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
        return "Alumno{" + "codigoXade=" + codigoXade + ", autorizaTutores=" + autorizaTutores + '}';
    }
    
    
}
