/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listadoblemain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ListaDobleMain {

    public static Persona Crearpersona() {

        String nombre;
        int edad;
        Scanner in = new Scanner(System.in);
        in.nextLine();
        System.out.println("Ingresar nombre: ");
        nombre = in.next();
        System.out.println("Ingresar edad: ");
        edad = in.nextInt();
        Persona P = new Persona(nombre, edad);

        return P;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaDoble<Persona> Persona = new ListaDoble();
        int opcionmenu;
        Persona P, P2;
        int y = 0;
        String nombre;
        ArrayList<Persona> Array = new ArrayList();

        while (y == 0) {
            System.out.println("");
            System.out.println("Menu\n"
                    + "1.Insertar Primero\n"
                    + "2.Añadir al principio\n"
                    + "3.Eliminar primero\n"
                    + "4.Eliminar último\n"
                    + "5.Primer elemento de la lista\n"
                    + "6.Ultimo elemento de la lista\n"
                    + "7.Cuantos elementos hay\n"
                    + "8.Dato del nodo en la posicion indicada\n"
                    + "9.Dar nodo de la posicion indicada\n"
                    + "10.Insertar un nuevo nodo en la posicion indicada\n"
                    + "11.Modificar14 el dato indicado en el nodo de la posicion indicada\n"
                    + "11.Borrar elemento segun su posicion\n"
                    + "12.Indicar si un dato existe en la lista\n"
                    + "13.Mostrar contenido de la lista\n"
                    + "14.Verificar si la lista esta vacia\n"
                    + "15.Ordenar\n"
                    + "16.Salir");
            //Variable que elige el usuario        
            opcionmenu = in.nextInt();
            switch (opcionmenu) {
                case 1:
                    System.out.println("Insertar al inicio:");
                    P = Crearpersona();
                    System.out.println(P.toString());
                    Persona.insertarPrimero(P);
                    System.out.println("Agregado");

                    break;
                case 2:
                    System.out.println("Insertar al final:");
                    P = Crearpersona();
                    System.out.println(P.toString());
                    Persona.insertarUltimo(P);
                    System.out.println("Agregado");
                    break;
                case 3:
                    System.out.println("Eliminar primero:");
                    Persona.quitarPrimero();
                    System.out.println("Removido");
                    break;
                case 4:
                    System.out.println("Eliminar ultimo:");
                    Persona.quitarUltimo();
                    System.out.println("Removido");
                    break;
                case 5:
                    System.out.println("Primer dato:");
                    System.out.println(Persona.devolverPrimero());
                    break;
                case 6:
                    System.out.println("Ultimo dato:");
                    System.out.println(Persona.devolverUltimo());
                    break;
                case 7:
                    System.out.println("La cantidad de elementos son:");
                    System.out.println(Persona.cuantosElementos());
                    break;

                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:

                    break;
                case 13:

                    break;
                case 14:
                    if (Persona.estaVacia()) {
                        System.out.println("La lista esta vacia");
                    } else {
                        System.out.println("La lista no esta vacia");
                    }
                case 16:

                    break;
                case 15:

                    break;
                default:
                    break;
            }
        }

    }
}
