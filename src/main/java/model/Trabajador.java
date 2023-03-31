package model;

public abstract class Trabajador{
    protected String nombre;
    protected String direccion;
    protected String estadoCivil;
    protected String rut;
    protected String horarioTrabajo;
    protected String tituloProfesional;

    public Trabajador(String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo, String tituloProfesional){
        setNombre(nombre);
        setDireccion(direccion);
        setEstadoCivil(estadoCivil);
        setRut(rut);
        setHorarioTrabajo(horarioTrabajo);
        setTituloProfesional(tituloProfesional);
    }

    public abstract String getTipo();

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public String getRut() {
        return rut;
    }
    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }
    public String getTituloProfesional() {
        return tituloProfesional;
    }

    //Setters
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    private void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    private void setRut(String rut) {
        this.rut = rut;
    }
    private void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }
    private void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    @Override
    public String toString() {
        return "Model.Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", rut='" + rut + '\'' +
                ", horarioTrabajo='" + horarioTrabajo + '\'' +
                ", tituloProfesional='" + tituloProfesional + '\'' +
                '}';
    }
}
