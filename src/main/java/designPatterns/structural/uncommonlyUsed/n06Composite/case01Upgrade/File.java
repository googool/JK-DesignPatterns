package designPatterns.structural.uncommonlyUsed.n06Composite.case01Upgrade;

/**
 * Created by chenjinxin on 2021/3/25 下午4:53
 */
public class File extends FileSystemNode {
    public File(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        return 1;
    }

    @Override
    public long countSizeOfFiles() {
        java.io.File file = new java.io.File(path);
        if (!file.exists()) return 0;
        return file.length();
    }
}
