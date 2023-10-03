public class Main {
    public static void main(String[] args) {
        int check = 200;
        int replenish = 1500;
        if (replenish > 1000) {
            System.out.println(replenish / 100 + replenish + check);
        }
        else {
            System.out.println(replenish + check);

        }
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

    }
}