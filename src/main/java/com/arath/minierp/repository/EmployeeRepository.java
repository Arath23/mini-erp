package com.arath.minierp.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.arath.minierp.model.Employee;

public class EmployeeRepository{
    
    private List<Employee> empleados = EmployeeDatasource.employees();
    
    public List<Employee> listaEmpleados(){
    return empleados;
    }
    
    
    public void guardarEmpleado(Employee employee){
    empleados.add(employee);

    }

    
   public boolean eliminarEmpleado(int id) {

    Optional<Employee> empleadoOptional = buscarEmpleadoPorId(id);

    if (empleadoOptional.isPresent()) {

        empleados.remove(empleadoOptional.get());

        return true;
    }

    return false;
}
    public boolean actualizarEmpleado(Employee employee){

        Optional<Employee> empleadoOptional = 
            buscarEmpleadoPorId(employee.getId());

         if (empleadoOptional.isPresent()) {
             Employee empleadoActual = empleadoOptional.get();


                empleadoActual.setNombre(employee.getNombre());
                empleadoActual.setApellido(employee.getApellido());
                empleadoActual.setEmail(employee.getEmail());
                empleadoActual.setTelefono(employee.getTelefono());
                empleadoActual.setFechaNacimiento(employee.getFechaNacimiento());
                empleadoActual.setPuesto(employee.getPuesto());
                empleadoActual.setGenero(employee.getGenero());

                return true;
            }
            return false;
    }

    public Optional<Employee> buscarEmpleadoPorId(int id){
        return listaEmpleados()
        .stream()
        .filter(empleado -> empleado.getId() == id)
        .findFirst();

    }
    
    public Optional<Employee> buscarEmpleadoPorEmail(String email){
      return listaEmpleados()
        .stream()
        .filter(empleado -> empleado.getEmail().equals(email) )
        .findFirst();
        
    }

    public Optional<Employee> buscarEmpleadoPorNombre(String nombre){
        return listaEmpleados()
        .stream()
        .filter(empleado -> empleado.getNombre().equals(nombre))
        .findFirst();
    }

    public Optional<Employee> buscarEmpleadoPorFechaNacimiento(LocalDate fechaNacimiento){
        return listaEmpleados()
        .stream()
        .filter(empleado -> empleado.getFechaNacimiento().equals(fechaNacimiento))
        .findFirst();

    }
    public Optional<Employee> buscarEmpleadoPorTelefono(String telefono){
        return listaEmpleados()
        .stream()
        .filter(empleado -> empleado.getTelefono().equals(telefono))
        .findFirst();
    }
}



