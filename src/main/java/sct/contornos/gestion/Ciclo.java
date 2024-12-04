

package sct.contornos.gestion;

/**
 *
 * @author A19AlbertoNS
 */
public class Ciclo {
    private String codigo;
    private String nombre;
    private Nivel Nivel;
    private Centro Centro;

    public Ciclo() {
    }

    public Ciclo(String codigo, String nombre, Nivel Nivel, Centro Centro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Nivel = Nivel;
        this.Centro = Centro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nivel getNivel() {
        return Nivel;
    }

    public void setNivel(Nivel Nivel) {
        this.Nivel = Nivel;
    }

    public Centro getCentro() {
        return Centro;
    }

    public void setCentro(Centro Centro) {
        this.Centro = Centro;
    }

    @Override
    public String toString() {
        return "Ciclo{" + "codigo=" + codigo + ", nombre=" + nombre + ", Nivel=" + Nivel + ", Centro=" + Centro + '}';
    }
    
    
}
