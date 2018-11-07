/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author User
 */
public abstract class absPropriedades
{
    public long tempoBubblesort;
    public long tempoInsertsort;
    public long tempoMergesort;
    public long tempoQuicksort;
    public long menorTempo;
    public long maiorTempo;
    public int tamanhoDoArray = 100000;
    public String nomeOrdenacao;
    
    public int[] arrayDesordenado = new int[100000];
    public int[] arrayOrdenado = new int[100000];
    
    public long tempoTotalQuicksort;
    public long tempoTotalBubblesort;
    public long tempoTotalMergesort;
    public long tempoTotalInsertsort;
}
