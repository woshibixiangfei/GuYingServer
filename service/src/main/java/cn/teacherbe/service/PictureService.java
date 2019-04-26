package cn.teacherbe.service;

import cn.teacherbe.entity.TPicture;

import java.util.HashMap;

public interface PictureService {

    HashMap selectPictureByPosition(Integer picturePosition);

}
