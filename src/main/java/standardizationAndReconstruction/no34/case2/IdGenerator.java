package standardizationAndReconstruction.no34.case2;

import standardizationAndReconstruction.no37.IdGenerationFailureException;

/**
 * Created by chenjinxin on 2021/3/15 上午10:46
 */
public interface IdGenerator {
    String generate() throws IdGenerationFailureException;
}
