import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class SimpleTest {

    private String n1;
    private Integer n2;

    @Factory(dataProvider = "test1")
    public SimpleTest(String n1, Integer n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @DataProvider(name = "test1")
    static public Iterator<Object[]> createData1() {
        return List.of(
                new Object[]{ "Cedric", 36 },
                new Object[]{ "Anne", 37 }
                )
                .iterator();
    }

    @Test
    private void oneTest() {
        System.out.println(n1 + " " + n2);
    }
}
