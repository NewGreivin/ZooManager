/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Employees;

import Lists.List;
import java.util.HashMap;

/**
 *
 * @author Ricardo Chaves
 */
public class EmployeeHashMap implements List<Employee> {
    HashMap<String, Employee> map;

    public EmployeeHashMap() {
        this.map = new HashMap<>();
    }
    
    @Override
    public Employee find(Object id) {
        String idt = String.valueOf(id);
        return map.get(idt);
    }

    @Override
    public boolean remove(Employee t) {
        if(!map.containsKey(t.getId())) return false;
        map.remove(t.getId(), t);
        return true;
    }

    @Override
    public void showAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(Employee t) {
        if(map.containsKey(t.getId())) return false;
        map.remove(t.getId());
        return true;
    }
    
}
