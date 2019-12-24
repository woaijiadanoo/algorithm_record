package com.jiangzh.record.ds.arrays;

import java.util.Arrays;

/**
 * @author : jiangzh
 * @program : com.jiangzh.record.ds.arrays
 * @description : 数组帮助类
 **/
public class ArraysUtils {

  private ArraysUtils(){}

  /**
  * @Description:  打印数组对象
  * @Param: []
  * @return: void
  * @Author: jiangzh
  */
  public static void printArrays(int[] arrays){
    System.out.println("print start");
    Arrays.stream(arrays).forEach((d)->{
      System.out.print(d+" ");
    });
    System.out.println();
    System.out.println("==========");
  }

}
