package com.itcast.tpms.model;

import java.util.Date;

public class CurriculumMidCourse {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_mid_course.id
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_mid_course.course_id
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    private Long courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_mid_course.curriculum_id
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    private Long curriculumId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_mid_course.gmt_created
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_mid_course.gmt_modified
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_mid_course.id
     *
     * @return the value of curriculum_mid_course.id
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_mid_course.id
     *
     * @param id the value for curriculum_mid_course.id
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_mid_course.course_id
     *
     * @return the value of curriculum_mid_course.course_id
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_mid_course.course_id
     *
     * @param courseId the value for curriculum_mid_course.course_id
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_mid_course.curriculum_id
     *
     * @return the value of curriculum_mid_course.curriculum_id
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    public Long getCurriculumId() {
        return curriculumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_mid_course.curriculum_id
     *
     * @param curriculumId the value for curriculum_mid_course.curriculum_id
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    public void setCurriculumId(Long curriculumId) {
        this.curriculumId = curriculumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_mid_course.gmt_created
     *
     * @return the value of curriculum_mid_course.gmt_created
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_mid_course.gmt_created
     *
     * @param gmtCreated the value for curriculum_mid_course.gmt_created
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_mid_course.gmt_modified
     *
     * @return the value of curriculum_mid_course.gmt_modified
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_mid_course.gmt_modified
     *
     * @param gmtModified the value for curriculum_mid_course.gmt_modified
     *
     * @mbg.generated Tue Feb 18 20:14:35 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}