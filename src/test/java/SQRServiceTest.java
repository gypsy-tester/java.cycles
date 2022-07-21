import ru.netology.sqr.SqrService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {

    @Test
    public void test() {

        SqrService service = new SqrService();
        int expected = 3;
        int actual = service.calcSqr(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNull() {

        SqrService service = new SqrService();
        int expected = 0;
        int actual = service.calcSqr(0, 99);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHundred() {

        SqrService service = new SqrService();
        int expected = 1;
        int actual = service.calcSqr(100, 110);
        Assertions.assertEquals(expected, actual);
    }

}
