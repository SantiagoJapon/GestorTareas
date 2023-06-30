/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.gestortareas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



/**
 *
 * @author MSIBRAVO
 */
public class GestorTareas {

    public static void main(String[] args) {
      AdministracionTareas admin = new AdministracionTareas();
      Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingresa el nombre de la tarea");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese descripcion");
            String descripcion = entrada.nextLine();
            admin.nuevaTarea(new Tareas(nombre, descripcion));
        }
        
        
        System.out.println("Hay: " + admin.tareaPendiente() +
                "tareas pendientes");
        while(admin.tareaPendiente()>0){
            System.out.println("Quieres atender aplasta 1");
            String bandera = entrada.next();
            if(bandera.equals("1")){
                admin.realizarTareas();
                System.out.println("Hay: " + admin.tareaPendiente() + "tareas pendientes");
            }
        }
        
       
            

    }

    public static void eliminarTarea(Queue<String> cola, String nombreTarea) {
        Queue<String> colaTemporal = new LinkedList<>();
        
        while (!cola.isEmpty()) {
            String tarea = cola.poll();
            if(!tarea.equals (nombreTarea)) {
                colaTemporal.add(tarea);
            }
            cola.addAll(cola);
    }
}
}
