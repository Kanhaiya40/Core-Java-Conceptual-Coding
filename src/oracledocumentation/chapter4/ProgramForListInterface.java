package oracledocumentation.chapter4;

import java.util.ArrayList;
import java.util.List;

/**
 * This Program Illustrate About how list interface is used
 */
public class ProgramForListInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(12);
        list.add(35);
        list.add(48);
        list.add(21);
        list.add(17);
        List<EmplooyeeSalry> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new EmplooyeeSalry(30000));
        listOfEmployee.add(new EmplooyeeSalry(12000));
        listOfEmployee.add(new EmplooyeeSalry(57000));
        listOfEmployee.add(new EmplooyeeSalry(26000));
        listOfEmployee.add(new EmplooyeeSalry(35000));
        listOfEmployee.add(new EmplooyeeSalry(17000));
        listOfEmployee.add(new EmplooyeeSalry(67000));
        System.out.println(list);
        System.out.println(listOfEmployee);
    }
}

class EmplooyeeSalry {
    private final int salary;

    EmplooyeeSalry(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "" + salary;
    }
}
