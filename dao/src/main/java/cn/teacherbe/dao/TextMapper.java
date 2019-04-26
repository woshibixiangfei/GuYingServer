package cn.teacherbe.dao;

import cn.teacherbe.entity.TText;
import cn.teacherbe.entity.TTextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TextMapper {

    TText selectByPosition(Integer textPosition);

    long countByExample(TTextExample example);

    int deleteByExample(TTextExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TText record);

    int insertSelective(TText record);

    List<TText> selectByExampleWithBLOBs(TTextExample example);

    List<TText> selectByExample(TTextExample example);

    TText selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TText record, @Param("example") TTextExample example);

    int updateByExampleWithBLOBs(@Param("record") TText record, @Param("example") TTextExample example);

    int updateByExample(@Param("record") TText record, @Param("example") TTextExample example);

    int updateByPrimaryKeySelective(TText record);

    int updateByPrimaryKeyWithBLOBs(TText record);

    int updateByPrimaryKey(TText record);
}