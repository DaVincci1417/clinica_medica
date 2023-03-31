package model;

public class Administrativo extends Trabajador {
    private String correoElectronico;

    public Administrativo(String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo, String tituloProfesional, String correoElectronico){
        super(nombre, direccion, estadoCivil, rut, horarioTrabajo, tituloProfesional);
        setCorreoElectronico(correoElectronico);
    }

    //GetTipo
    @Override
    public String getTipo() {
        return "Administrativo";
    }

    //Getter and Setter
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    private void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Model.Administrativo{" +
                "Nombre: " + nombre + '\n' +
                "Direccion: " + direccion + '\n' +
                "Estado civil: " + estadoCivil + '\n' +
                "RUT: " + rut + '\n' +
                "Horario Trabajo: " + horarioTrabajo + '\n' +
                "Titulo Profesional: " + tituloProfesional + '\n' +
                "Correo Electronico: " + correoElectronico + '\'' +
                '}';
    }
}
