package Estructuras;
public class NodoAdy {
    private NodoVert vertice;
    private int etiqueta;
    private NodoAdy sigAdyacente;

    public NodoAdy(NodoVert vert, int etiqueta) {
        this.vertice = vert;
        this.etiqueta = etiqueta;
    }

    public NodoVert getVertice() {
        return vertice;
    }

    public int getEtiqueta() {
        return etiqueta;
    }

    public NodoAdy getSigAdyacente() {
        return sigAdyacente;
    }

    public void setVertice(NodoVert vertice) {
        this.vertice = vertice;
    }

    public void setEtiqueta(int etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setSigAdyacente(NodoAdy sigAdyacente) {
        this.sigAdyacente = sigAdyacente;
    }
    
    
}
