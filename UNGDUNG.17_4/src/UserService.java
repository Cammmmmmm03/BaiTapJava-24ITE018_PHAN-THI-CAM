package service;

import model.User;
import util.SecurityUtils;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> userList = new ArrayList<>();

    public boolean register(String username, String email, String plainPassword) {
        for (User u : userList) {
            if (u.getUsername().equals(username)) return false; // Đã tồn tại
        }

        String hashed = SecurityUtils.hashPassword(plainPassword);
        userList.add(new User(username, email, hashed));
        return true;
    }

    public boolean login(String username, String plainPassword) {
        for (User u : userList) {
            if (u.getUsername().equals(username)) {
                return SecurityUtils.checkPassword(plainPassword, u.getHashedPassword());
            }
        }
        return false;
    }

    public List<User> getAllUsers() {
        return userList;
    }
}
