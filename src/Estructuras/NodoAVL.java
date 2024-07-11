package Estructuras;

public class NodoAVL {

    private Comparable elemeto;
    private NodoAVL hijoDerch;
    private NodoAVL hijoIzq;
    private int altura=0;

    //constructor
    public NodoAVL(Comparable elemento) {
        this.elemeto = elemento;
    }

    //modificadores
    public void setElemento(Comparable elemento) {
        this.elemeto = elemento;
    }

    //observadores
    public Comparable getElemento() {
        return this.elemeto;
    }

    public NodoAVL getDerecho() {
        return this.hijoDerch;
    }

    public NodoAVL getIzquierdo() {
        return this.hijoIzq;
    }

    public void setDerecho(NodoAVL derech) {
        this.hijoDerch = derech;
    }

    public void setIzquierdo(NodoAVL izq) {
        this.hijoIzq = izq;
    }

    public void setElemeto(Comparable elemeto) {
        this.elemeto = elemeto;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Comparable getElemeto() {
        return elemeto;
    }

    public int getAltura() {
        return altura;
    }
     public void recalcularAltura() {
        int altD = -1, altI = -1;
        if (hijoDerch != null) {
            altD = hijoDerch.getAltura();
        }
        if (hijoIzq != null) {
            altI = hijoIzq.getAltura();
        }
        altura = Math.max(altI, altD) + 1;
    }

    


}

