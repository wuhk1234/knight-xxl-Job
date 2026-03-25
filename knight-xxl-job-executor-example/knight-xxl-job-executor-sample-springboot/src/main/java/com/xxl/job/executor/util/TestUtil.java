package com.xxl.job.executor.util;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * @className: TestUtil
 * @description: TODO
 * @author: wuhk
 * @date: 2022/1/14 11:15
 * @version: 1.0
 * @company 个人自主研发
 **/

public class TestUtil {
    public static void main(String[] args) {
        String sss = "1;2;3;1;3;4;5";
        String[] s = sss.split(";");
        Set<String> set = new HashSet<>();
        for (String s1 : s) {
            set.add(s1);
        }
        String ssss = StringUtils.join(set,";");
        System.out.println(ssss);
    }
}
