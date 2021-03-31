package designPatterns.Behavioral.uncommonlyUsed.n07Visitor.case01UpgradeVisitor;

/**
 * Created by chenjinxin on 2021/3/31 下午4:35
 */
public class Extractor implements Visitor {
    @Override
    public void visit(PdfFile pdfFile) {
        //...
        System.out.println("Extract PDF.");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("Extract PPT.");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("Extract WORD.");
    }
}
