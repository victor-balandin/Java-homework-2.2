public class Main {
    public static void main(String[] args) {
        int initialBalance = 1;
        int replenishment = 1100;
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
            System.out.println("Бонус составил - " + bonus + " руб. " + "Текущий баланс = " + (initialBalance + replenishment + bonus) + " руб.");
        } else {
            System.out.println("Текущий баланс = " + (initialBalance + replenishment));
        }
    }

}