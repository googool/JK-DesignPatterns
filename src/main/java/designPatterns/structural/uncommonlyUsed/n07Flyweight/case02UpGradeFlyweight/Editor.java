package designPatterns.structural.uncommonlyUsed.n07Flyweight.case02UpGradeFlyweight;

import designPatterns.structural.uncommonlyUsed.n07Flyweight.case02.Font;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/25 下午6:03
 */
public class Editor {
    private List<Character> chars = new ArrayList<>();

    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        Character character = new Character(c, CharacterStyleFactory.getStyle(font, size, colorRGB));
        chars.add(character);
    }
}
