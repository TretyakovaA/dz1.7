public class Main {
    public static void main(String[] args) {

        task3(); task2(); task1();

    }

    ////task3
    private static void task3() {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        firstName = firstName.replace('ё', 'е');
        middleName = middleName.replace('ё', 'e');
        lastName = lastName.replace('ё', 'е');
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные сотрудника - " + fullName);


    }

    private static void task2() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        //// task2
        firstName = firstName.toUpperCase();
        middleName = middleName.toUpperCase();
        lastName = lastName.toUpperCase();
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО Сотрудника для заполнения отчета - " + fullName);
    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }
}