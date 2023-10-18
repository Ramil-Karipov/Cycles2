public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int salary1 = 15000;
        int total1 = 0;
        for (int i = 1; total1 < 2459000; i++) {
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }
        System.out.println("Задача 2");
        int i = 1;
        while (i<=10) {
            System.out.print( i + " ");
            i = i + 1;}
        System.out.println();
        for (int a=10; a>=1; a-- ) {
            System.out.print( a + " ");}
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int yaer = (17-8)*12_000;
        for (int b = 1; b<=10; b++) {
            population=population + yaer;
            System.out.println("Год " + b + ", численность населения составляет " + population + "человек");}
        System.out.println("Задача 4");
        int salary1 = 15000;
        int total1 = salary1 * (7/100);
        for (int i = 1; total1 < 12_000_000; i++) {
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");


    }
}