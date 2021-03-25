package designPatterns.structural.uncommonlyUsed.n06Composite.case02;

/**
 * Created by chenjinxin on 2021/3/25 下午4:57
 */
public class Employee extends HumanResource {
    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
