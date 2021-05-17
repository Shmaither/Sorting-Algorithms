
package algoritmosordenamiento;

import java.util.ArrayList;


public class AlgoritmosOrdenamiento {

    public ArrayList<Integer> numeros = new ArrayList(2000);

    public ArrayList<Integer> burbuja = new ArrayList();
    public ArrayList<Integer> shellsort = new ArrayList();
    public ArrayList<Integer> quicksort = new ArrayList();
    
    public double[] tiempos = new double[3];

    public void genera() {
        
        generaNumerosAleatorios();
        
        // Datos aleatorios clonados al arraylist que recibira el ordenamiento respectivo.
        burbuja = (ArrayList<Integer>) numeros.clone();
        shellsort = (ArrayList<Integer>) numeros.clone();
        quicksort = (ArrayList<Integer>) numeros.clone();
        metodoBurbuja();
        metodoShellsort();
        
        long inicia = System.nanoTime();
        metodoQuicksort(0, quicksort.size()-1);
        long termina = System.nanoTime();

        double total = (double) (termina - inicia) / 1000000000; // Se comvierte de nanosegundos a segundos.
        tiempos[2] = total;    
    }
    
    public void generaNumerosAleatorios(){
        int numero;
        
        // Genera 2000 números entre 1 y 9999
        for (int i = 1; i <= 2000; i++) {
            numero = (int) (Math.random() * 9999 + 1);
            if (numeros.contains(numero)) {
                i--;
            } else {
                numeros.add(numero);
            }    
        }
    }
    
    public void metodoBurbuja(){

        int aux;
        
        long inicia = System.nanoTime();
        for (int i = 0; i < burbuja.size() - 1; i++) {
            for (int j = 0; j < burbuja.size() - i - 1; j++) {
                if (burbuja.get(j + 1) < burbuja.get(j)) {
                    aux = burbuja.get(j + 1);
                    burbuja.set((j+1), burbuja.get(j));
                    burbuja.set(j, aux);
                }
            }
        }
        long termina = System.nanoTime();
        double total = (double) (termina - inicia) / 1000000000; // Se comvierte de nanosegundos a segundos.
        tiempos[0] = total;
    }
    

    public void metodoShellsort(){
    
        int salto, aux, i;
        boolean cambios;
  
        long inicia = System.nanoTime();
        for (salto = (shellsort.size() / 2); salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < shellsort.size(); i++)   // se da una pasada
                {
                    if (shellsort.get(i - salto) > shellsort.get(i)) {       // y si están desordenados
                        aux = shellsort.get(i);                  // se reordenan
                        shellsort.set(i, shellsort.get(i - salto));
                        shellsort.set(i - salto, aux);
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
        long termina = System.nanoTime();       
        double total = (double) (termina - inicia) / 1000000000; // Se comvierte de nanosegundos a segundos.
        tiempos[1] = total;
    }
    

    public void metodoQuicksort(int izq, int der){
   
        int pivote = quicksort.get(izq); // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        int aux;
        
       
        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            while (quicksort.get(i) <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (quicksort.get(j) > pivote) {
                j--;           // busca elemento menor que pivote
            }
            if (i < j) {                        // si no se han cruzado                      
                aux = quicksort.get(i);                      // los intercambia
                quicksort.set(i, quicksort.get(j));
                quicksort.set(j, aux);
            }
        }

        quicksort.set(izq, quicksort.get(j));      // se coloca el pivote en su lugar de forma que tendremos                                    
        quicksort.set(j, pivote);      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            metodoQuicksort(izq, j - 1);          // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            metodoQuicksort(j + 1, der);          // ordenamos subarray derecho
        }

    }
    
}
