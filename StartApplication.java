public class StartApplication {
Company org;
    public static void main(String args[]){

        Company org = new Company("British Petrolium", 100000,3);

        Employee[] employee = new Employee[org.empcount];
        for(int i=0;i< employee.length;i++){
            employee[i]= new Employee();
            System.out.println("Otkrita vakansia #"+i);
        }
        //org.createVacan();

        employee[0].createEmployee("Victor","Surskov",28,"man");
        employee[1].createEmployee("Ivan","Antamanov",27,"man");
        employee[2].createEmployee("Jamal","Jamalovich",21,"man");

        employee[0].setDesignation("Newbie");
        employee[0].setSalary(1000);

        employee[1].setWorkplace(5000,"Coder-Shmoder");
        employee[2].setWorkplace(50000,"Hach-Trukach");

        System.out.println("Average salary in Company is "+org.getAvrSal()+" $");
        System.out.println("Max salary in Company is "+org.getMaxSal()+" $");
    }
}
