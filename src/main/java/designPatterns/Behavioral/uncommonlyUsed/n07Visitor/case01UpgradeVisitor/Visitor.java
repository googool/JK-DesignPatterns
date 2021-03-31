package designPatterns.Behavioral.uncommonlyUsed.n07Visitor.case01UpgradeVisitor;

/**
 * Created by chenjinxin on 2021/3/31 下午4:46
 */
public interface Visitor {
    void visit(PdfFile pdfFile);

    void visit(PPTFile pdfFile);

    void visit(WordFile pdfFile);
}
