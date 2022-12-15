
package StaffBook;

import java.util.Objects;
import java.util.stream.IntStream;

public class Employee {
    private String FIO;
    private int departament;
     float salary;
    private int id;
    private static int counter;

    public Employee(String FIO, int departament, float salary) {
        this.FIO = FIO;
        this.departament = departament;
        this.salary = salary;
        this.id = ++counter;
    }

    @Override
    public String toString() {
        return "ID: " + id + " ФИО: " + FIO + " отдел; " + departament + " зарплата: " + salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

}