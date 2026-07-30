package com.arath.minierp.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.arath.minierp.model.Employee;
import com.arath.minierp.model.Employee.Genero;
import com.arath.minierp.model.Employee.Puesto;

public class EmployeeDatasource {
        private static final List<Employee> employees = crearEmpleadosIniciales();
    
        public static List<Employee> employees() {
        return employees;
    }
     public static List<Employee> crearEmpleadosIniciales() {
        Employee emp1 = new Employee( 1, "Arath Daniel", "Noriega Dominguez", LocalDate.of(2002, 10, 1), "anoriega@email.com", "+52 2294187188", Puesto.BACKEND, Genero.HOMBRE);
        Employee emp2 = new Employee( 2, "Alejandro Manuel", "Perez Camarillo", LocalDate.of(1999, 11, 25), "amanuel@email.com", "+52 2293547810",Puesto.BACKEND, Genero.HOMBRE);
        Employee emp3 = new Employee( 3, "Mario Miguel", "Espinosa Sanchez", LocalDate.of(2003, 1, 2), "mmcuadrado@email.com", "+52 2292154789", Puesto.SOPORTE_TECNICO, Genero.HOMBRE);
        Employee emp4 = new Employee( 4, "Jalil", "Hernandez Vazques", LocalDate.of(2001, 05, 30), "jvazques@email.com", "+52 2294181127", Puesto.RECURSOS_HUMANOS, Genero.HOMBRE);
        Employee emp5 = new Employee( 5, "Daniel", "Guillen Hermida", LocalDate.of(2002, 8, 15), "danielhermida@email.com", "+52 2292010126", Puesto.RECURSOS_HUMANOS, Genero.HOMBRE);
        Employee emp6 = new Employee( 6, "Arturo", "Mata Galvan", LocalDate.of(1978, 10, 1), "matarturo@email.com", "+52 2294151478", Puesto.RECURSOS_HUMANOS, Genero.HOMBRE);
        Employee emp7 = new Employee( 7, "Abigail", "Espinosa Rodriguez", LocalDate.of(2002, 11, 10), "abirodri@email.com", "+52 2291668877", Puesto.FRONTEND, Genero.MUJER);
        Employee emp8 = new Employee( 8, "Dafne Naomi", "Moreno Romero", LocalDate.of(2012, 12, 12), "morenodn@email.com", "+52 2292698745", Puesto.ANALISTA, Genero.MUJER);
        Employee emp9 = new Employee( 9, "Karla Irasema", "Flores", LocalDate.of(2002, 9, 1), "iraflor@email.com", "+52 2292229974", Puesto.SOPORTE_TECNICO, Genero.MUJER);
        Employee emp10 = new Employee(10, "Leonardo Daniel", "Perez Perez", LocalDate.of(1965, 05, 24), "ldp@email.com", "+52 2291347941", Puesto.BACKEND, Genero.HOMBRE);
        Employee emp11 = new Employee(11, "Alexa ", "Trujillo", LocalDate.of(1960, 05, 1), "alexatruj@email.com", "+52 2294251978", Puesto.FRONTEND, Genero.MUJER);
        Employee emp12 = new Employee(12, "Josie", "Montenegro", LocalDate.of(2004, 06, 25), "montenegroj@email.com", "+52 229314578", Puesto.SOPORTE_TECNICO, Genero.MUJER);
        Employee emp13 = new Employee(13, "Jorge ", "Estudillo", LocalDate.of(2000, 9, 30), "jorgestdillo@email.com", "+52 2291917500", Puesto.FRONTEND, Genero.HOMBRE);
        Employee emp14 = new Employee(14, "Fidel", "Velazques", LocalDate.of(1999, 05, 9), "fidelvelazques@email.com", "+52 2291004572", Puesto.FULLSTACK, Genero.HOMBRE);
        Employee emp15 = new Employee(15, "Bruno", "Avila Camacho", LocalDate.of(2006, 06, 6), "brunocamacho@email.com", "+52 2292778844", Puesto.SOPORTE_TECNICO, Genero.HOMBRE);
        Employee emp16 = new Employee(16, "Miranda", "Quiroz", LocalDate.of(2010, 10, 10), "mirandaquiroz@email.com", "+52 2293569841", Puesto.BACKEND, Genero.MUJER);
        Employee emp17 = new Employee(17, "Jorge", "Morita", LocalDate.of(2008, 11, 1), "moritamorita@email.com", "+52 2292105069", Puesto.RECURSOS_HUMANOS, Genero.HOMBRE);
        Employee emp18 = new Employee(18, "Jude", "Bellingham", LocalDate.of(2001, 12, 25), "bellingham@email.com", "+52 2291005789", Puesto.ANALISTA, Genero.HOMBRE);
        Employee emp19 = new Employee(19, "Erick Jared", "Lopez ", LocalDate.of(2002, 02, 2), "lopezjared@email.com", "+52 2299240080", Puesto.FRONTEND, Genero.HOMBRE);
        Employee emp20 = new Employee(20, "Juan", "Quiñones", LocalDate.of(1997, 12, 3), "quiñonesjuan@email.com", "+52 2294781412", Puesto.BACKEND, Genero.HOMBRE);

        return new ArrayList<>(Arrays.asList(
            emp1,
            emp2,
            emp3,
            emp4,
            emp5,
            emp6,
            emp7,
            emp8,
            emp9,
            emp10,
            emp11,
            emp12,
            emp13,
            emp14,
            emp15,
            emp16,
            emp17,
            emp18,
            emp19,
            emp20
        ));
}

}