package designPatterns.structural.uncommonlyUsed.n07Flyweight.case02UpGradeFlyweight;

import designPatterns.structural.uncommonlyUsed.n07Flyweight.case02.Font;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/25 下午6:03
 */
public class CharacterStyleFactory {
    private static final List<CharacterStyle> styles = new ArrayList<>();

    public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
        CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
        for (CharacterStyle style : styles) {
            if (style.equals(newStyle)) {
                return style;
            }
        }
        styles.add(newStyle);
        return newStyle;
    }
}
