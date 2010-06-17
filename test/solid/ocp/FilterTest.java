package solid.ocp;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 17, 2010
 * Time: 11:05:26 AM
 * To change this template use File | Settings | File Templates.
 */

public class FilterTest {

	@Test
	public void itSelectsPrimeNumbers() {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

		List<Integer> primeNumbers = Filter.selectPrime(numbers);

		assertThat(primeNumbers, hasItems(2, 3));
		assertThat(primeNumbers, not(hasItems(1, 4)));
	}

    @Test
	public void itDoesNotSelectNegativePrimeNumbers() {
		List<Integer> numbers = Arrays.asList(-1, 2, -3, 4);

		List<Integer> primeNumbers = Filter.selectPrime(numbers);

		assertThat(primeNumbers, hasItem(2));
		assertThat(primeNumbers, not(hasItems(-1, -3, 4)));
	}

    @Test
    public void itSelectsOddNumbers() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        List<Integer> oddNumbers = Filter.selectOdd(numbers);

        assertThat(oddNumbers, hasItems(1,3,5));
        assertThat(oddNumbers, not(hasItems(2,4)));
    }

    @Test
    public void itSelectsMultiplesOf3() {
        List<Integer> multiplesOf3 = Filter.selectMultipleOf3(Arrays.asList(6,7,8,9,0,11,12));
        
        assertThat(multiplesOf3, hasItems(6,9,12));
        assertThat(multiplesOf3, not(hasItems(7,8,10,11)));
    }

    @Test
    public void itRunsRequestedFiltersOnTheGivenList() {
        List<Integer> oddMultiplesOf3 = Filter.apply(Arrays.asList(9,10,11,12,13,14,15), "odd", "multiplesOf3");

        assertThat(oddMultiplesOf3, hasItems(9, 15));
        assertThat(oddMultiplesOf3, not(hasItems(10, 11, 12, 13, 14)));
    }
}
