package standardizationAndReconstruction.no29;

/**
 * Created by chenjinxin on 2021/3/12 下午3:25
 */
public class InvalidTransactionException extends Exception {

    public InvalidTransactionException(String message) {
        super(message);
        System.out.println(message);
    }

}
