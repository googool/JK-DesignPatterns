package designPatterns.Behavioral.uncommonlyUsed.n08Memento.case01;

/**
 * Created by chenjinxin on 2021/3/31 下午5:51
 */

public class InputText {
    private StringBuilder text = new StringBuilder();

    public String getText() {
        return text.toString();
    }

    public void append(String input) {
        text.append(input);
    }

    public void setText(String text) {
        this.text.replace(0, this.text.length(), text);
    }
}




