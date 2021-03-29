package designPatterns.Behavioral.inCommonUse.n02Template.case03;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by chenjinxin on 2021/3/29 下午1:52
 */

public class JdbcTemplateDemo {
    private JdbcTemplate jdbcTemplate;

    /*public User queryUser(long id) {
        String sql = "select * from user where id="+id;
        return jdbcTemplate.query(sql, new UserRowMapper()).get(0);
    }

    class UserRowMapper implements RowMapper<User> {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setName(rs.getString("name"));
            user.setTelephone(rs.getString("telephone"));
            return user;
        }
    }*/
}
