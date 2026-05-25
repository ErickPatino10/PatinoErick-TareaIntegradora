package servicio;

import modelo.Administrativo;
import modelo.Empleado;
import modelo.Medico;
import util.Validador;

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

            for (Empleado e : empleados) {
                if (e.getCedula().equals(cedula)) {
                    System.out.println("Cedula duplicada.");
                    return;
                }
            }

            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            if (!Validador.validarTexto(nombre)) {
                System.out.println("Nombre invalido.");
                return;
            }

            System.out.println("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            if (!Validador.validarEdad(edad)) {
                System.out.println("Edad invalida.");
                return;
            }

            System.out.println("Telefono: ");
            String telefono = sc.nextLine();
            if (!Validador.validarTelefono(telefono)) {
                System.out.println("Telefono invalido.");
                return;
            }

            System.out.println("Correo: ");
            String correo = sc.nextLine();
            if (!Validador.validarCorreo(correo)) {
                System.out.println("Correo invalido.");
                return;
            }

            System.out.println("Especialidad: ");
            String especialidad = sc.nextLine();
            if (!Validador.validarTexto(especialidad)) {
                System.out.println("Especialidad invalida.");
                return;
            }

            System.out.println("Numero de pacientes atendidos: ");
            int numeroPacienteAtendidos = Integer.parseInt(sc.nextLine());
            if (!Validador.validarNumeroPositivo(numeroPacienteAtendidos)) {
                System.out.println("Numero invalido.");
                return;
            }


            System.out.println("Valor consulta: ");
            double valorConsulta = Double.parseDouble(sc.nextLine());
            if (!Validador.validarNumeroPositivo(valorConsulta)) {
                System.out.println("Numero invalido.");
                return;
            }

            Medico medico = new Medico(cedula, nombre, edad, telefono, correo, especialidad, numeroPacienteAtendidos, valorConsulta);

            empleados.add(medico);

            System.out.println("Medico registrado con exito.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: debe ingresar numeros.");
        }
    }


    public void registrarAdministrativos() {

        System.out.println("\n Registrar nuevo Administrativo.");

        try {

            System.out.println("Cedula: ");
            String cedula = sc.nextLine();

            for (Empleado e : empleados) {
                if (e.getCedula().equals(cedula)) {
                    System.out.println("Cedula duplicada.");
                    return;
                }
            }

            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            if (!Validador.validarTexto(nombre)) {
                System.out.println("Nombre invalido.");
                return;
            }

            System.out.println("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            if (!Validador.validarEdad(edad)) {
                System.out.println("Edad invalida.");
                return;
            }

            System.out.println("Telefono: ");
            String telefono = sc.nextLine();
            if (!Validador.validarTelefono(telefono)) {
                System.out.println("Telefono invalido.");
                return;
            }

            System.out.println("Correo: ");
            String correo = sc.nextLine();
            if (!Validador.validarCorreo(correo)) {
                System.out.println("Correo invalido.");
                return;
            }

            System.out.println("Departamento: ");
            String departamento = sc.nextLine();
            if (!Validador.validarTexto(departamento)) {
                System.out.println("Departamento invalido.");
                return;
            }

            System.out.println("Horas trabajadas: ");
            int horasTrabajadas = Integer.parseInt(sc.nextLine());
            if (!Validador.validarNumeroPositivo(horasTrabajadas)) {
                System.out.println("Horas invalidas.");
                return;
            }

            System.out.println("Valor hora: ");
            double valorHora = Double.parseDouble(sc.nextLine());
            if (!Validador.validarNumeroPositivo(valorHora)) {
                System.out.println("Valor hora invalido.");
                return;
            }

            Administrativo administrativo = new Administrativo(cedula, nombre, edad, telefono, correo, departamento, horasTrabajadas, valorHora);

            empleados.add(administrativo);

            System.out.println("Administrativo registrado con exito.");

        } catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar numeros.");
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
        try {

            System.out.println("\nIngrese la cedula del empleado:");
            String cedulaBuscada = sc.nextLine();

            for (Empleado e : empleados) {
                if (e.getCedula().equals(cedulaBuscada)) {

                    System.out.println("Nuevo nombre:");
                    String nombre = sc.nextLine();
                    if (!Validador.validarTexto(nombre)) {
                        System.out.println("Nombre invalido.");
                        return;
                    }
                    e.setNombre(nombre);

                    System.out.println("Nueva edad:");
                    int edad = Integer.parseInt(sc.nextLine());
                    if (!Validador.validarEdad(edad)) {
                        System.out.println("Edad invalida.");
                        return;
                    }
                    e.setEdad(edad);

                    System.out.println("Nuevo telefono:");
                    String telefono = sc.nextLine();
                    if (!Validador.validarTelefono(telefono)) {
                        System.out.println("Telefono invalido.");
                        return;
                    }
                    e.setTelefono(telefono);

                    System.out.println("Nuevo correo:");
                    String correo = sc.nextLine();
                    if (!Validador.validarCorreo(correo)) {
                        System.out.println("Correo invalido.");
                        return;
                    }
                    e.setCorreo(correo);

                    if (e instanceof Medico) {
                        Medico medico = (Medico) e;

                        System.out.println("Nueva especialidad:");
                        String especialidad = sc.nextLine();
                        if (!Validador.validarTexto(especialidad)) {
                            System.out.println("Especialidad invalida.");
                            return;
                        }
                        medico.setEspecialidad(especialidad);

                        System.out.println("Nuevo numero pacientes:");
                        int pacientes = Integer.parseInt(sc.nextLine());
                        if (!Validador.validarNumeroPositivo(pacientes)) {
                            System.out.println("Numero invalido.");
                            return;
                        }
                        medico.setNumeroPacientesAtendidos(pacientes);
                        System.out.println("Nuevo valor consulta:");
                        double valorConsulta = Double.parseDouble(sc.nextLine());
                        if (!Validador.validarNumeroPositivo(valorConsulta)) {
                            System.out.println("Valor invalido.");
                            return;
                        }
                        medico.setValorConsulta(valorConsulta);
                    }
                    else if (e instanceof Administrativo) {
                        Administrativo admin = (Administrativo) e;
                        System.out.println("Nuevo departamento:");
                        String departamento = sc.nextLine();
                        if (!Validador.validarTexto(departamento)) {
                            System.out.println("Departamento invalido.");
                            return;
                        }
                        admin.setDepartamento(departamento);

                        System.out.println("Nuevas horas trabajadas:");
                        double horas = Double.parseDouble(sc.nextLine());
                        if (!Validador.validarNumeroPositivo(horas)) {
                            System.out.println("Horas invalidas.");
                            return;
                        }
                        admin.setHorasTrabajadas(horas);

                        System.out.println("Nuevo valor hora:");
                        double valorHora = Double.parseDouble(sc.nextLine());
                        if (!Validador.validarNumeroPositivo(valorHora)) {
                            System.out.println("Valor hora invalido.");
                            return;
                        }
                        admin.setValorHora(valorHora);
                    }
                    System.out.println("\nEmpleado actualizado correctamente.");
                    return;
                }
            }
            System.out.println("Empleado no encontrado.");
        } catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar numeros.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " );
        }
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
