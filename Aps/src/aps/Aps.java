/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;
import Modelo.Arquivo;
import Apresentacao.frmPrincipal;
import Modelo.NumeroRandomico;
import Modelo.Ordenacao;
import java.io.IOException;

/**
 *
 * @author julio
 */
public class Aps 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) //throws IOException 
    {
       frmPrincipal frmp = new frmPrincipal();
       frmp.setVisible(true);
        
        /*Arquivo arquivo = new Arquivo();
        Ordenacao ordenar = new Ordenacao();
        NumeroRandomico randomico = new NumeroRandomico();
        
        
        int[] arrayDesordenado = new int[65000];
        int[] arrayOrdenado = new int[65000];
        
        randomico.GerarNumeroRandomico();
        arrayDesordenado = arquivo.lerArquivo("C:\\Users\\User\\Documents\\Aps 4º Semestre\\database.txt");
        arrayOrdenado = ordenar.bubbleSort(arrayDesordenado);
        arquivo.gravarArquivo("C:\\Users\\User\\Documents\\Aps 4º Semestre\\database.txt", arrayOrdenado);*/
    }
    
}
