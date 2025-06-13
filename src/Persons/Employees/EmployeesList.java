
package Persons.Employees;

import Lists.List;
/**
 *
 * @author Usuario
 */
public class EmployeesList implements List<Employee> {
    private Employee List[];
    
    public EmployeesList(){
        this.List = new Employee[100];
    }
    

    
    @Override
    public Employee find(Object id) {
        for (int i = 0; i < List.length; i++) {
            if (List[i] != null) {
                if (List[i].getId().equals(id)) {
                    return List[i];
                }
            }
        }
        return null;
    }

    @Override
    public boolean remove(Employee t) {
    for (int i = 0; i < List.length; i++) {
            if (List[i] != null && List[i].equals(t)) {
                List[i] = null;
                return true;
            }
        }
        return false;


    }

    @Override
    public void showAll() {
        for (int i = 0; i < List.length; i++) {
            if (List[i] != null) {
                System.out.println(List[i].toString());
            }
        }
       
    }

    

    @Override
    public boolean add(Employee t) {
       
        if (find(t.getId()) != null) {
            return false; 
        }

        for (int i = 0; i < List.length; i++) {
            if (List[i] == null) {
                List[i] = t;
                return true;
            }
        }
        return false;
    }
}  
    

