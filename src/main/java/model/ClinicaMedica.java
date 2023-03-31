package model;

import java.util.ArrayList;

public class ClinicaMedica {
    private String nombre;
    private ArrayList<String> direccionesAsociadas = new ArrayList<>();
    private String tipoDeClinica;
    private ArrayList<EspecialidadMedica> especialidadesMedicas = new ArrayList<>();

    public ClinicaMedica(String nombre, String direccionPrincipal, String tipoDeClinica){
        setNombre(nombre);
        direccionesAsociadas.add(direccionPrincipal);
        setTipoDeClinica(tipoDeClinica);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public ArrayList<String> getDireccionesAsociadas() {
        return direccionesAsociadas;
    }
    public String getTipoDeClinica() {
        return tipoDeClinica;
    }
    public ArrayList<EspecialidadMedica> getEspecialidadesMedicas() {
        return especialidadesMedicas;
    }

    //Setters
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setDireccionesAsociadas(ArrayList<String> direccionesAsociadas) {
        this.direccionesAsociadas = direccionesAsociadas;
    }
    private void setTipoDeClinica(String tipoDeClinica) {
        this.tipoDeClinica = tipoDeClinica;
    }
    private void setEspecialidadesMedicas(ArrayList<EspecialidadMedica> especialidadesMedicas) {
        this.especialidadesMedicas = especialidadesMedicas;
    }

    //Metodo para agregar especialidad medica
    public void agregarEspecialidades(EspecialidadMedica especialidadMedica){
        especialidadesMedicas.add(especialidadMedica);
    }

    //Metodos que permite obtener todos los administrativos o medicos de la clinica
    public ArrayList<Trabajador> obtenerTodosLosAdministrativos(){
        ArrayList<Trabajador> administrativos = new ArrayList<>();
        for(int i = 0; i < especialidadesMedicas.size(); i++){
            for(int j = 0; j < especialidadesMedicas.get(i).getTrabajadores().size(); j++){
                if(especialidadesMedicas.get(i).getTrabajadores().get(j).getTipo().equalsIgnoreCase("Administrativo")){
                    administrativos.add(especialidadesMedicas.get(i).getTrabajadores().get(j));
                }
            }
        }
        return administrativos;
    }
    public ArrayList<Trabajador> obtenerTodosLosMedicos(){
        ArrayList<Trabajador> medicos = new ArrayList<>();
        for(int i = 0; i < especialidadesMedicas.size(); i++){
            for(int j = 0; j < especialidadesMedicas.get(i).getTrabajadores().size(); j++){
                if(especialidadesMedicas.get(i).getTrabajadores().get(j).getTipo().equalsIgnoreCase("Medico")){
                    medicos.add(especialidadesMedicas.get(i).getTrabajadores().get(j));
                }
            }
        }
        return medicos;
    }

    //Metodo que permite obtener la lista de medicos que trabajan en una determinda especialidad
    public ArrayList<Trabajador> obtenerTodosLosMedicosDeUnaEspecialidad(String especialidadMedica){
        ArrayList<Trabajador> medicosEspecialidad = new ArrayList<>();
        for(int i = 0; i < buscarEspecialidadPorNombre(especialidadMedica).getTrabajadores().size(); i++){
            if(buscarEspecialidadPorNombre(especialidadMedica).getTrabajadores().get(i).getTipo().equalsIgnoreCase("Medico")){
                medicosEspecialidad.add(buscarEspecialidadPorNombre(especialidadMedica).getTrabajadores().get(i));
            }
        }
        return medicosEspecialidad;
    }
    //Metodo que permite buscar una especialidad medica por el nombre
    public EspecialidadMedica buscarEspecialidadPorNombre(String especialidadMedica){
        int posicion = -1;
        for (int i = 0; i < especialidadesMedicas.size(); i++) {
            if (especialidadesMedicas.get(i).getNombre().equalsIgnoreCase(especialidadMedica)){
                posicion = i;
            }
        }
        if (posicion != -1) {
            return especialidadesMedicas.get(posicion);
        } else {
            return null;
        }
    }
    public Administrativo buscarAdministrativoDeUnaEspecialidadEnParticula(String nombreEspecialidad, String nombreAdministrativo){
        int posicion = -1;
        for (int i = 0; i < buscarEspecialidadPorNombre(nombreEspecialidad).getTrabajadores().size(); i++) {
            if (buscarEspecialidadPorNombre(nombreEspecialidad).getTrabajadores().get(i).getTipo().equalsIgnoreCase("Administrador")){
                if (buscarEspecialidadPorNombre(nombreEspecialidad).getTrabajadores().get(i).getNombre().equalsIgnoreCase(nombreAdministrativo)){
                    posicion = i;
                }
            }
        }
        if (posicion != -1) {
            return (Administrativo) buscarEspecialidadPorNombre(nombreEspecialidad).getTrabajadores().get(posicion);
        } else {
            return null;
        }
    }

}
