package demos.ejercicios.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class PhoneSet {
    public Set<?> PhoneDirectory = new Set() {
    }
 
    public void addEntry(Employee employee){
        String key=generateKey(employee);
        ((Object) PhoneDirectory).put(key,employee);
    }
    public String generateKey(Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generateKey'");

    }
     static List<Employee> list = new ArrayList<>();
    static void sortList() {
        Collections.sort(list);

    }

    public static void main(String[] args) {
        
        list.add(new Employee(2,"Pepa", "Perez", "21/12/2023"));
        list.add(new Employee(1,"Pepe", "Perez", "21/12/2023"));
        list.add(new Employee(3,"Luisa", "Lopez", "12/12/2023"));

        sortList();
        System.err.println(list);
    }
    }

