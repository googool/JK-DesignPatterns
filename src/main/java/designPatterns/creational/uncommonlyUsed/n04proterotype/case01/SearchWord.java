package designPatterns.creational.uncommonlyUsed.n04proterotype.case01;

/**
 * Created by chenjinxin on 2021/3/19 下午5:28
 */
public class SearchWord {
    public SearchWord(String keyword, SearchWord count, long lastUpdateTime) {

    }

    public long getLastUpdateTime() {
        return System.currentTimeMillis();
    }

    public String getKeyword() {
        return null;
    }

    public SearchWord getCount() {
        return null;
    }

    public void setCount(SearchWord count) {
        
    }


    public void setLastUpdateTime(long lastUpdateTime) {
    }
}
