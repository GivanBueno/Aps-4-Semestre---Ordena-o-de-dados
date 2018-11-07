
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
    public long menorTempo;
    
    Arquivo arquivo = new Arquivo();
    Ordenacao ordenacao = new Ordenacao();
    int[] arrayDesordenado = new int[100000];
    int[] arrayOrdenado = new int[100000];
    
    
    public void Bubblesort() throws IOException
    {
        arrayDesordenado = arquivo.lerArquivo("ArquivoDesordenado.txt");
        arrayOrdenado = ordenacao.bubbleSort(arrayDesordenado);
        this.tempoBubblesort = ordenacao.tempoTotalBubblesort;
    }
    
    public void Insertsort() throws IOException
    {
        arrayDesordenado = arquivo.lerArquivo("ArquivoDesordenado.txt");
        arrayOrdenado = ordenacao.insertSort(arrayDesordenado);
        this.tempoInsertsort = ordenacao.tempoTotalInsertsort;
    }
    
    public void Mergesort() throws IOException
    {
        arrayDesordenado = arquivo.lerArquivo("ArquivoDesordenado.txt");
        arrayOrdenado = ordenacao.mergeSort(arrayDesordenado);
        this.tempoMergesort = ordenacao.tempoTotalMergesort;
        
    }
    
    public void Quicksort() throws IOException
    {
        arrayDesordenado = arquivo.lerArquivo("ArquivoDesordenado.txt");
        arrayOrdenado = ordenacao.quickSort(arrayDesordenado);
        this.tempoQuicksort = ordenacao.tempoTotal;
    }
    
    public void Comparacao() throws IOException
    {
        Bubblesort();
        Insertsort();
        Mergesort();
        Quicksort();
        
        if(this.tempoBubblesort < this.tempoInsertsort && this.tempoBubblesort < this.tempoMergesort  && this.tempoBubblesort < this.tempoQuicksort)
        {
            this.menorTempo = this.tempoBubblesort;
        }
        else
            if(this.tempoInsertsort < this.tempoBubblesort && this.tempoInsertsort < this.tempoMergesort && this.tempoInsertsort < this.tempoQuicksort)
            {
                this.menorTempo = this.tempoInsertsort;
            }
            else
            {
                if(this.tempoMergesort < this.tempoBubblesort && this.tempoMergesort < this.tempoInsertsort && this.tempoMergesort < this.tempoQuicksort)
                {
                    this.menorTempo = this.tempoMergesort;
                }
                else if(this.tempoQuicksort < this.tempoBubblesort && this.tempoQuicksort < this.tempoInsertsort && this.tempoQuicksort < this.tempoMergesort)
                {
                    this.menorTempo = this.tempoQuicksort;
                }
            }
    }
    
    
    
 
        
 
       
    
        
      
        
    
}
