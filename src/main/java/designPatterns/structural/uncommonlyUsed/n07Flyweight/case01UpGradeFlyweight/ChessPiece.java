package designPatterns.structural.uncommonlyUsed.n07Flyweight.case01UpGradeFlyweight;

/**
 * Created by chenjinxin on 2021/3/25 下午5:58
 */
public class ChessPiece {
    private ChessPieceUnit chessPieceUnit;
    private int positionX;
    private int positionY;

    public ChessPiece(ChessPieceUnit unit, int positionX, int positionY) {
        this.chessPieceUnit = unit;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    // 省略getter、setter方法
}
