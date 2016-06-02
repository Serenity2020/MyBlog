package cn.edu.zucc.service.Category;

import cn.edu.zucc.model.TbCategoryEntity;

import java.util.List;

/**
 * Created by shentao on 2016/5/31.
 */
public interface CategoryService {

    //得到所有类别
    public List<TbCategoryEntity> getAllCategories() throws Exception;


    //添加类别
    public  boolean  addCategory(TbCategoryEntity tbCategoryEntity)  throws Exception;

    //删除类别
    public boolean deleteCategory(TbCategoryEntity tbCategoryEntity)  throws Exception;

    //查询指定类别
    public TbCategoryEntity queryCategory(Integer id) throws Exception;

    public List<TbCategoryEntity> findByqQuery(String hql) throws Exception;

    //更新类别
    public boolean updateCategory(TbCategoryEntity tbCategoryEntity)  throws Exception;





}
