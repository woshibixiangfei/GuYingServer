package cn.teacherbe.controller;

import cn.teacherbe.service.PictureService;
import cn.teacherbe.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController("TextController")
@RequestMapping("/text")
public class TextController {
    @Autowired
    private TextService textService;

    @RequestMapping(value = "/getText")
    public HashMap getPicture(Integer textPosition) {
        System.out.println("------------");
        HashMap textMap = textService.selectTextByPosition(textPosition );
        System.out.println(textMap);
        return textMap;
    }

}
