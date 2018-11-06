
package Modelo;

import java.io.IOException;

/**
 *
 * @author julio
 */
public class Controle 
{
    public long tempo;
    
    Arquivo arquivo = new Arquivo();
    Ordenacao ordenacao = new Ordenacao();
    int[] arrayDesordenado = new int[100000];
    int[] arrayOrdenado = new int[100000];
    
    
    public void Bubblesort() throws IOException
    {
        arrayDesordenado = arquivo.lerArquivo("ArquivoDesordenado.txt");
        arrayOrdenado = ordenacao.bubbleSort(arrayDesordenado);
        this.tempo = ordenacao.tempoTotal;
    }
    
    public void Insertionsort() throws IOException
    {
        arrayDesordenado = arquivo.lerArquivo("ArquivoDesordenado.txt");
        arrayOrdenado = ordenacao.insertionSort(arrayOrdenado);
        this.tempo = ordenacao.tempoTotal;
    }
    
    
    
    
    
    
 
        
 
        public int[] mergeSort(int[] array) 
        {
            long tempoinicial = System.currentTimeMillis();
            array = Modelo.Ordenacao.sort(array);
            long tempofinal = System.currentTimeMillis();
            this.tempo = tempofinal - tempoinicial;
            return array;
        }
    
        public int[] quickSort(int[] array) 
        {
            long tempoinicial = System.currentTimeMillis();
            array = Modelo.Ordenacao.quicksort(array, 0, (array.length - 1));
            long tempofinal = System.currentTimeMillis();
            this.tempo = tempofinal - tempoinicial;
            return array;
        }
      
        
    
}
