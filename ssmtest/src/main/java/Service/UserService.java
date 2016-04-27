package Service;

import Entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/4/24.
 */
public interface UserService {
    User getUserById(int id);
    List<User> getAllUser();
    List<User> getUserByPage(User user,int currenPage,int pageSize);
}
