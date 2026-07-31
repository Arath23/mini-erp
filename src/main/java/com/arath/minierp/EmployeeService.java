package com.arath.minierp;

import java.util.List;
import java.util.Optional;

import com.arath.minierp.model.Employee;
import com.arath.minierp.repository.EmployeeRepository;

public class EmployeeService {

    private EmployeeRepository repository =
        new EmployeeRepository();

    public List<Employee> listarEmpleados() {
        return repository.listaEmpleados();
    }

   public boolean guardarEmpleado(Employee empleado) {

    if (repository.buscarEmpleadoPorId(empleado.getId()).isPresent()) {
        return false;
    }

    if (buscarEmpleadoPorEmail(empleado.getEmail()).isPresent()) {
        return false;
    }

    repository.guardarEmpleado(empleado);
    return true;
}
       
    public boolean actualizarEmpleado(Employee empleado){
        
        if (repository.buscarEmpleadoPorId(empleado.getId()).isEmpty()) {
            return false;
        }
        return repository.actualizarEmpleado(empleado);
       
        } 
    
    public boolean eliminarEmpleado(int id){

        if (repository.buscarEmpleadoPorId(id).isEmpty()){
            return false;
        }
    
        return repository.eliminarEmpleado(id);
    }

    public Optional<Employee> buscarEmpleadoPorId(int id){
        return repository.buscarEmpleadoPorId(id);
    }

    public List<Employee> buscarEmpleadoPorNombre(String nombre){
        return repository.buscarEmpleadosPorNombre(nombre);
    }

    public Optional<Employee> buscarEmpleadoPorEmail(String email){
        return repository.buscarEmpleadoPorEmail(email);
    }

    public List<Employee> buscarEmpleadoPorTelefono(String telefono){
        return repository.buscarEmpleadosPorTelefono(telefono);
    }
}
        


    

