package servicio;

import modelo.Administrativo;
import modelo.Empleado;
import modelo.Medico;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoServicio {

    private ArrayList<Empleado> empleados;
    private Scanner sc;

    public EmpleadoServicio() {
        empleados = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void registarMedicos() {

        System.out.println("\n Registrar nuevo Medico.");

        try {

            System.out.println("Cedula: ");
            String cedula = sc.nextLine();

            System.out.println("Nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.println("Telefono: ");
            String telefono = sc.nextLine();

            System.out.println("Correo: ");
            String correo = sc.nextLine();

            System.out.println("Especialidad: ");
            String especialidad = sc.nextLine();

            System.out.println("Numero de pacientes atendidos: ");
            int numeroPacienteAtendidos = sc.nextInt();

            System.out.println("Valor consulta: ");
            double valorConsulta = sc.nextDouble();
            sc.nextLine();

            Medico medico = new Medico(cedula, nombre, edad, telefono, correo, especialidad, numeroPacienteAtendidos, valorConsulta);

            empleados.add(medico);

            System.out.println("Medico registrado con exito.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }
    }


    public void registarAdministrativos() {

        System.out.println("\n Registrar nuevo Administrativo.");

        try {

            System.out.println("Cedula: ");
            String cedula = sc.nextLine();

            System.out.println("Nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.println("Telefono: ");
            String telefono = sc.nextLine();

            System.out.println("Correo: ");
            String correo = sc.nextLine();

            System.out.println("Departamento: ");
            String departamento = sc.nextLine();

            System.out.println("Horas trabajadas: ");
            int horasTrabajadas = sc.nextInt();

            System.out.println("Valor hora: ");
            double valorHora = sc.nextDouble();
            sc.nextLine();

            Administrativo administrativo = new Administrativo(cedula, nombre, edad, telefono, correo, departamento, horasTrabajadas, valorHora);

            empleados.add(administrativo);

            System.out.println("Administrativo registrado con exito.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void mostrarRegistros(){
        System.out.println("\nLista de empleados.\n");
        if (empleados.isEmpty()){
            System.out.println("No hay empleados registrados");
            return;
        }
        for (Empleado e : empleados){
            e.mostarInformacion();
        }
    }

    public void buscarPorCedula(){
        System.out.println("\nIngrese su cedula: ");
        String cedulaIngresada = sc.nextLine();

        for (Empleado e : empleados){
            if (cedulaIngresada.equals(e.getCedula())){
                e.mostarInformacion();
                return;
            }
        }
        System.out.println("\nCedula no encontrada.\n");
    }

    public void remplazarInformacion(){
        System.out.println("\nIngrese su cedula: ");
        String cedulaIngresada = sc.nextLine();

        for (Empleado e : empleados){
            if (cedulaIngresada.equals(e.getCedula())){

                return;
            }
        }
        System.out.println("\nCedula no encontrada.\n");
    }


}