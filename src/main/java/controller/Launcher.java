package controller;

import model.ClinicaMedica;
import model.EspecialidadMedica;
import model.Trabajador;
import model.Administrativo;
import model.Medico;

public class Launcher{
    public static void inicializar(){
        ClinicaMedica clinicaMedica = new ClinicaMedica("Clinica Rumana",
                "Diputado Aquilebanes 465",
                "Publica");
        EspecialidadMedica obstetricia = new EspecialidadMedica("Obstetricia","latitud/longitud");
        clinicaMedica.agregarEspecialidades(obstetricia);
        Administrativo administrativo = new Administrativo("Leonardo Farkas",
                "Visviri 02170",
                "Casado",
                "12.929.298-2",
                "Horario de Oficina",
                "Ingeniero en Administracion de Empresas",
                "leonardo.farkas@mentedetiburon.cl");
        Medico medico = new Medico("Gregory House",
                "Garibaldi 0925",
                "Viuda",
                "4.929.298-2",
                "Indefinido",
                "Medico Cirujano",
                "Gineco obstetra");
        obstetricia.agregarTrabajadores(administrativo);
        obstetricia.agregarTrabajadores(medico);
        clinicaMedica.obtenerTodosLosMedicos();
        clinicaMedica.obtenerTodosLosAdministrativos();
        clinicaMedica.obtenerTodosLosMedicosDeUnaEspecialidad("Obstetricia");
        clinicaMedica.buscarAdministrativoDeUnaEspecialidadEnParticula("Obstetricia", "Leonardo Farkas");
    }

    public static void main(String[] args) {
        inicializar();
    }
}
