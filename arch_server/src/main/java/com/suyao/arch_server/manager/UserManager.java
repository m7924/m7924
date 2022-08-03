package com.suyao.arch_server.manager;

import com.suyao.arch_common.entity.User;
import java.util.List;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2022/7/28 17:59
 * @Created by B105
 */
public interface UserManager {
    User getUserById(Long id);

    int insert(User user);

    int update(User user);

    int delete(String id);

    List<User> getAllUsers();
}
