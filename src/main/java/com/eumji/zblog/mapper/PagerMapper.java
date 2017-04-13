package com.eumji.zblog.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author Do
 * @package com.eumji.zblog.mapper
 * @name PagerMapper
 * @date 2017/4/13
 * @time 9:07
 */
@Mapper
public interface PagerMapper {
    /**
     * 找到目标分类下的分页条件
     * @param categoryId
     * @return
     */
    int loadCategoryPager(Integer categoryId);
}
