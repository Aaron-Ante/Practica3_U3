import java.util.PriorityQueue;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class ColaPrioridad {
    protected Data[] cola = new Data[3];
    protected int ini =-1;
    protected int fin =-1;
    protected Data valorEliminado;
    
    
   
    public ColaPrioridad(){
        for(int i =0; i<cola.length;i++){
            cola[i] = new Data();
            
        }
    }
    
     public boolean Insertar(Data dato ){
        if(fin == cola.length-1){
            return false;
        }
        fin++;
        cola[fin]  = dato;
        if(ini == -1 && fin == 0){
            ini++;
        }
        
       OrdenarPrioridad();
       
        return true;
    }
     private void OrdenarPrioridad(){
        if(ini == fin || fin==0){
            return;
        }
        for(int temp=fin; temp>0;temp--){
            if(cola[temp].prioridad>cola[temp-1].prioridad){
                Data copiaCola1 = cola[temp-1];
                cola[temp-1]=cola[temp];
                cola[temp] = copiaCola1;
            }
        }
     }
     
     public boolean eliminar(){
        if(ini ==-1 && fin ==-1){
            return false;
        }
        valorEliminado = cola[ini];
        if(ini == fin && ini!=-1){
            ini = -1;
            fin = -1;
            return true;
        }
        ini++;
        return true;
    }
    
    public Data  valorEliminado(){
        return valorEliminado;
    }
    
    public int valorIni(){
        return ini;
    }
    public int valorFin(){
        return fin;
    }
    
    public Data[] ContenidoCola(){
        return cola;
    }
}
