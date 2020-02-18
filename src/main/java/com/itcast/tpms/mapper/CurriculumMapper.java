package com.itcast.tpms.mapper;

import com.itcast.tpms.model.Curriculum;
import com.itcast.tpms.model.CurriculumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CurriculumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    long countByExample(CurriculumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    int deleteByExample(CurriculumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    int insert(Curriculum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    int insertSelective(Curriculum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    List<Curriculum> selectByExampleWithRowbounds(CurriculumExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    List<Curriculum> selectByExample(CurriculumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    Curriculum selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    int updateByExampleSelective(@Param("record") Curriculum record, @Param("example") CurriculumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    int updateByExample(@Param("record") Curriculum record, @Param("example") CurriculumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    int updateByPrimaryKeySelective(Curriculum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    int updateByPrimaryKey(Curriculum record);
}