package designPatterns.structural.uncommonlyUsed.n06Composite.case02;

import java.util.Arrays;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/25 下午4:58
 */
public class DepartmentRepo {
    public List<Long> getSubDepartmentIds(long id) {
        return Arrays.asList(1L, 2L);
    }
}
