/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.first.projeto.tela.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author cebs
 */
public class GerarLog {
    public static void createLogLogin(String mensagem, Boolean statusError) throws IOException {
           
           DateTimeFormatter logNome = DateTimeFormatter.ofPattern("yyyy-MM-dd");
           String dateHourTitle = logNome.format(LocalDateTime.now());
           
           File fileLoged = new File("C:\\Users\\cebs\\Documents\\" +dateHourTitle + "loginUserAction.log");
           fileLoged.createNewFile();
           
           FileWriter arq = new FileWriter("C:\\Users\\cebs\\Documents\\" +dateHourTitle + "loginUserAction.log");
           PrintWriter gravArq = new PrintWriter(arq);
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
           String dateHour = dtf.format(LocalDateTime.now());
           
           gravArq.printf("Usuário realizando login...\n");
           
           if(statusError){
               gravArq.printf("Data e hora do erro: "+dateHour+"\n");
               gravArq.printf("Houve um erro ao realizar o login na aplicação!\n");
               gravArq.printf(mensagem);
               
           } else {
               gravArq.printf("Data e hora do login: "+dateHour+"\n");
               gravArq.printf(mensagem);
           }
           arq.close();
       }
    
    public static void componentesPc(String mensagem, Boolean statusError) throws IOException{
        
        DateTimeFormatter logNome = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateHourTitle = logNome.format(LocalDateTime.now());

        File fileLoged = new File("C:\\Users\\cebs\\Documents\\" +dateHourTitle + "componentespc.log");
           fileLoged.createNewFile();
           
           FileWriter arq = new FileWriter("C:\\Users\\cebs\\Documents\\" +dateHourTitle + "componentespc.log");
           PrintWriter gravArq = new PrintWriter(arq);
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
           String dateHour = dtf.format(LocalDateTime.now());

        if(statusError){
            gravArq.printf("Data/Hora: "+dateHour+"\n");
            gravArq.printf("Houve um erro ao verificar os componentes!\n");
            gravArq.printf("Erro ao adicionar os componentes");
            arq.close();
        }else{
            gravArq.printf("Data/Hora das listagem dos componentes: "+dateHour+"\n");
            gravArq.printf("Components da Maquina:"+"\n");
//            for(Component component : listMachinesComponent){
//                gravArq.printf("Nome Componente: "+component.getDescComponent()+"\n");
//            }
            arq.close();
        }
    }
}

