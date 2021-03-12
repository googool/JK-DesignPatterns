package standardizationAndReconstruction.no28;

/**
 * Created by chenjinxin on 2021/3/12 上午9:51
 */

public class Text {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    /**
     * 将字符串转化成数字，忽略字符串中的首尾空格；
     * 如果字符串中包含除首尾空格之外的非数字字符，则返回null。
     */
    public Integer toNumber() {
        if (content == null || content.isEmpty()) {
            return null;
        }
        int result = 0;
        int left = 0;
        int right = content.length() - 1;
        while (left <= right) {
            char c = content.charAt(left);
            if (c == ' ') {
                left++;
            } else {
                break;
            }
        }
        while (left <= right) {
            char c = content.charAt(right);
            if (c == ' ') {
                right--;
            } else {
                break;
            }
        }
        for (int i = left; i <= right; ++i) {
            char c = content.charAt(i);
            if (c <= '9' && c >= '0') {
                result = result * 10 + c - '0';
            } else {
                return null;
            }
        }
        return result;
    }
}
