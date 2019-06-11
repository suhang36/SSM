package service;

import entity.User;

import java.util.List;

public interface UserService {
    public List<User> querUser();
    boolean addUser(User user);
}
