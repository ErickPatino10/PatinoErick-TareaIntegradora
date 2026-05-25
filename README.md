# README – Sistema de Gestión de Empleados en Java

---

# Descripción General

Este proyecto fue desarrollado en Java utilizando los principios de Programación Orientada a Objetos (POO).

El sistema permite registrar y administrar empleados médicos y administrativos aplicando conceptos fundamentales como:

* Herencia
* Encapsulamiento
* Polimorfismo
* Excepciones
* Conversiones
* Validaciones

---

# 1. Herencia

La herencia permite que una clase hija reutilice atributos y métodos de una clase padre.

En este proyecto:

* `Empleado` → Clase padre
* `Medico` y `Administrativo` → Clases hijas

## Clase Padre

```java
public abstract class Empleado
```

## Clases Hijas

```java
public class Medico extends Empleado
```

```java
public class Administrativo extends Empleado
```

## ¿Qué se hereda?

Las clases hijas heredan:

* cedula
* nombre
* edad
* telefono
* correo
* métodos getters y setters

## Beneficio

Evita repetir código y facilita la organización del sistema.

---

# 2. Encapsulamiento

El encapsulamiento protege los atributos de una clase usando `private` y permitiendo acceso mediante métodos públicos.

## Ejemplo

```java
private String nombre;
```

El atributo no puede ser modificado directamente desde otra clase.

## Acceso mediante métodos

### Getter

```java
public String getNombre() {
    return nombre;
}
```

### Setter

```java
public void setNombre(String nombre) {
    this.nombre = nombre;
}
```

## Beneficio

Permite controlar y validar la información antes de modificarla.

---

# 3. Polimorfismo

El polimorfismo permite que un mismo método funcione de manera diferente según el objeto que lo utilice.

La clase `Empleado` declara métodos abstractos:

```java
public abstract void mostrarInformacion();
public abstract double calcularPago();
```

Cada clase hija implementa estos métodos de manera distinta.

## En la clase Medico

```java
@Override
public double calcularPago() {
    return numeroPacientesAtendidos * valorConsulta;
}
```

## En la clase Administrativo

```java
@Override
public double calcularPago() {
    return horasTrabajadas * valorHora;
}
```

## Beneficio

Cada tipo de empleado calcula su pago de forma diferente usando el mismo método.

---

# 4. Excepciones

Las excepciones permiten controlar errores durante la ejecución del programa.

Gracias a ellas el sistema evita cerrarse inesperadamente.

## Ejemplo utilizado

```java
try {
    opcion = Integer.parseInt(sc.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Error: debe ingresar numeros.");
}
```

## Excepciones usadas

| Excepción                  | Función                               |
| -------------------------- | ------------------------------------- |
| `NumberFormatException`    | Detecta letras donde deben ir números |
| `IllegalArgumentException` | Detecta valores inválidos             |

## Beneficio

Permiten manejar errores como:

* letras en campos numéricos
* datos vacíos
* números negativos
* información inválida

---

# 5. Conversiones

Las conversiones transforman datos de un tipo a otro.

En el proyecto se convierten datos `String` ingresados por teclado hacia tipos numéricos.

## Conversión a entero

```java
int edad = Integer.parseInt(sc.nextLine());
```

## Conversión a decimal

```java
double valorConsulta = Double.parseDouble(sc.nextLine());
```

## Beneficio

Permite realizar operaciones matemáticas correctamente.

---

# 6. Validaciones

Las validaciones verifican que los datos ingresados sean correctos antes de guardarlos.

Se utiliza la clase:

```java
Validador
```

## Validar correo

```java
public static boolean validarCorreo(String correo) {
    return correo.contains("@") && correo.contains(".");
}
```

## Validar edad

```java
public static boolean validarEdad(int edad) {
    return edad > 0 && edad < 150;
}
```

## Validar texto

```java
public static boolean validarTexto(String texto) {
    return texto != null && !texto.trim().isEmpty();
}
```

## Validar teléfono

```java
public static boolean validarTelefono(String telefono) {
    return telefono.matches("\\d+");
}
```

## Validar números positivos

```java
public static boolean validarNumeroPositivo(double numero) {
    return numero > 0;
}
```

## Beneficio

Evita registrar información incorrecta en el sistema.

---

# Conclusión

Este proyecto aplica correctamente los principios fundamentales de Programación Orientada a Objetos en Java.

Gracias al uso de:

* Herencia
* Encapsulamiento
* Polimorfismo
* Excepciones
* Conversiones
* Validaciones

el sistema es más:

* organizado
* reutilizable
* seguro
* fácil de mantener

Además, permite controlar errores y garantizar que los datos ingresados sean válidos.

<img width="396" height="681" alt="image" src="https://github.com/user-attachments/assets/c31ecf11-0642-4b1d-ba40-864354dca040" />
<br>
<img width="351" height="376" alt="image" src="https://github.com/user-attachments/assets/807815c1-00e2-4e13-9de4-e0aee24e4328" />
<br>
<img width="456" height="511" alt="image" src="https://github.com/user-attachments/assets/515eeddc-7a1f-4f04-a9f1-1d469539b08d" />
<br>
<img width="314" height="280" alt="image" src="https://github.com/user-attachments/assets/78169741-28a1-4675-b3b2-7264a9e7499f" />
<br>
<img width="314" height="183" alt="image" src="https://github.com/user-attachments/assets/2f04a7ec-412b-4611-ae37-0c8aa965c320" />
<br>
<img width="364" height="364" alt="image" src="https://github.com/user-attachments/assets/49df0663-3cc1-4c30-b61b-40366a735291" />
<br>

