package modelo;

public class Administrativo extends Empleado {
    private String departamento;
    private double horasTrabajadas;
    private double valorHora;

    public Administrativo(String cedula, String nombre, int edad, String telefono, String correo, String departamento, double horasTrabajadas, double valorHora) {
        super(cedula, nombre, edad, telefono, correo);
        if (departamento == null || departamento.trim().isEmpty()) {
            throw new IllegalArgumentException("Departamento invalido.");
        }
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Horas invalidas.");
        }
        if (valorHora <= 0) {

            throw new IllegalArgumentException("Valor hora invalido.");
        }
        this.departamento = departamento;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }


    public String getDepartamento(){return departamento;}
    public double getHorasTrabajadas(){
        return horasTrabajadas;
    }
    public double getValorHora(){
        return valorHora;
    }

    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.trim().isEmpty()) {
            throw new IllegalArgumentException("Departamento invalido.");
        }
        this.departamento = departamento;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Horas trabajadas invalidas.");
        }
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setValorHora(double valorHora) {
        if (valorHora <= 0) {
            throw new IllegalArgumentException("Valor hora invalido.");
        }
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * valorHora;
    }

    @Override
    public void mostrarInformacion() {
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
