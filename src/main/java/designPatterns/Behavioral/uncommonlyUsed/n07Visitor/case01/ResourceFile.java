package designPatterns.Behavioral.uncommonlyUsed.n07Visitor.case01;

/**
 * Created by chenjinxin on 2021/3/31 下午4:26
 */

public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    public abstract void extract2txt();
}








