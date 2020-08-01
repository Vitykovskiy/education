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
            System.out.println("Created new organisation: "+name+" with fot "+fot+", Employees count "+(empcount));
        }

        //Создать массив и объекты массива employee (Создаем вакантные места)
        public void createVacan()
        {
            this.employee = new Employee[this.empcount];
             for(int i=0;i<empcount;i++) {
                 employee[i] = new Employee();
                 System.out.println("В компании "+this.name+" открыта вакансия #" + (i+1));
             }
        }

        //Закрепляем сотрудника за компанией
       public void setEmployee(Employee employee)
        {   int i=0;
            this.employee[i] = employee;
            System.out.println(this.name+" add new employee"+": "+this.employee[i].name+" as "+this.employee[i].getDesignation()+". Salary: "+this.employee[i].getSalary());
        }

        //Считаем максимальную зарплату
        public int getMaxSal(){
            int MaxSalary=0;
            for(int i=0;i<this.empcount;i++){
                if (MaxSalary<this.employee[i].salary) {MaxSalary=this.employee[i].salary;}
            }
            return (MaxSalary);
    }

        //Считаем среднюю зарплату
        public double getAvrSal() {
            int sum=0;
            for(int i=0;i<this.employee.length;i++){
                sum = sum + this.employee[i].salary;
            }
          return (sum/(this.employee.length));
        };
    }