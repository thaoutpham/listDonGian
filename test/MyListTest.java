import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;
class MyListTest {
@Test public void testMyLest(){
    MyList<Integer> list = new MyList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(3);
    list.add(4);
    assertTrue(4 == list.get(4));
    assertTrue(2 == list.get(1));
    assertTrue(3 == list.get(2));

    list.get(6);
}
}
