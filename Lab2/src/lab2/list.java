/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class list {
    Nodo ptr;
    Nodo llevador;
    Nodo ult;
    
    public list(){
        this.ptr=null;
        this.llevador=null;
        this.ult=null;
    }
    
    public void add(Date fecha, long NroCta, long monto, int tipo){
        Nodo aux=new Nodo(fecha,NroCta,monto,tipo);
        if (this.ptr==null) {
            this.ptr=aux;
            this.ptr.Nazi=null;
            this.ptr.URSS=null;
        }else{
            Nodo aux2=this.ptr;
            Nodo usable=null;
            while (aux2!=null) {
                if (aux2.NroCta<aux.NroCta && aux2.Nazi==null) {
                    aux2.Nazi=aux;
                    aux.URSS=aux2;
                    aux.Nazi=null;   
                    this.ult=aux;
                }
                if (aux2.NroCta>aux.NroCta && aux2.URSS==null) {
                    aux2.URSS=aux;
                    aux.Nazi=aux2; 
                    aux.URSS=null; 
                    this.ptr=aux;
                }
                if(aux.NroCta>aux2.NroCta || aux.NroCta<aux2.Nazi.NroCta){
                    aux2.Nazi.URSS=aux;
                    aux.Nazi=aux2.Nazi;
                    aux.URSS=aux2;
                    aux2.Nazi=aux;
                }
                aux2=aux2.Nazi;
            }
        }
        this.llevador=aux;
    }
    
    public void delete(long numero){
        Nodo aux=this.ptr;
        while (aux!=null) {
            if (this.ptr.Nazi==null && aux.NroCta==numero) {
                this.ptr=null;
                this.llevador=null;
            }else if(this.ptr.Nazi !=null && aux.NroCta==numero){
                Nodo eli=aux;
                aux.URSS.Nazi=aux.Nazi;
                aux.Nazi.URSS=aux.URSS;
                eli=null;
            }
            aux=aux.Nazi;
            if (aux!=null) {
                ult=aux;
            }
        }
    }
    
    public Nodo getptr(){
        return this.ptr;
    }
}
