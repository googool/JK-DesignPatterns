package designPatterns.structural.uncommonlyUsed.n07Flyweight.case02;

/**
 * Created by chenjinxin on 2021/3/25 下午6:01
 */

public class Character {//文字
    private char c;

    private Font font;
    private int size;
    private int colorRGB;

    public Character(char c, Font font, int size, int colorRGB) {
        this.c = c;
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }
}


