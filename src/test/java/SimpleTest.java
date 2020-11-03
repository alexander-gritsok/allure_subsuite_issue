import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class SimpleTest {

    @DataProvider(name = "test1")
    static public Iterator<Object[]> createData1() {
        return List.of(
                new Object[]{ "Cedric", 36 },
                new Object[]{ "Anne", 37 }
                )
                .iterator();
    }

    @Test(dataProvider = "test1")
    private void oneTest(String n1, Integer n2) {
        System.out.println(n1 + " " + n2);
    }
}
