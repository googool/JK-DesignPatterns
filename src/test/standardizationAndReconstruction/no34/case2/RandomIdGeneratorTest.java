package standardizationAndReconstruction.no34.case2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by chenjinxin on 2021/3/15 上午10:50
 */
class RandomIdGeneratorTest {

    @Test
    void generate() {
        LogTraceIdGenerator logTraceIdGenerator = new RandomIdGenerator();
        String id = logTraceIdGenerator.generate();
        System.out.println(id);
    }
}