public class Main {
    public static <string> void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int salaryMonth = 29000;
        int totalYear = 0;
        int i = 0;
        while (totalYear < 2_459_000) {
            i++;
            totalYear = totalYear + totalYear / 100;
            totalYear = totalYear + salaryMonth;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalYear + " рублей");
        }
        // Задача 2
        System.out.println("Задача 2");
        int x = 0;
        while (x<10) {
            x++;
            System.out.print(" " + x ); }
        System.out.print("\n");
        for (i = 10; i>0; i--) {
            System.out.print(" " + i);
        }
                // Задача 3
        System.out.print("\n");
        System.out.println("Задача 3");
        int totalPeople = 12_000_000;
        int diedPeople = totalPeople/1000*8;
        int burnPeople = totalPeople/1000*17;
        int differencePeople=0;
        for (int year = 1; year<=10; year++){
            differencePeople = burnPeople-diedPeople;
            totalPeople = totalPeople+differencePeople;
            System.out.println(" Год " + year + " численность населения составляет " + totalPeople + " человек");
        }
        // Задача 4
        System.out.println("Задача 4");
        int totalMoney = 15000;
        int moneyInterestRate = totalMoney*7/100;
        for (i=0; totalMoney < 12_000_000; i++ )  {
             totalMoney = totalMoney + moneyInterestRate;
             System.out.println("Месяц " + i + " сумма накопления составит " + totalMoney + "рублей");
        }
        // Задача 5
        System.out.println("Задача 5");
        int totalMoney1 = 15000;
        int moneyInterestRate1 = totalMoney1*7/100;
        for (i=0; totalMoney1 < 12_000_000; i++ )  {
            totalMoney1 = totalMoney1 + moneyInterestRate1;
            if (i % 6 == 0){
                System.out.println("Месяц " + i + " сумма накопления составит " + totalMoney1 + "рублей");}
                    }
        // Задача 6
        System.out.println("Задача 6");
        int totalMoney2 = 15000;
        int moneyInterestRate2 = totalMoney2*7/100;
        for (i=0; i<108; i++ )  {
            totalMoney2 = totalMoney2 + moneyInterestRate2;
            if (i % 6 == 0){
                System.out.println("Месяц " + i + " сумма накопления составит " + totalMoney2 + "рублей");}
        }
        // Задача 7
        System.out.println("Задача 7");
        int friday = 2;
        for (friday = 2; friday<31; friday = friday+7){
            System.out.println("Сегодня Пятница " + friday + " число, нужно подготовить отчет!" );
        }
        //Задача 8
        System.out.println("Задача 8");
        int dayBefore = 1600;
        for(dayBefore = 1600; dayBefore <1900; dayBefore = dayBefore+79) {
            System.out.println(dayBefore);
        }
        //Задача 9
        System.out.println("Задача 9");
        int y = 0;
        for (i = 1; i<=10; i++){
           y = i*2;
        System.out.println(i + "*2 = " + y ) ;
        }
    }
}