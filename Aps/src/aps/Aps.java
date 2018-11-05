/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;
import Modelo.Arquivo;
import Apresentacao.frmPrincipal;
import Modelo.Controle;
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
    public static void main(String[] args) throws IOException //throws IOException 
    {
       frmPrincipal frmp = new frmPrincipal();
       frmp.setVisible(true);
        
        /*Arquivo arquivo = new Arquivo();
        Controle controle = new Controle();
       
        
        
        int[] arrayDesordenado = new int[65000];
        int[] arrayOrdenado = new int[65000];
        
        
        arrayDesordenado = arquivo.lerArquivo("C:\\Users\\User\\Documents\\Aps 4º Semestre\\database.txt");
        arrayOrdenado = controle.bubbleSort(arrayDesordenado);
        arquivo.gravarArquivo("C:\\Users\\User\\Documents\\Aps 4º Semestre\\database.txt", arrayOrdenado);*/
    }
    
}
