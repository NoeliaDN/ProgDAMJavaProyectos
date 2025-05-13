package T6.Colas;

public class Paciente {
    private String nombre;
    private String sintoma;
    private boolean esEmergencia;

    public Paciente(String nombre, String sintoma, boolean esEmergencia) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.esEmergencia = esEmergencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public boolean isEsEmergencia() {
        return esEmergencia;
    }

    public void setEsEmergencia(boolean esEmergencia) {
        this.esEmergencia = esEmergencia;
    }

    @Override
    public String toString() {
        return (nombre + " " + sintoma + " " + esEmergencia);
    }
}
