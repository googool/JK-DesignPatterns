package designPatterns.Behavioral.uncommonlyUsed.n07Visitor.case01Upgrade;

/**
 * Created by chenjinxin on 2021/3/31 下午4:36
 */
public class PPTFile extends ResourceFile {
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        extractor.extract2txt(this);
    }
}
