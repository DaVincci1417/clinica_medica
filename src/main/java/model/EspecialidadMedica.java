package model;

import java.util.ArrayList;

public class EspecialidadMedica {
    private String nombre;
    private String ubicacionGeografica;
    private ArrayList<Trabajador> trabajadores = new ArrayList<>();

    public EspecialidadMedica(String nombre, String ubicacionGeografica){
        setNombre(nombre);
        setUbicacionGeografica(ubicacionGeografica);
    }

    //Metodo para agregar trabajadores
    public void agregarTrabajadores(Trabajador trabajador){
        trabajadores.add(trabajador);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getUbicacionGeografica() {
        return ubicacionGeografica;
    }
    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    //Setters
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setUbicacionGeografica(String ubicacionGeografica) {
        this.ubicacionGeografica = ubicacionGeografica;
    }
    private void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }


}
