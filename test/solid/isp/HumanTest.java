package solid.isp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 18, 2010
 * Time: 1:00:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class HumanTest {
    @Test
    public void shouldWork() {
        Worker worker = new Human();
        assertEquals("human works", worker.work()) ;
    }

    @Test
    public void shouldEat() {
        Worker worker = new Human();
        assertEquals("human eats", worker.eat()) ;
    }
}
