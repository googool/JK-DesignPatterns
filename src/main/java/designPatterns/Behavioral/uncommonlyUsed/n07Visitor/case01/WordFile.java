package designPatterns.Behavioral.uncommonlyUsed.n07Visitor.case01;

/**
 * Created by chenjinxin on 2021/3/31 下午4:26
 */
public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        //...
        System.out.println("Extract WORD.");
    }
}
