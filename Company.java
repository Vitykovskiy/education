public class Company {
        String name;
        int fot;
        int empcount;
        Employee[] employee;
        private int MaxSalary;

        //Создаем компанию с названием и бюджетом на зарплату, фиксируем количество сотрудников
        public Company(String name, int fot, int empcount) {
            this.name = name;
            this.fot=fot;
            this.empcount=empcount;
            System.out.println("Created new organisation: "+name+" with fot "+fot+", Employees count "+(empcount));
        }

        //Создать объекты массива employee
        public void createVacan()
        {
             for(int i=0;i<empcount;i++){
                this.employee[i]= new Employee();
                System.out.println("Otkrita vakansia #"+i);
             }
        }

        //Закрепляем сотрудника за компанией
        public void setEmployee(Employee[] employee)
        {int i = 0;
            this.employee = employee;
            System.out.println(this.name+" add new employee"+": "+employee[i].name+" as "+employee[i].getDesignation()+". Salary: "+employee[i].getSalary());
        }

        //Выводим максимальную зарплату
        public int getMaxSal(){
        return MaxSalary;
    }

        //Считаем среднюю зарплату
        public double getAvrSal() {
            int sum=0;
            for(int i=0;i<empcount;){
                sum = sum + this.employee[i].getSalary();
                i++;
                System.out.println(sum);
            }
          return (float) sum/(empcount);
        };
    }