package com.jiangzh.record.ds.arrays.disorder;

import com.google.common.collect.Lists;
import java.util.List;

/**
 * @author : jiangzh
 * @program : com.jiangzh.record.ds.arrays.disorder
 * @description : 对可能存在重复数据数组进行操作
 **/
public class OperByRepeatData {
  // 待进行操作的数组对象
  private int[] arrays;
  // 待操作的索引，可以当游标使用
  private int currentIndex;

  /**
  * @Description:  通过构造函数来初始化数组对象
  * @Param: [arrayLength]
  * @return:
  * @Author: jiangzh
  */
  public OperByRepeatData(int arrayLength){
    arrays = new int[arrayLength];
  }

  /**
  * @Description: 向数组添加数据
  * @Param: [data]
  * @return: void
  * @Author: jiangzh
  */
  public void addData(int data){
    arrays[currentIndex++] = data;
  }

  /**
  * @Description: 根据索引删除数组中的某条数据
  * @Param: []
  * @return: void
  * @Author: jiangzh
  */
  public void delData(int data){
    int index = getIndexByData(0,data);
    if(index > -1){
      if(index >= arrays.length){
        throw new ArrayIndexOutOfBoundsException();
      }else if(index == arrays.length-1){
        arrays[index] = 0; // set a default value
      }else{
        // when index between 0~arrays.length-2 , real algorithm implements
        while (index>=0){
          for(int i=index;i<arrays.length-1;i++){
            arrays[i] = arrays[i+1];
          }
          arrays[arrays.length-1] = 0;
          index = getIndexByData(index,data);
        }
      }
    }
  }

  /**
  * @Description: 获取所有相同数据项
  * @Param: [data]
  * @return: java.util.List<java.lang.Integer>
  * @Author: jiangzh
  */
  public List<Integer> getData(int data){
    List<Integer> result = Lists.newArrayList();

    int index = getIndexByData(0,data);
    while (index > 0){
      result.add(arrays[index]);
      index = getIndexByData(index+1,data);
    }

    return result;
  }

  /**
  * @Description: 获取beginIndex索引后的第一个相同数据索引
  * @Param: [beginIndex, data]
  * @return: int
  * @Author: jiangzh
  */
  public int getIndexByData(int beginIndex,int data){
    int index = -1;
    if(beginIndex>=arrays.length){
      throw new ArrayIndexOutOfBoundsException();
    }else if(beginIndex<0){
      beginIndex=0;
    }
    for(int i=beginIndex;i<arrays.length;i++){
      if(arrays[i] == data){
        index = i;
        break;
      }
    }
    return index;
  }

  /**
  * @Description: 获取数组对象
  * @Param: []
  * @return: int[]
  * @Author: jiangzh
  */
  public int[] getArrays(){
    return arrays;
  }

}
