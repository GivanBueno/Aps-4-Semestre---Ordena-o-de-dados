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
                //cria um arquivo (vazio)
                arquivo.createNewFile();
            }
 
            //caso seja um diretÃ³rio, Ã© possÃ­vel listar seus arquivos e diretÃ³rios
            File[] arquivos = arquivo.listFiles();
 
            //escreve no arquivo
            FileWriter fw = new FileWriter(arquivo, true);
 
            BufferedWriter bw = new BufferedWriter(fw);
            //inicializa gerador de numeros aleatÃ³rios
            Random gerador = new Random();
 
            //gera aleatorio e grava com ;
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