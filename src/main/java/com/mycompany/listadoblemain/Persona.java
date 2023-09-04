
package com.mycompany.listadoblemain;



public class Persona implements Comparable<Persona> {
    
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    
    public int compareTo(Persona p) {
        int resultado=0;
        if (this.edad<p.getEdad())
            return -1;
        else
            if (this.edad>p.getEdad())
                return 1;
        return 0;
    }
    
    
    
}

