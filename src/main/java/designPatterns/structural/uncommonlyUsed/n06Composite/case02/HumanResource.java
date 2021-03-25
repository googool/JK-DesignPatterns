package designPatterns.structural.uncommonlyUsed.n06Composite.case02;

/**
 * Created by chenjinxin on 2021/3/25 下午4:57
 */

public abstract class HumanResource {
    protected long id;
    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract double calculateSalary();
}






