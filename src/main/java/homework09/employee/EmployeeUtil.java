package homework09.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
    List<String> getListName(List<Employee> list) {
        List<String> listName = new ArrayList<>();
        for (Employee employee : list) {
            listName.add(employee.getName());
        }
        return listName;
    }

    boolean getMiddleAge(List<Employee> list, int middleAge) {
        int totalAge = 0;
        for (Employee employee : list) {
            totalAge += employee.getAge();
        }
        return totalAge > list.size() * middleAge;
    }

    List<Employee> getListByAge(List<Employee> list, int age) {
        List<Employee> listEmployee = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getAge() >= age) {
                listEmployee.add(employee);
            }
        }
        return listEmployee;
    }

    Employee getYoungestEmployee(List<Employee> list) {
        Employee youngestEmployee = list.get(0);
        for (Employee employee : list) {
            if(employee.getAge() < youngestEmployee.getAge()) {
                youngestEmployee = employee;
            }
        }
        return youngestEmployee;
    }
}
