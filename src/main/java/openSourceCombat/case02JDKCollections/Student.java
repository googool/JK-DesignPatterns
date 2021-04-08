package openSourceCombat.case02JDKCollections;

/**
 * Created by chenjinxin on 2021/4/8 下午1:53
 */
public class Student {
    private String name;
    private Integer age;
    private Float score;

    public Student() {
    }

    public Student(String name, Integer age, Float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Float getScore() {
        return score;
    }
}
