public class Main {
    public static void main(String[] args) {
        int initialBalance = 100; // изначальный баланс
        int refill = 1100; //пополнение счета
        int bonus = refill / 100;// бонус за каждые 100 рублей
        if (refill > 1000) {
            int amount = initialBalance + refill + bonus;
            System.out.println("Итоговая сумма-" + amount + "руб.; Бонусы-" + bonus + "руб.");

        } else {
            int amount1 = initialBalance + refill;
            System.out.println("Итоговая сумма-" + amount1 + "руб.; Бонусы - 0 руб.");
        }
    }
}
