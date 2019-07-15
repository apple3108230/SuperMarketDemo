package dao;

import org.springframework.stereotype.Repository;
import pojo.User;

@Repository
public interface UserDao {

    User getUserByUsername(String username);

}
