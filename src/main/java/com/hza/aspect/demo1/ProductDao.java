package com.hza.aspect.demo1;

import org.springframework.stereotype.Repository;

/**
 * Create by hza
 * 2019-09-07 13:51
 */
@Repository
public class ProductDao {

    public void save() {
        System.out.println("保存商品...");
    }

    public String delete() {
        System.out.println("删除商品...");
        return "hello" ;
    }

    public void update() {
        System.out.println("修改商品...");
    }

    public void findOne() {
        System.out.println("查找一个...");
//        int x = 1/0 ;
    }

    public void findAll() {
        System.out.println("查找所有...");
//        int x = 1/0 ;
    }
}
