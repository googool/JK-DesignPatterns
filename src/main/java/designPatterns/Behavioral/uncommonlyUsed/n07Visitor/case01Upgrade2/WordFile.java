package designPatterns.Behavioral.uncommonlyUsed.n07Visitor.case01Upgrade2;

/**
 * Created by chenjinxin on 2021/3/31 下午4:36
 */
public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        extractor.extract2txt(this);
    }

    @Override
    public void accept(Compressor compressor) {
        compressor.compress(this);
    }
}
