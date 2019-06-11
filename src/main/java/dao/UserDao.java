package dao;

import entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    List<User> queryUser();
    boolean addUser(User user);
}
