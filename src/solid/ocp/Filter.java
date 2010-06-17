package solid.ocp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 17, 2010
 * Time: 11:04:44 AM
 * To change this template use File | Settings | File Templates.
 */

public class Filter {

    public static List<Integer> selectPrime(List<Integer> numbers) {
        List<Integer> primeNumbers = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
        return primeNumbers;
    }

    public static List<Integer> selectOdd(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<Integer>();

        for(Integer number : numbers) {
            if(number % 2 == 1) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public static List<Integer> selectMultipleOf3(List<Integer> numbers) {
        List<Integer> multiplesOf3 = new ArrayList<Integer>();

        for(Integer number : numbers) {
            if(number % 3 == 0) {
                multiplesOf3.add(number);
            }
        }

        return multiplesOf3;
    }
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
