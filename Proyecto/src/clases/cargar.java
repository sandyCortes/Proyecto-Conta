/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JProgressBar;

/**
 *
 * @author sandy
 */
public class cargar extends Thread{
    JProgressBar progreso;
    public cargar(JProgressBar progre){
        super();
        this.progreso = progre;
    }
    @Override
 public void run(){
     for(int i=1; i <= 100;i++){
         progreso.setValue(i);
         pausa(30);
     }
 }
 public void pausa(int i){
     try{
         Thread.sleep(i);
     }
     catch(Exception e){
     }
 }
}
