import java.util.UUID;
public class Company {
    String name;
    int fot;
    int empcount;
    Employee[] employee;

    //Создаем компанию с названием и бюджетом на зарплату, фиксируем количество сотрудников
    public Company(String name, int fot, int empcount) {
        this.name = name;
        this.fot = fot;
        this.empcount = empcount;
        System.out.println("Создана организация: " + name + " с фондом оплаты труда " + fot + ", Количество сотрудников " + (empcount));
    }

    //Создать массив и объекты массива employee (Создаем вакантные места)
    public void createVacan() {
        this.employee = new Employee[this.empcount];
        for (int i = 0; i < empcount; i++) {
            employee[i] = new Employee();

        }
        if (this.empcount != 0) {
            System.out.println("В компании " + this.name + " открыто " + (this.empcount) + " вакансий");
        } else {
            System.out.println("В компании " + this.name + " нет открытых вакансий");
        }
    }


    //Считаем максимальную зарплату
    public int getMaxSal() {
        int MaxSalary = 0;
        for (int i = 0; i < this.empcount; i++) {
            if (MaxSalary < this.employee[i].salary) {
                MaxSalary = this.employee[i].salary;
            }
        }
        return (MaxSalary);
    }

    //Геттер вакансии
    public void getEmployee(int i) {
        if (this.employee[i].isEmpty()== true) {
            System.out.println("Вакансия свободна");
        }
        else {
            System.out.println(this.name + ". Рабочее место #" + i + ": " + this.employee[i].name + " " + this.employee[i].surname +" ("+this.employee[i].age+" y.o.) как " + this.employee[i].getDesignation() + ". Зарплата: " + this.employee[i].getSalary());
        }
    }

    public void getEmployees() {
        for(int i=0;i<this.employee.length;i++) {
            if (this.employee[i].isEmpty() == true) {
                System.out.println("Вакансия свободна");
            }
            else {
                System.out.println(this.name + ". Рабочее место #" + i + ": " + this.employee[i].name + " " + this.employee[i].surname + " (" + this.employee[i].age + " y.o.) как " + this.employee[i].getDesignation() + ". Зарплата: " + this.employee[i].getSalary());
            }
        }
    }

    //Считаем среднюю зарплату
    public double getAvrSal() {
        int sum = 0;
        int count = 0; //количество занятых рабочих мест
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i].name != null) {
                count++;
            }
            ;
        }
        System.out.println("Количество устроенных сотрудников в компании " + this.name + " составляет " + count);
        for (int i = 0; i < this.employee.length; i++) {
            sum = sum + this.employee[i].salary;
        }
        return (sum / count);
    }

    ;

    //Сортируем массив по возрасту
    public void sortAge() {

        Employee[] sortEmp = new Employee[this.employee.length]; //создаем новый массив для сортировки
        int d=0;
        for (int e = 0; e < this.employee.length; e++)
        {
            int a = 0;
            for (int i = 0; i < this.employee.length; i++)
            {
                if (this.employee[i].age >= a) //Поиск по всему массиву максимального возраста
                {
                    a = this.employee[i].age; d=i;
                }
                else
                    {
                    i++;
                    }
            }
            if(this.employee[d].isEmpty()==false) {
                sortEmp[e] = this.employee[d]; //добавляем объект с максимальным возрастом в новый массив и зануляем исходный объект
                this.getEmployee(d);
                this.employee[d].age = 0;
            }
        }
        this.employee=sortEmp;
    }
    public void sortSalary() {

        Employee[] sortEmp = new Employee[this.employee.length]; //создаем новый массив для сортировки
        int d=0;
        for (int e = 0; e < this.employee.length; e++)
        {
            int a = 0;
            for (int i = 0; i < this.employee.length; i++)
            {
                if (this.employee[i].salary >= a) //Поиск по всему массиву максимальной зарплаты
                {
                    a = this.employee[i].salary; d=i;
                }
                else
                {
                    i++;
                }
            }
            if(this.employee[d].isEmpty()==false) {
                sortEmp[e] = this.employee[d]; //добавляем объект с максимальной зарплаты в новый массив и зануляем исходный объект
                this.getEmployee(d);
                this.employee[d].salary = 0;
            }
        }
        this.employee=sortEmp;
    }
}