README – Explicación de Conceptos Utilizados en el Proyecto
Descripción General

Este proyecto fue desarrollado en Java utilizando Programación Orientada a Objetos (POO).
El sistema permite registrar y administrar empleados de tipo médico y administrativo, aplicando conceptos importantes como:

Herencia
Encapsulamiento
Polimorfismo
Excepciones
Conversiones
Validaciones
1. Herencia

La herencia permite que una clase hija reutilice atributos y métodos de una clase padre.

En el proyecto, la clase Empleado funciona como clase base y las clases Medico y Administrativo heredan de ella.

Clase padre
public abstract class Empleado
Clases hijas
public class Medico extends Empleado
public class Administrativo extends Empleado
¿Qué se hereda?

Las clases hijas heredan:

cedula
nombre
edad
telefono
correo
getters y setters

Gracias a esto se evita repetir código.

2. Encapsulamiento

El encapsulamiento consiste en proteger los datos de una clase usando atributos privados y permitiendo el acceso mediante métodos públicos.

Ejemplo
private String nombre;

El atributo no puede modificarse directamente desde otra clase.

Para acceder se usan métodos:

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
Beneficio

Permite controlar y validar la información antes de modificarla.

3. Polimorfismo

El polimorfismo permite que un mismo método tenga diferentes comportamientos según el objeto.

En este proyecto, la clase Empleado declara métodos abstractos:

public abstract void mostrarInformacion();
public abstract double calcularPago();

Cada clase hija implementa estos métodos de forma diferente.

En la clase Medico
@Override
public double calcularPago() {
    return numeroPacientesAtendidos * valorConsulta;
}
En la clase Administrativo
@Override
public double calcularPago() {
    return horasTrabajadas * valorHora;
}
Beneficio

Cada tipo de empleado calcula su pago de manera distinta usando el mismo método.

4. Excepciones

Las excepciones sirven para controlar errores durante la ejecución del programa y evitar que el sistema se cierre inesperadamente.

Ejemplo utilizado
try {
    opcion = Integer.parseInt(sc.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Error: debe ingresar numeros.");
}
Excepciones usadas
NumberFormatException
IllegalArgumentException
Función

Permiten detectar errores como:

ingresar letras donde van números
datos inválidos
valores negativos
campos vacíos
5. Conversiones

Las conversiones transforman datos de un tipo a otro.

En el proyecto se convierten datos String ingresados por teclado a números.

Conversión a entero
int edad = Integer.parseInt(sc.nextLine());
Conversión a decimal
double valorConsulta = Double.parseDouble(sc.nextLine());
Beneficio

Permite trabajar correctamente con operaciones matemáticas y validaciones.

6. Validaciones

Las validaciones verifican que los datos ingresados sean correctos antes de guardarlos.

Se utiliza la clase:

Validador
Validaciones implementadas
Validar correo
public static boolean validarCorreo(String correo) {
    return correo.contains("@") && correo.contains(".");
}
Validar edad
public static boolean validarEdad(int edad) {
    return edad > 0 && edad < 150;
}
Validar texto
public static boolean validarTexto(String texto) {
    return texto != null && !texto.trim().isEmpty();
}
Validar teléfono
public static boolean validarTelefono(String telefono) {
    return telefono.matches("\\d+");
}
Validar números positivos
public static boolean validarNumeroPositivo(double numero) {
    return numero > 0;
}
Beneficio

Evita registrar información incorrecta en el sistema.
