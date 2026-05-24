package app;

import servicio.EmpleadoServicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmpleadoServicio servicio = new EmpleadoServicio();
        int opcion = 0;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Registrar medico");
            System.out.println("2. Registrar administrativo");
            System.out.println("3. Mostrar empleados");
            System.out.println("4. Buscar empleado");
            System.out.println("5. Actualizar empleado");
            System.out.println("6. Eliminar empleado");
            System.out.println("7. Calcular pagos");
            System.out.println("8. Mostrar estadisticas");
            System.out.println("9. Salir");
            System.out.print("Seleccione opcion: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        servicio.registrarMedicos();
                        break;
                    case 2:
                        servicio.registrarAdministrativos();
                        break;
                    case 3:
                        servicio.mostrarRegistros();
                        break;
                    case 4:
                        servicio.buscarPorCedula();
                        break;
                    case 5:
                        servicio.actualizarEmpleado();
                        break;
                    case 6:
                        servicio.eliminarEmpleado();
                        break;
                    case 7:
                        servicio.calcularPagos();
                        break;
                    case 8:
                        servicio.mostrarEstadisticas();
                        break;
                    case 9:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: opcion invalida.");
            }
        } while (opcion != 9);
    }
}