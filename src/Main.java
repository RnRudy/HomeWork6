public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task1(){
        System.out.println("\n" + "Задача 1" + "\n");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

    }

    public static void  task2() {
        System.out.println("\n" + "Задача 2" + "\n");
        for (int i = 10; i >=0; i --) {
        System.out.println(i);
        }

    }

    public static void task3(){
        System.out.println("\n" + "Задача 3" + "\n");
        for (int i = 0; i <= 17; i= i + 2) {
            System.out.println(i);
        }
    }

    public static void  task4(){
        System.out.println("\n" + "Задача 4" + "\n");
        for (int i = 10; i >= -10; i --) {
            System.out.println(i);
        }
    }

    public static void task5(){
        System.out.println("\n" + "Задача 5" + "\n");
        for(int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + " год является високосным.");
        }
    }

    public static void task6(){
        System.out.println("\n" + "Задача 6" + "\n");
        for (int i =7; i <=98; i = i+7) {
            System.out.println(i);
        }
    }

    public static void task7(){
        System.out.println("\n" + "Задача 7" + "\n");
        for (int i = 1; i <= 512; i = i * 2 ) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("\n" + "Задача 8" + "\n");
        int salary = 29000;
        int bank = 0;
        for (int i = 0; i <12; i++) {
            bank = bank + salary;
            System.out.println("Месяц " + i + "—й, сумма накоплений равна " + bank + " рублей.");
        }
    }

    public static void task9() {
        System.out.println("\n" + "Задача 9" + "\n");
        int salary = 29000;
        int bank = 0;

        int salaryWithPenny = salary * 100;
        int bankWithPenny = 0;
        for (int i = 0; i < 12; i++) {
        bankWithPenny = bankWithPenny + bankWithPenny / 100;
        bankWithPenny = bankWithPenny + salaryWithPenny;
        bank = bankWithPenny / 100;
        System.out.println("Месяц " + i + "—й, сумма накоплений равна " + bank + " рублей.");

        }
    }

    public static void task10(){
        System.out.println("\n" + "Задача 10" + "\n");
        for (int i = 1; i <=10;  i++) {
        int j = i*2;
        System.out.println("2*" + i + "=" + j);
        }
    }
}