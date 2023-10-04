public class Main {
    public static void main(String[] args) {
        int account = 200;
        int replenishment = 1500;
        if (replenishment > 1000) {
            System.out.println(replenishment / 100 + replenishment + account);
        } else {
            System.out.println(replenishment + account);
        }

    }
}