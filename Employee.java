public class Employee {
    String name;
    String surname;
    int age;
    String gender;
    int salary;
    private String designation;

    //Создаем сотрудника (имя, фамилия, возраст, пол)
    public void createEmployee(String name,String surname, int age, String gender)
    {
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.gender = gender;
        System.out.println("Created object "+name+" "+surname+" ("+gender+", "+age+" years)");
    }
    //устанавливаем зарплату
    public void setSalary(int salary)
    {
        this.salary = salary;
        this.designation=designation;
        System.out.println(name+"'s' salary is "+salary);
    }
    //устанавливаем должность
    public void setDesignation(String designation)
    {
        this.designation=designation;
        System.out.println(this.name+"'s' designation is "+this.designation);
    }
    //устанавливаем зарплату и должность
    public void setWorkplace(int salary, String designation)
    {
        this.salary = salary;
        this.designation=designation;
        System.out.println(name+"'s' designation is "+designation+" with salary "+salary);
    }
    //Геттеры зарплаты и должности
    public int getSalary(){
        return salary;
    }
    public String getDesignation() {return designation;}

}
