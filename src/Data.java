/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class Data {
    char valor;
    int prioridad;
    
    public Data(){
    valor = ' ';
    prioridad = 1;
}
   public String getData(){
       return "v:"+valor+" P:"+prioridad;  //V es igual a valor y P es igual a prioridad
   }
   
   
   
   
   
}
