public class Main {

    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        var ivanov = new Employee("Иванов Иван Иванович", 1, 70_000);
        var petrov = new Employee("Петров Пётр Петрович", 2, 90_000);
        var sidoriv = new Employee("Сидоров Сидор Сидорович", 3, 300_000);
        var smirnov = new Employee("Смиров Смирно Смирнович", 2, 39_750);
        var khlebnikov = new Employee("Хлебников Хлеб Хлебникович", 4, 90_000);
        var ryskaliev = new Employee("Рыскалиев Рыскали Рыскалиевич", 1, 83_000);

        employees[0] = ivanov;
        employees[1] = petrov;
        employees[2] = sidoriv;
        employees[3] = smirnov;
        employees[4] = khlebnikov;
        employees[5] = ryskaliev;

        printEmployee();
        System.out.println("Сумма зарплат = " + sumSalary());
        System.out.println("Минимальная зарплата = " + minSalary());
        System.out.println("Максимальная зарплата = " + maxSalary());
        System.out.println("Средняя зарплата = " + averageSalary());
    }

    public static void printEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public static double sumSalary() {
        double sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sumSalary += employees[i].getSalary();
            }
        }
        return sumSalary;
    }

    public static double maxSalary() {
        double maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() >= maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }


    public static double minSalary() {
        double minSalary = maxSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() <= minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }
    public static double averageSalary() {
        double sumSalary = 0;
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                counter++;
                sumSalary += employees[i].getSalary();
            }
        }
        return sumSalary / counter;
    }
}