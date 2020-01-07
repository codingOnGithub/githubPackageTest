package com.wenshenjun.util;

/**
 * @author wenshenjun
 * @description
 * @date 2020/01/06 10:55 PM
 */
public class TestUtil {
  public static long sum(long x, long y) {
    return Math.addExact(x, y);
  }
  public static String hello(String name) {
    return "hello " + name;
  }
}
