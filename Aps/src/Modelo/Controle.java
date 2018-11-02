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
public class Controle 
{
    public class Ordenacao 
    {
 
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
            long tempototal = tempofinal - tempoinicial;
            System.out.println("Tempo de Processamento de InsertionSort: " + tempototal + "ms");
            return vetor;
        }
 
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
            long tempototal = tempofinal - tempoinicial;
            System.out.println("Tempo de Processamento de BubbleSort: " + tempototal + "ms");
            return vetor;
        }
 
        public int[] mergeSort(int[] array) 
        {
            long tempoinicial = System.currentTimeMillis();
            array = MergeSort.sort(array);
            long tempofinal = System.currentTimeMillis();
            long tempototal = tempofinal - tempoinicial;
            System.out.println("Tempo de Processamento de MergeSort: " + tempototal + "ms");
            return array;
        }
    
        public int[] quickSort(int[] array) 
        {
            long tempoinicial = System.currentTimeMillis();
            array = QuickSort.quicksort(array, 0, (array.length - 1));
            long tempofinal = System.currentTimeMillis();
            long tempototal = tempofinal - tempoinicial;
            System.out.println("Tempo de Processamento de QuickSort: " + tempototal + "ms");
            return array;
        }
      
        public void imprimirVetor(int[] array) 
        {
            for (int counter = 0; counter < (array.length - 1); counter++) 
            {
                System.out.println(array[counter]);
            }
        }
    }
}
