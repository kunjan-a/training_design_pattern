package designpattern.strategy;

public abstract class ValidationUtil {
    public ValidationUtil() {
    }

    public static void validateLength(String val, int allowedLength) {
        if (val.length() > allowedLength)
            throw new RuntimeException("Invalid length:" + allowedLength);
    }

    public static void notEmpty(String val) {
        if (val == null || val.length() == 0)
            throw new RuntimeException("not empty check failed for value:" + val);
    }

    public static void atLeast(int val, int min) {
        if (val < min)
            throw new RuntimeException("at least check failed:" + val);
    }

    public static void atMost(int val, int max) {
        if (val > max)
            throw new RuntimeException("at least check failed:" + val);
    }
}