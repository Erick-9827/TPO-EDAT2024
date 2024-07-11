import Estructuras.Grafo;
import PropiosTPO.Ciudad;


    public class prueba {

        public static void main(String[] args) {
    
            Grafo grafo = new Grafo();
            grafo.insertarVertice(new Ciudad("Neuquen"));
            grafo.insertarVertice(new Ciudad("Plottier"));
            grafo.insertarVertice(new Ciudad("Centenario"));
            grafo.insertarVertice(new Ciudad("Cipolletti"));
            grafo.insertarVertice(new Ciudad("Senillosa"));
            System.out.println(grafo.toString());
    
            grafo.insertarArco("Cipolletti", "Plottier");
            grafo.insertarArco("Cipolletti", "Plottier");
            grafo.eliminarVertice("Cipolletti");
    
            System.out.println(grafo.toString());
    
        }
    
    }
    
