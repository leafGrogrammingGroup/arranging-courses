package com.hut.kwk.model.mapper;

import com.hut.kwk.model.entity.Teacher;
import com.hut.kwk.model.entity.TeacherQuery;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
@Mapper
public interface TeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    long countByExample(TeacherQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    int deleteByExample(TeacherQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    @Delete({
        "delete from teacher",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    @Insert({
        "insert into teacher (teacher_name, teacher_phone, ",
        "count_limit, statu, ",
        "mark)",
        "values (#{teacherName,jdbcType=VARCHAR}, #{teacherPhone,jdbcType=VARCHAR}, ",
        "#{countLimit,jdbcType=INTEGER}, #{statu,jdbcType=INTEGER}, ",
        "#{mark,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    int insertSelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    List<Teacher> selectByExampleWithRowbounds(TeacherQuery example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Teacher selectOneByExample(TeacherQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    List<Teacher> selectByExample(TeacherQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, teacher_name, teacher_phone, count_limit, statu, mark",
        "from teacher",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.hut.kwk.model.mapper.TeacherMapper.BaseResultMap")
    Teacher selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    @Update({
        "update teacher",
        "set teacher_name = #{teacherName,jdbcType=VARCHAR},",
          "teacher_phone = #{teacherPhone,jdbcType=VARCHAR},",
          "count_limit = #{countLimit,jdbcType=INTEGER},",
          "statu = #{statu,jdbcType=INTEGER},",
          "mark = #{mark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    int insertOrUpdate(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    int insertOrUpdateSelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<Teacher> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<Teacher> list, @Param("selective") Teacher.Column ... selective);
}