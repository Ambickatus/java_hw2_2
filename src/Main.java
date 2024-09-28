public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int start_money = 100;
        int add_sum = 1657;
        int bonus_money;
        int total_money;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (add_sum > 1000) {
            bonus_money = add_sum / 100;
            total_money = start_money + bonus_money + add_sum;
        } else {
            total_money = add_sum + start_money;
            bonus_money = 0;
        }
        System.out.println(total_money);
        System.out.println(bonus_money);
    }
}