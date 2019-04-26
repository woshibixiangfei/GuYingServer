package cn.teacherbe.service.impl;

import cn.teacherbe.dao.PictureMapper;
import cn.teacherbe.entity.TPicture;
import cn.teacherbe.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service("PictureService")
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureMapper pictureMapper;

    @Override
    public HashMap selectPictureByPosition(Integer picturePosition) {
        TPicture tPicture = this.pictureMapper.selectByPosition(picturePosition);
        HashMap pictureMap = new HashMap( );
        if(tPicture != null){
            if(tPicture.getPictureAddress() != null || !tPicture.getPictureAddress().equals("")){
                pictureMap.put("status","success");
                pictureMap.put("pictureAddress", tPicture.getPictureAddress());
                return pictureMap;
            }
            pictureMap.put("status","failed");
        } else {
            pictureMap.put("status","failed");
        }
        return pictureMap;
    }
}
