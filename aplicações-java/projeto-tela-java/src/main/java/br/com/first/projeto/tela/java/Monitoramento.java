
package br.com.first.projeto.tela.java;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import java.util.List;

public class Monitoramento{
    
   Looca looca = new Looca();
   Memoria memoria = new Memoria();
   Processador processador = new Processador();
   DiscosGroup discoGroup = new DiscosGroup();
   
   List<Disco> discos;
   
   Double memoriaRam;
   String temperatura;  
   Integer qtdDeUso ;
   Double discoLivre;  
   
   public void formatarTemperatura(){
        String temp = looca.getTemperatura().toString();
        this.temperatura = temp.substring(12);
   }
   
   public void formatarDisco(){
       discos = discoGroup.getDiscos();
       
       Double discoUsado = 0.0;
       Double discoTotal = 0.0;
   
       for(Disco disco : discos){
           discoUsado = Double.valueOf(disco.getEscritas());
           discoTotal = Double.valueOf(disco.getTamanho() / 100000);
           this.discoLivre = (discoTotal - discoUsado) / 10000;
       }
   }
   
   public void formatarMemoriaRam(){
        this.memoriaRam = memoria.getEmUso().doubleValue() / 100000000;      
   }
   
   public void formatarQtdDeUso(){
        this.qtdDeUso = processador.getUso().intValue();
   }
   
    public Double getMemoriaRam() {
        formatarMemoriaRam();
        return memoriaRam;
    }

    public Integer getQtdDeUso() {
        formatarQtdDeUso();
        return qtdDeUso;
    }

    public String getTemperatura() {
        formatarTemperatura();
        return temperatura;
    }   

    public Double getDiscoLivre() {
        formatarDisco();
        return discoLivre;
    }   
}
