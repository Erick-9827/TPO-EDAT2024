package PropiosTPO;

public class Ciudad {

    private String nombre;
    private boolean alojamientoDisp;
    private boolean sedeDeCopa;

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean equals(Ciudad ciudad) {

        return this.nombre.equals(ciudad.getNombre());

    }
    

}

