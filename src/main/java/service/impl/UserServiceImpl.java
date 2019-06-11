package service.impl;

import dao.OfficeDao;
import dao.UserDao;
import entity.Office;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    OfficeDao officeDao;


    @Transactional
    public boolean queryData(){
        System.out.println(userDao);
        System.out.println(officeDao);
        List<User> users = userDao.queryUser();
        System.out.println(users);
        if (0==0){
            throw new RuntimeException("我想测试一哈事务");
        }
        List<Office> offices = officeDao.queryOffice();
        System.out.println(offices);
        return false;
    }

    @Override
    public List<User> querUser() {

        return userDao.queryUser();
    }

    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }

}
