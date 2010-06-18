package solid.isp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 18, 2010
 * Time: 1:29:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class RobotTest {

    @Test
    public void shouldWork() {
        Worker robotWorker = new Robot();
        assertEquals("Robot works", robotWorker.work());
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotEat() {
        Worker robotWorker = new Robot();
        robotWorker.eat();
    }
}
