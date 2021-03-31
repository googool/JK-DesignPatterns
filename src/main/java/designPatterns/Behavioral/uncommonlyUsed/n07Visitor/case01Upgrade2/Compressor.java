package designPatterns.Behavioral.uncommonlyUsed.n07Visitor.case01Upgrade2;

/**
 * Created by chenjinxin on 2021/3/31 下午4:35
 */
public class Compressor {
    public void compress(PPTFile pptFile) {
        //...
        System.out.println("Compressor PPT.");
    }

    public void compress(PdfFile pdfFile) {
        //...
        System.out.println("Compressor PDF.");
    }

    public void compress(WordFile wordFile) {
        //...
        System.out.println("Compressor WORD.");
    }
}
