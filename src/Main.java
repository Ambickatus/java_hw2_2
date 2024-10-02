public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int startMoney = 100;
        int addSum = 1657;
        int bonusMoney;
        int totalMoney;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (addSum > 1000) {
            bonusMoney = addSum / 100;
            totalMoney = startMoney + bonusMoney + addSum;
        } else {
            totalMoney = addSum + startMoney;
            bonusMoney = 0;
        }
        System.out.println(totalMoney);
        System.out.println(bonusMoney);
    }
}