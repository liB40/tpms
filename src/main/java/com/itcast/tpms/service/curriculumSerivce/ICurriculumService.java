package com.itcast.tpms.service.curriculumSerivce;

import com.itcast.tpms.dto.PageDto;
import com.itcast.tpms.dto.SearchDto;
import com.itcast.tpms.exp.CourseExpList;
import com.itcast.tpms.exp.CurriculumExp;
import com.itcast.tpms.exp.OneLevelList;
import com.itcast.tpms.model.Course;
import com.itcast.tpms.model.Curriculum;
import com.itcast.tpms.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 培养方案service
 */
public interface ICurriculumService {

    PageDto<CurriculumExp> getCurriculumBySearchDto(SearchDto searchDto);

    CurriculumExp getCurriculumById(Long curriculumId);

    boolean addCurriculum(Curriculum curriculum);

    boolean updateCurriculum(Curriculum curriculum);

    boolean deleteCurriculum(Long curriculumId, Integer type);

    boolean addOrUpdateCurriculum(Curriculum curriculum, Integer type);

    /**
     * 删除专业相关的课程方案
     *
     * @param majorId
     */
    void deleteCurrByMajorId(Long majorId);


    /**
     * 获取最后一个curr的Id
     *
     * @return
     */
    Long getLastCurrId();

    OneLevelList seeMore(CurriculumExp currExp);

}
