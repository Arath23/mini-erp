package com.arath.minierp;

import java.time.LocalDate;
import java.util.Scanner;

import com.arath.minierp.model.Employee;
import com.arath.minierp.model.Employee.Genero;
import com.arath.minierp.model.Employee.Puesto;

public class Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        
        Scanner sc = new Scanner(System.in);
                
        int opcion;

    do {

    System.out.println("\n========== MINI ERP ==========");
    System.out.println("1. Listar empleados");
    System.out.println("2. Buscar empleado por email");
    System.out.println("3. Agregar empleado");
    System.out.println("4. Actualizar empleado");
    System.out.println("5. Eliminar empleado");
    System.out.println("6. Salir");
    System.out.print("Seleccione una opción: ");

    opcion = sc.nextInt();
        sc.nextLine();
    switch (opcion) {
        
            case 1 :
                     service.listarEmpleados()
                     .forEach(System.out::println);
            break;
            case 2 :
                System.out.println("Ingresa el email: ");
              String email = sc.next();

               service.buscarEmpleadoPorEmail(email)
                .ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Empleado no encontrado")
                     );
            break;
               
           case 3:

                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();

                    System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
                    LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());

                    System.out.print("Email: ");
                    String nuevoEmail = sc.nextLine();

                    System.out.print("Telefono: ");
                    String telefono = sc.nextLine();

                    System.out.print("Puesto: ");
                    Puesto puesto = Puesto.valueOf(sc.nextLine().toUpperCase());
                    System.out.print("Genero (HOMBRE/MUJER): ");
                    Genero genero = Genero.valueOf(sc.nextLine().toUpperCase());

                    Employee nuevoEmpleado = new Employee(
                            id,
                            nombre,
                            apellido,
                            fechaNacimiento,
                            nuevoEmail,
                            telefono,
                            puesto,
                            genero
                    );

                  
                    boolean guardado = service.guardarEmpleado(nuevoEmpleado);
                    

                    if(guardado){

                    System.out.println("Empleado guardado correctamente.");
                    } else {
                        System.out.println("No se pudo guardar el empleado");
                    }
                    break;

            case 4:
                System.out.print("ID del empleado a actualizar: ");
                int idActualizar = sc.nextInt();
                sc.nextLine();

                System.out.print("Nuevo nombre: ");
                String nuevoNombre = sc.nextLine();

                System.out.print("Nuevo apellido: ");
                String nuevoApellido = sc.nextLine();

                System.out.print("Nueva fecha (AAAA-MM-DD): ");
                LocalDate nuevaFecha = LocalDate.parse(sc.nextLine());

                System.out.print("Nuevo email: ");
                String emailActualizado = sc.nextLine();

                System.out.print("Nuevo telefono: ");
                String nuevoTelefono = sc.nextLine();

                System.out.print("Nuevo puesto: ");
                Puesto nuevoPuesto = Puesto.valueOf(sc.nextLine().toUpperCase());

                System.out.print("Nuevo genero (HOMBRE/MUJER): ");
                Genero nuevoGenero = Genero.valueOf(sc.nextLine().toUpperCase());

                Employee empleadoActualizado = new Employee(idActualizar,
                    nuevoNombre, nuevoApellido, nuevaFecha,
                    emailActualizado, nuevoTelefono, nuevoPuesto, nuevoGenero);

                boolean actualizado = service.actualizarEmpleado(empleadoActualizado);

                if (actualizado) {
                    System.out.println("Empleado actualizado correctamente.");
                } else {
                    System.out.println("Empleado no encontrado.");
                }
                break;

            case 5: 

            System.out.println("Ingresa id del usuario: ");
            int idEliminar = sc.nextInt();
             if(service.eliminarEmpleado(idEliminar)){
                      System.out.println("Empleado eliminado correctamente");
                    } else {
                     System.out.println("Empleado no encontrado");
                    }
            break;
             case 6:
                System.out.println("Hasta luego.");
                break;
        }

    } while (opcion != 6);

    sc.close();

    }
}

    