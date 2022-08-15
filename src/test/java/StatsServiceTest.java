import ru.netology.stats.Data.services.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageAmountSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageAmountSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.salesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesUnderAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 6;
        long actual = service.salesUnderAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

}
