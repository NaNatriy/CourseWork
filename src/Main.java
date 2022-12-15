import StaffBook.Employee;
import java.util.Arrays;

public class Main {
    public static Employee[] staff = new Employee[10];
    public static int max = 0;


    public static void main(String[] args) {

        staff[0] = new Employee("Смирнов Тимур Артёмович", 1, 26000f);
        staff[1] = new Employee("Маркова Анна Романовна", 2, 29500f);
        staff[2] = new Employee("Титов Георгий Ярославович", 3, 32000f);
        staff[3] = new Employee("Королев Фёдор Александрович", 4, 30500f);
        staff[4] = new Employee("Малинина Сафия Михайловна", 5, 45000f);
        staff[5] = new Employee("Максимов Давид Артёмович", 1, 36600f);
        staff[6] = new Employee("Егорова Кира Сергеевна", 2, 64000f);
        staff[7] = new Employee("Серов Никита Глебович", 3, 51500f);
        staff[8] = new Employee("Сазонов Ярослав Михайлович", 4, 28800f);
        staff[9] = new Employee("Кузнецова Милана Георгиевна", 5, 59000f);
        // просто список
        for (Employee employee : staff) {
            System.out.println(employee);
        }
        // выводим
        printTotalSalary();
        printMaxSalary();
        printMinSalary();
        printMiddleSalary();
        printFIO(staff);
    }
    //////////////////////////////////////////////////////////////////////////////////
    public static int totalSalary(Employee[] staff) {
        int sum = 0;
        for (int i = 0; i < Main.staff.length; i++) {
        sum += Main.staff[i].getSalary();
        }
        return sum;
    }
    // ******* Cуммa затрат на зарплат в месяц *******
    public static void printTotalSalary() {
        System.out.println("Cуммa затрат на зарплаты в месяц: " + totalSalary(staff));
    }
    //////////////////////////////////////////////////////////////////////////////////
    public static Employee maxSalary(Employee[] objects) {
        Employee max = null;
        for (Employee obj : objects) {
            if (max == null || obj.getSalary() > max.getSalary()) {
                max = obj;
            }
        }
        return max;
    }
    // ******* Сотрудник с максимальной зарплатой *******
    public static void printMaxSalary() {
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalary(staff));
    }
    //////////////////////////////////////////////////////////////////////////////////
    public static Employee minSalary(Employee[] objects) {
        Employee min = null;
        for (Employee obj : objects) {
            if (min == null || obj.getSalary() < min.getSalary()) {
                min = obj;
            }
        }
        return min;
    }
    // ******* Сотрудник с минимальной зарплатой *******
    public static void printMinSalary() {
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalary(staff));
    }
    //////////////////////////////////////////////////////////////////////////////////
    public static int middleSalary(Employee[] objects) {
        int mid = totalSalary(staff) / Main.staff.length;
        return mid;
    }
    // ******* Cреднее значение зарплат *******
    public static void printMiddleSalary() {
        System.out.println("Cреднее значение зарплат: " + middleSalary(staff));
    }
    //////////////////////////////////////////////////////////////////////////////////
    public static String printFIO(Employee[] objects) {
            Arrays.stream(objects).map(Employee::getFIO).forEach(System.out::println);
        return null;
    }
    // ******* Штат сотрудников *******
}
