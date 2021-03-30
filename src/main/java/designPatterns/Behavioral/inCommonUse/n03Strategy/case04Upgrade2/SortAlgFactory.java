package designPatterns.Behavioral.inCommonUse.n03Strategy.case04Upgrade2;

import designPatterns.Behavioral.inCommonUse.n03Strategy.case04Upgrade.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenjinxin on 2021/3/30 上午10:02
 */

public class SortAlgFactory {
    private static final Map<String, ISortAlg> algs = new HashMap<>();

    static {
        algs.put("QuickSort", new QuickSort());
        algs.put("ExternalSort", new ExternalSort());
        algs.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        algs.put("MapReduceSort", new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return algs.get(type);
    }
}


