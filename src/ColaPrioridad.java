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
        for(int temp=fin; temp!=ini && cola[temp].prioridad>cola[temp-1].prioridad ;temp--){
            
                Data copiaCola1 = new Data();
                int anterior =temp-1;
                
                copiaCola1.valor = cola[anterior].valor;
                copiaCola1.prioridad = cola[anterior].prioridad;
                
                cola[anterior].valor = cola[temp].valor;
                cola[anterior].prioridad = cola[temp].prioridad;
                
                cola[temp].valor = copiaCola1.valor;
                cola[temp].prioridad = copiaCola1.prioridad;
                
            
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
    
    public Data 
         valorEliminado(){
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
