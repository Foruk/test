package Mapper;

import Entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/4/24.
 */
@Repository
public interface UserMapper {
    User getUserById(int id);
    List<User> getAllUser();
}
