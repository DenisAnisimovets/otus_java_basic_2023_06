package homework09.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
    List<String> getListName(ArrayList<Employee> list) {
        List<String> listName = new ArrayList<>();
        for (Employee employee : list) {
            listName.add(employee.getName());
        }
        return listName;
    }

    boolean getMiddleAge(ArrayList<Employee> list, int age) {
        int middleAge = 0;
        for (Employee employee : list) {
            middleAge += employee.getAge();
        }
        return middleAge > list.size() * age;
    }

    List<Employee> getListByAge(ArrayList<Employee> list, int age) {
        List<Employee> listEmployee = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getAge() >= age) {
                listEmployee.add(employee);
            }
        }
        return listEmployee;
    }

    Employee getYoungestEmployee(ArrayList<Employee> list) {
        Employee youngestEmployee = list.get(0);
        for (Employee employee : list) {
            if(employee.getAge() < youngestEmployee.getAge()) {
                youngestEmployee = employee;
            }
        }
        return youngestEmployee;
    }
}
