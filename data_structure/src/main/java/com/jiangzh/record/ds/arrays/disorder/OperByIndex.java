package com.jiangzh.record.ds.arrays.disorder;

/**
 * @author : jiangzh
 * @program : com.jiangzh.record.ds.arrays.disorder
 * @description : 根据索引对数组进行操作
 **/
public class OperByIndex{
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
  public OperByIndex(int arrayLength){
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
  public void delDataByIndex(int index){
    if(index >= arrays.length || index < 0){
      throw new ArrayIndexOutOfBoundsException();
    }else if(index == arrays.length-1){
      arrays[index] = 0; // set a default value
    }else{
      // when index between 0~arrays.length-2 , real algorithm implements
      for(int i=index;i<arrays.length-1;i++){
        arrays[i] = arrays[i+1];
      }
      arrays[arrays.length-1] = 0;
    }
  }

  /**
  * @Description: 根据索引查询某条数据
  * @Param: [index]
  * @return: int
  * @Author: jiangzh
  */
  public int getDataByIndex(int index){
    if(index >= arrays.length || index < 0) {
      throw new ArrayIndexOutOfBoundsException();
    }else{
      return arrays[index];
    }
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
