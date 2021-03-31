package designPatterns.Behavioral.uncommonlyUsed.n07Visitor.case01Upgrade2;

/**
 * Created by chenjinxin on 2021/3/31 下午4:35
 */
public class Extractor {
    public void extract2txt(PPTFile pptFile) {
        //...
        System.out.println("Extract PPT.");
    }

    public void extract2txt(PdfFile pdfFile) {
        //...
        System.out.println("Extract PDF.");
    }

    public void extract2txt(WordFile wordFile) {
        //...
        System.out.println("Extract WORD.");
    }
}
