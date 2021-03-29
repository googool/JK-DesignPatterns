package designPatterns.Behavioral.inCommonUse.n02Template.case03;

/**
 * Created by chenjinxin on 2021/3/29 下午1:50
 */
public class User {
    private Long id;
    private String name;
    private String telephone;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
