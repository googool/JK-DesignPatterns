package designPatterns.structural.uncommonlyUsed.n07Flyweight.case01;

/**
 * Created by chenjinxin on 2021/3/25 下午5:56
 */

public class ChessPiece {//棋子
    private int id;
    private String text;
    private Color color;
    private int positionX;
    private int positionY;

    public ChessPiece(int id, String text, Color color, int positionX, int positionY) {
        this.id = id;
        this.text = text;
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionX;
    }

    public static enum Color {
        RED, BLACK
    }

    // ...省略其他属性和getter/setter方法...
}


