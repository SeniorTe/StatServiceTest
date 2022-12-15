import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        long[] statisticSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        System.out.println(service.sumSales(statisticSales));
        System.out.println(service.mediumSumSales(statisticSales));
        System.out.println(service.maxMontSales(statisticSales));
        System.out.println(service.minMonthSales(statisticSales));
        System.out.println(service.amountMonthsUnderMean(statisticSales));
        System.out.println(service.amountMonthOverMean(statisticSales));
    }
}