package com.imagine.builder;

import com.imagine.Builder;
import com.imagine.controller.DecorationPackageController;

import java.math.BigDecimal;

/**
 * @author imagine
 * @date 2023/7/13/0013 - 8:15
 */
public class Test {

    @org.junit.Test
    public void test_DecorationPackageController(){
        DecorationPackageController decoration = new DecorationPackageController();
        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"),1));
        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"),2));
        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"),3));
    }
    @org.junit.Test
    public void test_Builder(){
        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());
        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());
        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }

}
