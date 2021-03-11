public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int refill = 2000;
        int bonus = refill / 100;
        int limit = 1000;
        int  amount = balance+bonus +refill;
        if (refill >= limit) {
            bonus = refill / 100;
        }
        else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
