package Modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
 
public class NumeroRandomico 
{
    public String mensagem;
 
    public void GerarNumeroRandomico() throws IOException 
    {
        this.mensagem = "";
        
        try
        {
            File arquivo = new File("ArquivoDesordenado.txt");
    
 
            if (!arquivo.exists()) 
            {
                
                arquivo.createNewFile();
            }
 
            File[] arquivos = arquivo.listFiles();
 
            FileWriter fw = new FileWriter(arquivo, true);
 
            BufferedWriter bw = new BufferedWriter(fw);
            Random gerador = new Random();
 
            for (long x=0;x<100000;x++)
            bw.write(gerador.nextInt(100000)+";");
            bw.newLine();
 
            bw.close();
            fw.close();
            
            this.mensagem = "Arquivo gerado com sucesso";
        }
        catch (Exception e)
        {
            this.mensagem = "Erro em gerar o arquivo";
        }
        
    }
    
}