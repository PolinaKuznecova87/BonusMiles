public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        //Сумма на счете
        int amount = 100;
        //Сумма поступления
        int bonus;
        //Сумма бонуса
        if (amount > 1000) {
            bonus = amount / 100;

        } else {

            bonus = 0;
        }


        int endAmount = initialAmount + amount + bonus;
        //Конечная сумма на счете


        System.out.println("Сумма на счете  " + initialAmount);
        System.out.println("Сумма поступлений  " + amount);
        System.out.println("Бонус   " + bonus);
        System.out.println("Конечная сумма на счете  " + endAmount);
    }
}

