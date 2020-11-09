/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class Bicola {
      protected char [] bicola = new char[3];
    protected int ini =-1;
    protected int fin = -1;
    private char valorEliminado1;
    private char valorEliminado2;
    
    
    public boolean insertarI(char valor){
     if(ini==0 || ini ==-1){
      
         return false;
     }
     if(ini==-1 && fin==-1){
         ini=fin=0;
         bicola[ini]=valor;
         return true;
     }
        ini=ini- 1; 
        bicola[ini]=valor;
        return true;
    }
    
    
    
    public boolean insertarF(char valor){
        if(fin == bicola.length-1){
         return false;
     }  
         if(fin == 0 && ini==-1){
         ini++;
     }
     fin++;
     bicola[fin] = valor;
     if(fin == 0 && ini==-1){
         ini++;
     }
     return true; 
    }
    
    
    public boolean eliminarI(){
     if(ini ==-1 && ini ==-1){
         return false;
     }
      valorEliminado1 = bicola[fin];
     if(fin==ini && ini!=-1){
         ini=-1; 
         fin=-1;
         fin++;
     }
     fin--;
    
     return true;
    }
  
    
    
    public boolean eliminarF(){
        if(ini ==-1 && fin ==-1){
            return false;
        }
        valorEliminado2 = bicola[ini];
        if(ini == fin && ini!=-1){
            ini = -1;
            fin = -1;
            return true;
        }
        ini++;
        return true;
    }
    
    public char valorEliminado1(){
        return valorEliminado1;
    }
    
    public char valorEliminado2(){
        return valorEliminado2;
    }
    
    public int valorIni(){
        return ini;
    }
    public int valorFin(){
        return fin;
    }
    
    public char[] ContenidoCola(){
        return bicola;
    }
}
