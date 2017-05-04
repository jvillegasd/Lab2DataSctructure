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
public class Nodo {
    Date fecha;
    long NroCta;
    long monto;
    int tipo;
    Nodo Nazi=null;//Link derecha
    Nodo URSS =null;//Link izquierda

    public Nodo(Date fecha, long NroCta, long monto, int tipo) {
        this.fecha = fecha;
        this.NroCta = NroCta;
        this.monto = monto;
        this.tipo = tipo;
    }

    
}
