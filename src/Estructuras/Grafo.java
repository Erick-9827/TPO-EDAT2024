package Estructuras;
import PropiosTPO.Ciudad;

public class Grafo {

    private NodoVert primerNodo;

    public Grafo() {
    }

    public void insertarVertice(Ciudad ciudad) {
        NodoVert nuevo;
        if (primerNodo == null) {
            nuevo = new NodoVert(ciudad, null);
            this.primerNodo = nuevo;
        } else {
            NodoVert aux = this.primerNodo;
            boolean noExiste = true;
            while (aux != null && noExiste) {
                if (aux.getCiudad().equals(ciudad)) {
                    noExiste = false;
                }
                aux = aux.getSigNodoVert();
            }
            if (noExiste) {
                nuevo = new NodoVert(ciudad, this.primerNodo);
                this.primerNodo = nuevo;
            }

        }

    }

    public boolean eliminarVertice(String elem) {
        boolean exito = false;

        if (!esVacio()) {
            if (this.primerNodo.getCiudad().getNombre().equals(elem)) {
                this.primerNodo = this.primerNodo.getSigNodoVert();
                exito = true;
            } else {
                NodoVert anterior = this.primerNodo;
                NodoVert actual = this.primerNodo.getSigNodoVert();

                while (!exito && actual != null) {
                    if (actual.getCiudad().getNombre().equals(elem)) {
                        System.out.println("elimino " + actual.getCiudad().getNombre());
                        actual.eliminarArcosDeAdyacentes();
                        anterior.setSigNodoVert(actual.getSigNodoVert());
                        exito = true;
                    }
                    anterior = actual;
                    actual = anterior.getSigNodoVert();

                }
            }

        }

        return exito;
    }

    public void insertarArco(String nombre1, String nombre2) {
        NodoVert ciudad1 = null;
        NodoVert ciudad2 = null;

        if (!esVacio()) {
            NodoVert actual = this.primerNodo;
            while (actual != null && (ciudad1 == null || ciudad2 == null)) {
                String nombreActual = actual.getCiudad().getNombre();
                if (nombreActual.equals(nombre1)) {
                    ciudad1 = actual;
                }
                if (nombreActual.equals(nombre2)) {
                    ciudad2 = actual;
                }
                actual = actual.getSigNodoVert();
            }
            if (ciudad1 != null && ciudad2 != null) {
                boolean exito = ciudad1.setArco(ciudad2, 2);
                if (exito) {
                    System.out.println("no existe arco");
                    ciudad2.setArco(ciudad1, 2);
                }

            }

        }

    }

    public boolean eliminarArco(String nombre1, String nombre2) {
        boolean exito = false;
        NodoVert ciudad1 = null;
        NodoVert ciudad2 = null;

        if (!esVacio()) {
            System.out.println("elimino arco entre: " + nombre1 + " y " + nombre2);
            NodoVert actual = this.primerNodo;
            while (actual != null && (ciudad1 == null || ciudad2 == null)) {
                String nombreActual = actual.getCiudad().getNombre();
                if (nombreActual.equals(nombre1)) {
                    ciudad1 = actual;
                }
                if (nombreActual.equals(nombre2)) {
                    ciudad2 = actual;
                }
                actual = actual.getSigNodoVert();
            }
            if (ciudad1 != null && ciudad2 != null) {
                ciudad1.eliminarArco(nombre2);
                ciudad2.eliminarArco(nombre1);
            }

        }

        return exito;
    }
    public String toString() {
        String respuesta = "";
        if (!esVacio()) {
            NodoVert actual = this.primerNodo;

            while (actual != null) {
                respuesta += "\n" + actual.toString() + "\t";
                actual = actual.getSigNodoVert();
            }
        }
        return respuesta;
    }

    public boolean esVacio() {
        return this.primerNodo == null;
    }
    // Metodos del TPO
    

    

}