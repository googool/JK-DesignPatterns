package designPatterns.Behavioral.uncommonlyUsed.n07Visitor.case01UpgradeVisitor;

/**
 * Created by chenjinxin on 2021/3/31 下午4:36
 */
public class PPTFile extends ResourceFile {
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
