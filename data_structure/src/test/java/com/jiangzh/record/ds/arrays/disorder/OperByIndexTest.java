package com.jiangzh.record.ds.arrays.disorder;

import static org.junit.jupiter.api.Assertions.*;

import com.jiangzh.record.ds.arrays.ArraysUtils;
import java.util.List;
import org.junit.jupiter.api.Test;

class OperByIndexTest {


  private OperByIndex operByIndex;

  @Test
  public void operByIndexTest(){
    init();

    addData();
    printData();

    delIndex();
    printData();

    getDataByIndex();
  }

  private void init(){
    operByIndex = new OperByIndex(6);
  }

  private void printData(){
    ArraysUtils.printArrays(operByIndex.getArrays());
  }

  private void addData() {
    // init data
    operByIndex.addData(6);
    operByIndex.addData(4);
    operByIndex.addData(7);
    operByIndex.addData(5);
    operByIndex.addData(9);
    operByIndex.addData(2);
  }

  private void delIndex() {
    operByIndex.delDataByIndex(2);
  }

  private void getDataByIndex() {
    int dataByIndex = operByIndex.getDataByIndex(2);
    System.out.println("dataByIndex="+dataByIndex);
  }


}