package cn.teacherbe.service.impl;

import cn.teacherbe.dao.TextMapper;
import cn.teacherbe.entity.TText;
import cn.teacherbe.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service("TextService")
public class TextServiceImpl implements TextService {

    @Autowired
    private TextMapper textMapper;

    @Override
    public HashMap selectTextByPosition(Integer textPosition) {
        TText tText = this.textMapper.selectByPosition(textPosition);
        HashMap textMap = new HashMap( );
        if(tText != null){
            if(tText.getTextInfomation() != null || !tText.getTextInfomation().equals("")){
                textMap.put("status","success");
                textMap.put("textInfomation", tText.getTextInfomation());
                return textMap;
            }
            textMap.put("status","failed");
        } else {
            textMap.put("status","failed");
        }
        return textMap;
    }
}
