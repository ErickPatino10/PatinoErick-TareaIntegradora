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

    public void registrarMedicos() {

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


    public void registrarAdministrativos() {

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
            e.mostrarInformacion();
        }
    }

    public void buscarPorCedula(){
        System.out.println("\nIngrese su cedula: ");
        String cedulaIngresada = sc.nextLine();

        for (Empleado e : empleados){
            if (cedulaIngresada.equals(e.getCedula())){
                e.mostrarInformacion();
                return;
            }
        }
        System.out.println("\nCedula no encontrada.\n");
    }

    public void actualizarEmpleado() {

        System.out.print("\nIngrese la cedula del empleado: ");
        String cedulaBuscada = sc.nextLine();

        for (Empleado e : empleados) {

            if (e.getCedula().equals(cedulaBuscada)) {

                System.out.println("\n=== EMPLEADO ENCONTRADO ===");
                e.mostrarInformacion();

                // DATOS GENERALES
                System.out.println("\n=== INGRESE LOS NUEVOS DATOS ===");

                System.out.print("Nuevo nombre: ");
                e.setNombre(sc.nextLine());

                System.out.print("Nueva edad: ");
                e.setEdad(sc.nextInt());
                sc.nextLine();

                System.out.print("Nuevo telefono: ");
                e.setTelefono(sc.nextLine());

                System.out.print("Nuevo correo: ");
                e.setCorreo(sc.nextLine());

                // SI ES MEDICO
                if (e instanceof Medico) {

                    Medico medico = (Medico) e;

                    System.out.println("\n=== DATOS DEL MEDICO ===");

                    System.out.print("Nueva especialidad: ");
                    medico.setEspecialidad(sc.nextLine());

                    System.out.print("Nuevo numero de pacientes: ");
                    medico.setNumeroPacientesAtendidos(sc.nextInt());

                    System.out.print("Nuevo valor consulta: ");
                    medico.setValorConsulta(sc.nextDouble());
                    sc.nextLine();

                    System.out.println("\nMedico actualizado correctamente.");
                }


                else if (e instanceof Administrativo) {

                    Administrativo admin = (Administrativo) e;

                    System.out.println("\n=== DATOS DEL ADMINISTRATIVO ===");

                    System.out.print("Nuevo departamento: ");
                    admin.setDepartamento(sc.nextLine());

                    System.out.print("Nuevas horas trabajadas: ");
                    admin.setHorasTrabajadas(sc.nextDouble());

                    System.out.print("Nuevo valor por hora: ");
                    admin.setValorHora(sc.nextDouble());
                    sc.nextLine();

                    System.out.println("\nAdministrativo actualizado correctamente.");
                }

                return;
            }
        }

        System.out.println("\nEmpleado no encontrado.");
    }

    public void eliminarEmpleado() {

        System.out.print("\nIngrese la cedula del empleado a eliminar: ");
        String cedulaBuscada = sc.nextLine();

        for (Empleado e : empleados) {

            if (e.getCedula().equals(cedulaBuscada)) {

                empleados.remove(e);

                System.out.println("\nEmpleado eliminado.");
                return;
            }
        }

        System.out.println("\nEmpleado no encontrado.");
    }

    public void calcularPagos() {

        if (empleados.isEmpty()) {
            System.out.println("\nNo hay empleados registrados.");
            return;
        }

        System.out.println("\n===== CALCULO DE PAGOS =====");

        for (Empleado e : empleados) {

            System.out.println("\nEmpleado: " + e.getNombre());
            System.out.println("Cedula: " + e.getCedula());
            System.out.println("Pago total: $" + e.calcularPago());
        }
    }

    public void mostrarEstadisticas() {

        if (empleados.isEmpty()) {
            System.out.println("\nNo hay empleados registrados.");
            return;
        }

        int totalMedicos = 0;
        int totalAdministrativos = 0;

        double totalPagos = 0;

        for (Empleado e : empleados) {

            totalPagos += e.calcularPago();

            if (e instanceof Medico) {
                totalMedicos++;
            }

            else if (e instanceof Administrativo) {
                totalAdministrativos++;
            }
        }

        double promedioPagos = totalPagos / empleados.size();

        System.out.println("\n===== ESTADISTICAS =====");

        System.out.println("Total empleados: " + empleados.size());
        System.out.println("Total medicos: " + totalMedicos);
        System.out.println("Total administrativos: " + totalAdministrativos);

        System.out.println("Suma total pagos: $" + totalPagos);
        System.out.println("Promedio pagos: $" + promedioPagos);
    }
}

