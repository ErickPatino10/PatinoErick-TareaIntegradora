package modelo;

public abstract class Empleado {
        private String cedula;
        private String nombre;
        private int edad;
        private String telefono;
        private String correo;

    public Empleado(String cedula, String nombre, int edad, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
    }


    public String getCedula() {
                return cedula;
        }

        public void setCedula(String cedula) {
                this.cedula = cedula;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public int getEdad() {
                return edad;
        }

        public void setEdad(int edad) {
                this.edad = edad;
        }

        public String getTelefono() {
                return telefono;
        }

        public void setTelefono(String telefono) {
                this.telefono = telefono;
        }

        public String getCorreo() {
                return correo;
        }

        public void setCorreo(String correo) {
                this.correo = correo;
        }

        abstract public void mostrarInformacion();

        abstract public double calcularPago();



}
