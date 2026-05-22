package modelo;

public class Medico extends Empleado {

    private String especialidad;
    private int    numeroPacientesAtendidos;
    private double valorConsulta;

    public Medico(String cedula, String nombre, int edad, String telefono, String correo, String especialidad, int numeroPacientesAtendidos, double valorConsulta) {
        super(cedula, nombre, edad, telefono, correo);
        this.especialidad = especialidad;
        this.numeroPacientesAtendidos = numeroPacientesAtendidos;
        this.valorConsulta = valorConsulta;
    }

    public int    getNumeroPacientesAtendidos() {
        return numeroPacientesAtendidos;
    }

    public double getValorConsulta(){
        return valorConsulta;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public void setNumeroPacientesAtendidos(int numeroPacientesAtendidos) {
        this.numeroPacientesAtendidos = numeroPacientesAtendidos;
    }
    public void setValorConsulta(double valorConsulta){
        this.valorConsulta = valorConsulta;
    }

    @Override
    public double calcularPago() {
        return numeroPacientesAtendidos * valorConsulta;
    }


    @Override
    public void mostarInformacion() {
        System.out.println("=== MÉDICO ===");
        System.out.println("Cédula       : " + getCedula());
        System.out.println("Nombre       : " + getNombre());
        System.out.println("Edad         : " + getEdad());
        System.out.println("Teléfono     : " + getTelefono());
        System.out.println("Correo       : " + getCorreo());
        System.out.println("Especialidad : " + especialidad);
        System.out.println("Pacientes    : " + numeroPacientesAtendidos);
        System.out.println("Valor consulta: $" + valorConsulta);
        System.out.println("Pago total   : $" + calcularPago());
        System.out.println("-----------------------------");
    }
}
