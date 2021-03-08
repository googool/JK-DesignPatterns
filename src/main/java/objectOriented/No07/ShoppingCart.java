package objectOriented.No07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/5 下午3:25
 */
class ShoppingCartItem {
    public double getPrice() {
        return 0;
    }
}

public class ShoppingCart {
    private int itemsCount;
    private double totalPrice;
    private List<ShoppingCartItem> items = new ArrayList<>();

    public int getItemsCount() {
        return this.itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * 通过 Java 提供的 Collections.unmodifiableList() 方法，让 getter 方法返回一个不可被修改的 UnmodifiableList 集合容器，
     * 而这个容器类重写了 List 容器中跟修改数据相关的方法，比如 add()、clear() 等方法。
     * 一旦我们调用这些修改数据的方法，代码就会抛出 UnsupportedOperationException 异常，这样就避免了容器中的数据被修改。
     * @return
     */
    public List<ShoppingCartItem> getItems() {
        return Collections.unmodifiableList(this.items);
    }

    public void addItem(ShoppingCartItem item) {
        items.add(item);
        itemsCount++;
        totalPrice += item.getPrice();
    }

    public void clear() {
        items.clear();
        itemsCount = 0;
        totalPrice = 0.0;
    }
    // ...省略其他方法...
}
