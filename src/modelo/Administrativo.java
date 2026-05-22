package modelo;

public class Administrativo extends Empleado {
    private String departamento;
    private double horasTrabajadas;
    private double valorHora;

    public Administrativo(String cedula, String nombre, int edad, String telefono, String correo, String departamento, double horasTrabajadas, double valorHora) {
        super(cedula, nombre, edad, telefono, correo);
        this.departamento = departamento;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    // Getters y Setters
    public String getDepartamento(){
        return departamento;
    }
    public double getHorasTrabajadas(){
        return horasTrabajadas;
    }
    public double getValorHora(){
        return valorHora;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public void setHorasTrabajadas(double horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }
    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * valorHora;
    }

    @Override
    public void mostarInformacion() {
        System.out.println("=== ADMINISTRATIVO ===");
        System.out.println("Cédula         : " + getCedula());
        System.out.println("Nombre         : " + getNombre());
        System.out.println("Edad           : " + getEdad());
        System.out.println("Teléfono       : " + getTelefono());
        System.out.println("Correo         : " + getCorreo());
        System.out.println("Departamento   : " + departamento);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor por hora : $" + valorHora);
        System.out.println("Pago total     : $" + calcularPago());
        System.out.println("-----------------------------");
    }

}
