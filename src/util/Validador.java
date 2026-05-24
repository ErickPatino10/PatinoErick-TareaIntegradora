package util;

public class Validador {

    public static boolean validarCorreo(String correo) {
        return correo.contains("@") && correo.contains(".");
    }

    public static boolean validarEdad(int edad) {
        return edad > 0 && edad < 150;
    }

    public static boolean validarTexto(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean validarNumeroPositivo(double numero) {
        return numero > 0;
    }

    public static boolean validarTelefono(String telefono) {
        return telefono.matches("\\d+");
    }
}