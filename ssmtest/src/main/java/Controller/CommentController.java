package Controller;

import Entity.Comment;
import Service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/4/27.
 */
@Controller
@RequestMapping("/coment")
public class CommentController {
    @Resource
    private CommentService commentService;
    @RequestMapping("/getComment")
    public ModelAndView getComment(Integer id)
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("commentlist");
        Comment comment=commentService.getCommentById(id);
        modelAndView.addObject("comment",comment);
        return modelAndView;
    }
}
