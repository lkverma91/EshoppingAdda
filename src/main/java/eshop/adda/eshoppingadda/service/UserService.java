package eshop.adda.eshoppingadda.service;

import eshop.adda.eshoppingadda.model.User;
import java.util.List;

public interface UserService {
    User findByEmail(String email);
    User saveUser(User user);
    List<User> getAllUsers();
}