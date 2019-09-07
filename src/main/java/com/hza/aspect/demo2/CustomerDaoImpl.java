package com.hza.aspect.demo2;

/**
 * Create by hza
 * 2019-09-07 15:00
 */
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save() {
        System.out.println("保存客户");
    }

    @Override
    public String update() {
        System.out.println("修改客户");
        return "hello" ;
    }

    @Override
    public void delete() {
        System.out.println("删除客户");
    }

    @Override
    public void findOne() {
        System.out.println("查找一个");
//        int i = 1 / 0 ;
    }

    @Override
    public void findAll() {
        System.out.println("查找全部");
        int i = 1 / 0 ;
    }
}
