package standardizationAndReconstruction.no34.case2;

import org.junit.jupiter.api.Test;
import standardizationAndReconstruction.no37.IdGenerationFailureException;

import java.net.UnknownHostException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by chenjinxin on 2021/3/15 上午10:50
 */
class RandomIdGeneratorTest {

    @Test
    void generate() {
        LogTraceIdGenerator logTraceIdGenerator = new RandomIdGenerator();
        String id = null;
        try {
            id = logTraceIdGenerator.generate();
        } catch (IdGenerationFailureException | UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(id);
    }
}