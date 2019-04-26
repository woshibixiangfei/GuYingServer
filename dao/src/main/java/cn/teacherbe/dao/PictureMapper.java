package cn.teacherbe.dao;

import cn.teacherbe.entity.TPicture;
import cn.teacherbe.entity.TPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureMapper {
    long countByExample(TPictureExample example);

    int deleteByExample(TPictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPicture record);

    int insertSelective(TPicture record);

    List<TPicture> selectByExampleWithBLOBs(TPictureExample example);

    List<TPicture> selectByExample(TPictureExample example);

    TPicture selectByPrimaryKey(Integer id);

    TPicture selectByPosition(Integer picturePosition);

    int updateByExampleSelective(@Param("record") TPicture record, @Param("example") TPictureExample example);

    int updateByExampleWithBLOBs(@Param("record") TPicture record, @Param("example") TPictureExample example);

    int updateByExample(@Param("record") TPicture record, @Param("example") TPictureExample example);

    int updateByPrimaryKeySelective(TPicture record);

    int updateByPrimaryKeyWithBLOBs(TPicture record);

    int updateByPrimaryKey(TPicture record);
}