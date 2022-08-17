public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int sum = 1100;
        int gift = 1;
        int bonus;
        if (sum <= 1000) {
            bonus = 0;
        } else {
            bonus = sum / 100;
        }
        int totalBonus = balance + sum + bonus;
        System.out.println(totalBonus);
    }
}
