public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenished = 6500;
        int bonus;
        if (replenished >= 9000) {
            bonus = balance + replenished  / 100;
        } else {
            bonus = balance + replenished;
        }
        System.out.println(bonus);
    }
        }