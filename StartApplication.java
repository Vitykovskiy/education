public class StartApplication {

    public static void main(String args[]){

        //Создаю компанию со значениями Имя ФОТ и количество сотрудников
        Company org = new Company("British Petrolium", 100000,10);
        Company org1 = new Company("Газпром", 50000,0);

        //Cоздаем массив сотрудников вместе с объектами (Открываем вакансии)
        org.createVacan();
        org1.createVacan();

        //Присваивааем пустым объектам массива сотрудников значения Имя Фамилия Возраст Пол (Набираем соискателей)
        org.employee[0].createEmployee("Victor","Surskov",28,"man");
        org.employee[1].createEmployee("Ivan","Antamanov",27,"man");
        org.employee[2].createEmployee("Jamal","Jamalovich",21,"man");
        org.employee[3].createEmployee("Jamal","Abdulovich",21,"man");
        org.employee[4].createEmployee("Maria","Ivanova",34,"woman");
        org.employee[5].createEmployee("Elena","Gorbunova",29,"woman");
        org.employee[6].createEmployee("Tatyana","Kabachenko",60,"woman");

        //Присваивааем пустым объектам массива сотрудников значения Зарплата Должность (Устраиваем на работу)
        org.employee[0].setWorkplace(1000,"Стажер");
        org.employee[1].setWorkplace(5000,"Coder-Shmoder");
        org.employee[2].setWorkplace(50000,"Hach-Trukach");
        org.employee[3].setWorkplace(1200,"Стажер");
        org.employee[4].setWorkplace(1150,"Стажер");
        org.employee[5].setWorkplace(1300,"Стажер");
        org.employee[6].setWorkplace(1700,"Стажер");

        //Выводим среднюю зарплату и максимальную зарплаты
        System.out.println("Максимальная зарплата в компании "+org.name+" составляет "+org.getMaxSal());
        System.out.println("Средняя зарплата в компании "+org.name+" составляет "+org.getAvrSal());
        org.getEmployee(4);
    }
}
