package com.hza.aspect.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Create by hza
 * 2019-09-07 15:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext2.xml")
public class SpringDemo2 {

    @Resource(name = "customerDao")
    private CustomerDao customerDao ;

    @Test
    public void test1() {
        customerDao.save();
        customerDao.delete();
        customerDao.update();
        customerDao.findOne();
        customerDao.findAll();

    }
}
