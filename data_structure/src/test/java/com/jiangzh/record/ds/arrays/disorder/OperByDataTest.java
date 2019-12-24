package com.jiangzh.record.ds.arrays.disorder;

import static org.junit.jupiter.api.Assertions.*;

import com.jiangzh.record.ds.arrays.ArraysUtils;
import org.junit.jupiter.api.Test;

class OperByDataTest {

  private OperByData operByData;

  @Test
  public void operByDataTest(){
    init();

    addData();
    printData();

    delData();
    printData();

    getData();
  }

  private void init(){
    operByData = new OperByData(6);
  }

  private void printData(){
    ArraysUtils.printArrays(operByData.getArrays());
  }

  private void addData() {
    // init data
    operByData.addData(6);
    operByData.addData(4);
    operByData.addData(7);
    operByData.addData(2);
    operByData.addData(9);
    operByData.addData(5);
  }

  private void delData() {
    operByData.delData(2);
  }

  private void getData() {
    int dataByIndex = operByData.getIndexByData(9);
    System.out.println("dataByIndex="+dataByIndex);
  }

}