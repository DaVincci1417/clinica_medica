package model;

public class Medico extends Trabajador {
    private String areaDeExperiencia;

    public Medico(String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo, String tituloProfesional, String areaDeExperiencia){
        super(nombre, direccion, estadoCivil, rut, horarioTrabajo, tituloProfesional);
        setAreaDeExperiencia(areaDeExperiencia);
    }


    //GetTipo
    @Override
    public String getTipo() {
        return "Medico";
    }

    //Getter and Setter
    public String getAreaDeExperiencia() {
        return areaDeExperiencia;
    }
    private void setAreaDeExperiencia(String areaDeExperiencia) {
        this.areaDeExperiencia = areaDeExperiencia;
    }

    @Override
    public String toString() {
        return "Model.Medico{" +
                "Nombre: " + nombre + '\n' +
                "Direccion: " + direccion + '\n' +
                "Estado civil: " + estadoCivil + '\n' +
                "RUT: " + rut + '\n' +
                "Horario Trabajo: " + horarioTrabajo + '\n' +
                "Titulo Profesional: " + tituloProfesional + '\n' +
                "Area De Experiencia: " + areaDeExperiencia + '\'' +
                '}';
    }
}
