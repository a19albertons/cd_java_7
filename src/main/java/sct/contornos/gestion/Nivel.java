

package sct.contornos.gestion;

/**
 *
 * @author A19AlbertoNS
 */
public class Nivel {
    String nivel;

    public Nivel() {
    }

    public Nivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Nivel{" + "nivel=" + nivel + '}';
    }
    
}
