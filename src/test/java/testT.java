import dao.UserDao;
import entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.impl.UserServiceImpl;

import java.util.List;

public class testT {
    @Test
    public  void test() {
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.queryData();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        List<User> users = userDao.queryUser();
        System.out.println(users);

    }
}
