package Controller;

import Entity.User;
import Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by Administrator on 2016/4/24.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/binding1")
        public ModelAndView binding1(Integer UserId)//使用Integer包装类型的int可以使参数绑定不会有异常,int对表单参数传过来更严格
    {
       ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("user");
        modelAndView.addObject("userid",UserId);
        return modelAndView;
    }
    @RequestMapping("/binding2")
    public ModelAndView binding2(User user) throws UnsupportedEncodingException {
        user.setUserName(new String(user.getUserName().getBytes("ISO-8859-1"),"utf-8"));
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("user");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
    @RequestMapping("/showUser")
    public ModelAndView showUser()
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("userlist");
//        User user=userService.getUserById(id);
        List<User> list=userService.getAllUser();
        modelAndView.addObject("userlist",list);
        return modelAndView;
    }

    @RequestMapping("/showUserByPage")
    public ModelAndView showUserByPage(Integer currentPage)
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("userlist");
//        User user=userService.getUserById(id);
        User user=new User();
        user.setUserName("2");
        List<User> list=userService.getUserByPage(user,1,5);
        modelAndView.addObject("userlist",list);
        return modelAndView;
    }
}
