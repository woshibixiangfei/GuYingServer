package cn.teacherbe.controller;

import cn.teacherbe.entity.TPicture;
import cn.teacherbe.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@RestController("PictureController")
@RequestMapping("/picture")
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping(value = "/getPicture")
    public HashMap getPicture(Integer picturePosition) {
        System.out.println("------------");
        HashMap pictureMap = pictureService.selectPictureByPosition(picturePosition );
        System.out.println(pictureMap);
        return pictureMap;
    }
}
