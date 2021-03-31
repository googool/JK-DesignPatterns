package designPatterns.Behavioral.uncommonlyUsed.n07Visitor.case01;

/**
 * Created by chenjinxin on 2021/3/31 下午4:26
 */
public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        //...
        System.out.println("Extract PDF.");
    }
}
