package Estructuras;
import PropiosTPO.Ciudad;

public class NodoVert {

    private Ciudad ciudad = null;
    private NodoVert sigNodoVert = null;
    private NodoAdy primerAdy = null;

    //constructor
    public NodoVert(Ciudad ciudad, NodoVert siguienteNodo) {
        this.ciudad = ciudad;
        this.sigNodoVert = siguienteNodo;
    }

    //modificadores
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void setSigNodoVert(NodoVert sigNodoVert) {
        this.sigNodoVert = sigNodoVert;
    }

    public boolean setArco(NodoVert vert, int etiqueta) {
        boolean exito = false;
        if (this.primerAdy == null) {
            this.primerAdy = new NodoAdy(vert, etiqueta);
            exito = true;
        } else {
            NodoAdy actual = this.primerAdy;
            NodoAdy siguiente = this.primerAdy.getSigAdyacente();
            boolean existe = false;
            boolean comparacion = actual.getVertice().getCiudad().equals(vert.getCiudad());
            if (comparacion) {
                existe = true;
            } else {
                while (!existe && siguiente != null) {
                    if (siguiente.getVertice().getCiudad().equals(vert.getCiudad())) {
                        existe = true;
                    }
                    actual = siguiente;
                    siguiente = actual.getSigAdyacente();
                }
            }

            if (!existe) {
                actual.setSigAdyacente(new NodoAdy(vert, etiqueta));
                exito = true;
            }
        }
        return exito;
    }

    public boolean eliminarArco(String nombre) {
        boolean exito = false;

        NodoAdy actual = this.primerAdy;
        if (actual != null) {
            boolean comparacion = actual.getVertice().getCiudad().getNombre().equals(nombre);
            if (comparacion) {
                this.primerAdy = this.primerAdy.getSigAdyacente();
                exito = true;
            } else {
                NodoAdy siguiente = actual.getSigAdyacente();

                while (siguiente != null && !exito) {
                    comparacion = siguiente.getVertice().getCiudad().getNombre().equals(nombre);
                    if (comparacion) {
                        actual.setSigAdyacente(siguiente.getSigAdyacente());
                        exito = true;
                    }
                    actual = siguiente;
                    siguiente = actual.getSigAdyacente();
                }

            }

        }

        return exito;

    }

    public boolean eliminarArcosDeAdyacentes() {
        boolean exito = true;
        NodoAdy actual = this.primerAdy;
        while (actual != null) {
            actual.getVertice().eliminarArco(this.ciudad.getNombre());
            actual = actual.getSigAdyacente();

        }

        return exito;
    }
    //lectores

    public NodoVert getSigNodoVert() {
        return sigNodoVert;
    }

    public NodoAdy getNodoAdyacente() {
        return primerAdy;
    }

    public boolean eliminarNodoAdy() {
        boolean exito = false;

        return exito;
    }

    public void setPrimerAdy(NodoAdy primerAdy) {
        this.primerAdy = primerAdy;
    }

    //observadores
    public Ciudad getCiudad() {
        return this.ciudad;
    }

    public boolean equals(NodoVert comparar) {
        return this.toString().equals(comparar.toString());
    }

    public String toString() {
        String respuesta = this.ciudad.getNombre() + "--> ";
        if (this.primerAdy != null) {
            NodoAdy actual = this.primerAdy;

            while (actual != null) {
                respuesta = respuesta + actual.getVertice().getCiudad().getNombre() + "-";
                actual = actual.getSigAdyacente();
            }

        }

        return respuesta;
    }
}
