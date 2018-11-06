/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author julio
 */
public class Ordenacao 
{
    public long tempoTotal;
    
     public int[] bubbleSort(int vetor[]) 
    {
        
        long tempoinicial = System.currentTimeMillis();
        for (int i = vetor.length; i >= 1; i--) 
        {
            for (int j = 1; j < i; j++) 
            {
                if (vetor[j - 1] > vetor[j]) 
                {
                    int aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }
        long tempofinal = System.currentTimeMillis();
        this.tempoTotal = tempofinal - tempoinicial;
        return vetor;
    }
    
    
    public int[] insertionSort(int[] vetor) 
    {
        long tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++) 
        {
            int atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] >= atual) 
            {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;;
        }
        long tempofinal = System.currentTimeMillis();
        this.tempoTotal = tempofinal - tempoinicial;
        return vetor;
    }
    
   
 
    public static int[] sort(int[] array) 
    {
       
        if (array.length <= 1) 
        {
           
            return array;
        }
        int meio = array.length / 2;
        int[] dir = array.length % 2 == 0 ? new int[meio] : new int[meio + 1];
        int[] esq = new int[meio];
 
        int[] aux = new int[array.length];
 
        for (int i = 0; i < meio; i++) 
        {
            esq[i] = array[i];
        }
 
        int auxIndex = 0;
        for (int i = meio; i < array.length; i++) 
        {
            dir[auxIndex] = array[i];
            auxIndex++;
        }
 
        esq = sort(esq);
        dir = sort(dir);
 
        aux = mergesort(esq, dir);
 
        return aux;
    }
 
 
    public static int[] mergesort(int[] esq, int[] dir) 
    {
        int[] aux = new int[esq.length + dir.length];
 
        int indexDir = 0, indexEsq = 0, indexAux = 0;
 
        while (indexEsq < esq.length || indexDir < dir.length) 
        {
            if (indexEsq < esq.length && indexDir < dir.length) 
            {
                if (esq[indexEsq] <= dir[indexDir]) 
                {
                    aux[indexAux] = esq[indexEsq];
                    indexAux++;
                    indexEsq++;
                } 
                else 
                {
                    aux[indexAux] = dir[indexDir];
                    indexAux++;
                    indexDir++;
                }
            } 
            else if (indexEsq < esq.length) 
            {
                aux[indexAux] = esq[indexEsq];
                indexAux++;
                indexEsq++;
            } 
            
            else if (indexDir < dir.length) 
            
            {
                aux[indexAux] = dir[indexDir];
                indexAux++;
                indexDir++;
            }
        }
            
        return aux;
    }
    
    
    public static int[] quicksort(int vet[], int ini, int fim)
    {
 
        int meio;
 
        if (ini < fim) 
        {
 
            meio = partition(vet, ini, fim);
 
            quicksort(vet, ini, meio);
 
            quicksort(vet, meio + 1, fim);
 
        }
        
        return vet;
 
    }
 
 
 
    public static int partition(int vet[], int ini, int fim) 
    {
 
        int pivo, topo, i;
 
        pivo = vet[ini];
 
        topo = ini;
 
 
 
        for (i = ini + 1; i <= fim; i++) 
        {
 
            if (vet[i] < pivo) 
            {
 
                vet[topo] = vet[i];
 
                vet[i] = vet[topo + 1];
 
                topo++;
 
            }
 
        }
 
        vet[topo] = pivo;
 
        return topo;
 
    }
  
}
