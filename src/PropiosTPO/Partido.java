package PropiosTPO;

public class Partido {
    private Equipo equipo1, equipo2;
    private String ronda, nombreEstadio;
    private Ciudad city;
    private int cantGolesEquipo1, cantGolesEquipo2;

    public Partido(Equipo equipo1, Equipo equipo2, String ronda, String nombreEstadio, Ciudad city) {
        if (equipo1.getNombrePais().compareTo(equipo2.getNombrePais()) > 0) {
            this.equipo1 = equipo1;
            this.equipo2 = equipo2;
        } else {
            this.equipo1 = equipo2;
            this.equipo2 = equipo1;
        }
        this.ronda = ronda;
        this.nombreEstadio = nombreEstadio;
        this.city = city;
    }

}
