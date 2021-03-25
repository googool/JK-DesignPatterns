package designPatterns.structural.uncommonlyUsed.n06Composite.case01Upgrade;

/**
 * Created by chenjinxin on 2021/3/25 下午4:52
 */

public abstract class FileSystemNode {
    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();

    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }
}
