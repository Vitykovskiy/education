public class StartApplication {

    public static void main(String args[]){

        //Создаю компанию со значениями Имя ФОТ и количество сотрудников
        Company org = new Company("British Petrolium", 100000,3);
        Company org1 = new Company("Газпром", 50000,2);

        //Cоздаем массив сотрудников вместе с объектами (Открываем вакансии)
        org.createVacan();
        org1.createVacan();

        //Присваивааем пустым объектам массива сотрудников значения Имя Фамилия Возраст Пол (Набираем соискателей)
        org.employee[0].createEmployee("Victor","Surskov",28,"man");
        org.employee[1].createEmployee("Ivan","Antamanov",27,"man");
        org.employee[2].createEmployee("Jamal","Jamalovich",21,"man");

        //Присваивааем пустым объектам массива сотрудников значения Зарплата Должность (Устраиваем на работу)
        org.employee[0].setWorkplace(1000,"Newbie");
        org.employee[1].setWorkplace(5000,"Coder-Shmoder");
        org.employee[2].setWorkplace(50000,"Hach-Trukach");

        //Выводим среднюю зарплату и максимальную зарплаты
        System.out.println("Максимальная зарплата в компании "+org.name+" составляет "+org.getMaxSal());
        System.out.println("Средняя зарплата в компании "+org.name+" составляет "+org.getAvrSal());
    }
}
