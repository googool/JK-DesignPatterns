package standardizationAndReconstruction.no34.case3;

import org.junit.jupiter.api.Test;
import standardizationAndReconstruction.no34.case2.LogTraceIdGenerator;

/**
 * Created by chenjinxin on 2021/3/15 下午1:46
 */
class RandomIdGeneratorTest {

    @Test
    void generate() {
        LogTraceIdGenerator logTraceIdGenerator = new standardizationAndReconstruction.no34.case3.RandomIdGenerator();
        String id = logTraceIdGenerator.generate();
        System.out.println(id);
    }
}