public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int storage = 15000;
        int full = 0;
        int i = 0;
        while (full < 2_569_000) {
            full = full + full / 100;
            full = full + storage;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + full + " рублей");
        }
        System.out.println("Задание 2");

        int a = 0;
        while (a <= 9){
            a = a + 1;
        System.out.print(a + " ");}
        System.out.println(" ");
        for ( int b = 10;b>=1;b-- )
            System.out.print(b + " ");

        System.out.println("Задание 3");
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int growth = born - death;
        for(int year = 1; year <= 10; year++){
            population += population * growth / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);}
//Домашнее задание 2
        System.out.println( "Задание 2.1");
        double startCapital = 15000;
        double percent = 1.07;
        int m = 1;
        while ( startCapital<=12_000_000){
            startCapital = startCapital*percent;
            m = m+1;
                System.out.println("Месяц " + m + ", сумма накоплений равняется: " + startCapital + " рублям.");}

    }
}