import java.util.UUID;
public class Company {
        String name;
        int fot;
        int empcount;
        Employee[] employee;

        //Создаем компанию с названием и бюджетом на зарплату, фиксируем количество сотрудников
        public Company(String name, int fot, int empcount) {
            this.name = name;
            this.fot=fot;
            this.empcount=empcount;
            System.out.println("Создана организация: "+name+" с фондом оплаты труда "+fot+", Количество сотрудников "+(empcount));
        }

        //Создать массив и объекты массива employee (Создаем вакантные места)
        public void createVacan()
        {
            this.employee = new Employee[this.empcount];
             for(int i=0;i<empcount;i++) {
                 employee[i] = new Employee();

             }
           if (this.empcount!=0){
            System.out.println("В компании "+this.name+" открыто " + (this.empcount)+" вакансий");}
           else{System.out.println("В компании "+this.name+" нет открытых вакансий");}
        }


        //Считаем максимальную зарплату
        public int getMaxSal(){
            int MaxSalary=0;
            for(int i=0;i<this.empcount;i++){
                if (MaxSalary<this.employee[i].salary) {MaxSalary=this.employee[i].salary;}
            }
            return (MaxSalary);
    }
         //Геттер вакансии
         public void getEmployee(int i) {
             boolean f = this.employee[i].isEmpty();
             if (f == true) {
                 System.out.println("Вакансия свободна");
             } else {
                 System.out.println(this.name + ". Рабочее место #" + i + ": " + this.employee[i].name+" "+this.employee[i].surname+" как " + this.employee[i].getDesignation() + ". Зарплата: " + this.employee[i].getSalary());
             }
         }

        //Считаем среднюю зарплату
        public double getAvrSal() {
            int sum=0;
            int count=0; //количество занятых рабочих мест
            for(int i=0;i<this.employee.length;i++){if(this.employee[i].name!=null){count++;};}
            System.out.println("Количество устроенных сотрудников в компании "+this.name+" составляет "+count);
            for(int i=0;i<this.employee.length;i++){
                sum = sum + this.employee[i].salary;
            }
          return (sum/count);
        };
        //Сортируем массив по возрасту

    }