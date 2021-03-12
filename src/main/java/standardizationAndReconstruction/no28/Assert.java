package standardizationAndReconstruction.no28;

/**
 * Created by chenjinxin on 2021/3/12 上午10:01
 */
public class Assert {
    public static void assertEquals(Integer expectedValue, Integer actualValue) {
        if (!actualValue.equals(expectedValue)) {
            String message = String.format("Test failed, expected: %d, actual: %d.", expectedValue, actualValue);
            System.out.println(message);
        } else {
            System.out.println("Test succeeded.");
        }
    }

    public static boolean assertNull(Integer actualValue) {
        boolean isNull = actualValue == null;
        if (isNull) {
            System.out.println("Test succeeded.");
        } else {
            System.out.println("Test failed, the value is not null:" + actualValue);
        }
        return isNull;
    }
}