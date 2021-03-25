package designPatterns.structural.uncommonlyUsed.n07Flyweight.case02UpGradeFlyweight;

import designPatterns.structural.uncommonlyUsed.n07Flyweight.case02.Font;

/**
 * Created by chenjinxin on 2021/3/25 下午6:03
 */

public class CharacterStyle {
    private Font font;
    private int size;
    private int colorRGB;

    public CharacterStyle(Font font, int size, int colorRGB) {
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }

    @Override
    public boolean equals(Object o) {
        CharacterStyle otherStyle = (CharacterStyle) o;
        return font.equals(otherStyle.font)
                && size == otherStyle.size
                && colorRGB == otherStyle.colorRGB;
    }
}




