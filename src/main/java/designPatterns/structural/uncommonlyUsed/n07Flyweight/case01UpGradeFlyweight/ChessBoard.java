package designPatterns.structural.uncommonlyUsed.n07Flyweight.case01UpGradeFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenjinxin on 2021/3/25 下午5:58
 */
public class ChessBoard {
    private Map<Integer, ChessPiece> chessPieces = new HashMap<>();

    public ChessBoard() {
        init();
    }

    private void init() {
        chessPieces.put(1, new ChessPiece(
                ChessPieceUnitFactory.getChessPiece(1), 0,0));
        chessPieces.put(1, new ChessPiece(
                ChessPieceUnitFactory.getChessPiece(2), 1,0));
        //...省略摆放其他棋子的代码...
    }

    public void move(int chessPieceId, int toPositionX, int toPositionY) {
        //...省略...
    }
}
