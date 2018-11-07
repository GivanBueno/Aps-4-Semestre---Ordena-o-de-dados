
package Modelo;

import java.io.IOException;

/**
 *
 * @author julio
 */
public class Controle 
{
    
    public long tempoBubblesort;
    public long tempoInsertsort;
    public long tempoMergesort;
    public long tempoQuicksort;
    
    Arquivo arquivo = new Arquivo();
    Ordenacao ordenacao = new Ordenacao();
    int[] arrayDesordenado = new int[100000];
    int[] arrayOrdenado = new int[100000];
    
    
    public void Bubblesort() throws IOException
    {
        arrayDesordenado = arquivo.lerArquivo("ArquivoDesordenado.txt");
        arrayOrdenado = ordenacao.bubbleSort(arrayDesordenado);
        this.tempoBubblesort = ordenacao.tempoTotal;
    }
    
    public void Insertsort() throws IOException
    {
        arrayDesordenado = arquivo.lerArquivo("ArquivoDesordenado.txt");
        arrayOrdenado = ordenacao.insertSort(arrayOrdenado);
        this.tempoInsertsort = ordenacao.tempoTotal;
    }
    
    public void Mergesort() throws IOException
    {
        arrayDesordenado = arquivo.lerArquivo("ArquivoDesordenado.txt");
        arrayOrdenado = ordenacao.mergeSort(arrayOrdenado);
        this.tempoMergesort = ordenacao.tempoTotal;
        
    }
    
    public void Quicksort() throws IOException
    {
        arrayDesordenado = arquivo.lerArquivo("ArquivoDesordenado.txt");
        arrayOrdenado = ordenacao.quickSort(arrayOrdenado);
        this.tempoQuicksort = ordenacao.tempoTotal;
    }
    
    
    
    
 
        
 
       
    
        
      
        
    
}
