package com.hza.aspect.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Create by hza
 * 2019-09-07 14:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {

    @Autowired
    private ProductDao productDao;

    @Test
    public void test1() {
        productDao.delete();
        productDao.save();
        productDao.update();
        productDao.findOne();
        productDao.findAll();
    }
}
