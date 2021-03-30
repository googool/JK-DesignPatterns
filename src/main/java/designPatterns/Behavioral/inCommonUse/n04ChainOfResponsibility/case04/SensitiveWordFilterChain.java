package designPatterns.Behavioral.inCommonUse.n04ChainOfResponsibility.case04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/30 下午2:09
 */
public class SensitiveWordFilterChain {
    private List<SensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SensitiveWordFilter filter) {
        this.filters.add(filter);
    }

    // return true if content doesn't contain sensitive words.
    public boolean filter(Content content) {
        for (SensitiveWordFilter filter : filters) {
            if (!filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}
