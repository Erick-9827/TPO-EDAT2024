package PropiosTPO;

public class Equipo {
    private Comparable nombrePais;
    private String directorTecnico;
    private char grupo;
    private int puntaje;
    private int cantGolesFavor;
    private int cantGolesContra;

    public Equipo(String pais, String directorTecnico, char grupo) {
        this.nombrePais = pais;
        this.directorTecnico = directorTecnico;
        this.grupo = grupo;
    }

    public Comparable getNombrePais() {
        return nombrePais;
    }

    public String getDirectorTecnico() {
        return directorTecnico;
    }

    public char getGrupo() {
        return grupo;
    }

    

}
