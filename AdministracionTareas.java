/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gestortareas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author MSIBRAVO
 */
public class AdministracionTareas {
    private Queue<Tareas> cola;
    
    public AdministracionTareas(){
        cola = new LinkedList<>();
    }
    
    public void nuevaTarea(Tareas t){
        cola.add(t);
        
    }
    
    public void realizarTareas(){
        System.out.println(cola.element().toString());
        cola.poll();
    }
    
    public int tareaPendiente(){
        return cola.size();
    }
}