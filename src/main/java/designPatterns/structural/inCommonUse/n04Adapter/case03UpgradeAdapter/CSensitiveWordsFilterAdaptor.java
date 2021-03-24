package designPatterns.structural.inCommonUse.n04Adapter.case03UpgradeAdapter;

import designPatterns.structural.inCommonUse.n04Adapter.case03.CSensitiveWordsFilter;

/**
 * Created by chenjinxin on 2021/3/24 上午10:05
 */
public class CSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private final CSensitiveWordsFilter cFilter;

    public CSensitiveWordsFilterAdaptor(CSensitiveWordsFilter cFilter) {
        this.cFilter = cFilter;
    }

    @Override
    public String filter(String text) {
        return cFilter.filter(text, "3");
    }
}
