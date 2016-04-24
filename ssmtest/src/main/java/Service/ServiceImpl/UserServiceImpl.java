package Service.ServiceImpl;

import Entity.User;
import Mapper.UserMapper;
import Service.UserService;

/**
 * Created by Administrator on 2016/4/24.
 */
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
