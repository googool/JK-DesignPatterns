package designPatterns.Behavioral.uncommonlyUsed.n07Visitor.case01Upgrade2;

/**
 * Created by chenjinxin on 2021/3/31 下午4:35
 */

public abstract class ResourceFile {
    protected String filePath;
    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }
    abstract public void accept(Extractor extractor);
    abstract public void accept(Compressor compressor);
}
