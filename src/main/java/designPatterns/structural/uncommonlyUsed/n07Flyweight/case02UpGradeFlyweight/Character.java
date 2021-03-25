package designPatterns.structural.uncommonlyUsed.n07Flyweight.case02UpGradeFlyweight;

/**
 * Created by chenjinxin on 2021/3/25 下午6:03
 */

public class Character {
    private char c;
    private CharacterStyle style;

    public Character(char c, CharacterStyle style) {
        this.c = c;
        this.style = style;
    }
}
