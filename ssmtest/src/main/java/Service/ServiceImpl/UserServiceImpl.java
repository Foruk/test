package Service.ServiceImpl;

import Entity.User;
import Mapper.UserMapper;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/4/24.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public List<User> getUserByPage(User user, int currenPage, int pageSize) {
       int startrow=(currenPage-1)*pageSize;
       return userMapper.getUserByPage(user,startrow,pageSize);
    }


}
