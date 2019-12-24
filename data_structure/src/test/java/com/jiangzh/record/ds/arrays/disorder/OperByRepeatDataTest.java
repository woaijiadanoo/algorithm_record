package com.jiangzh.record.ds.arrays.disorder;

import com.jiangzh.record.ds.arrays.ArraysUtils;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class OperByRepeatDataTest {

  private OperByRepeatData operByRepeatData;

  @Test
  public void operByRepeatDataTest(){
    init();

    addData();
    printData();

    delData();
    printData();

    getData();
  }

  private void init(){
    operByRepeatData = new OperByRepeatData(6);
  }

  private void printData(){
    ArraysUtils.printArrays(operByRepeatData.getArrays());
  }

  private void addData() {
    // init data
    operByRepeatData.addData(6);
    operByRepeatData.addData(4);
    operByRepeatData.addData(7);
    operByRepeatData.addData(6);
    operByRepeatData.addData(1);
    operByRepeatData.addData(7);
  }

  private void delData() {
    operByRepeatData.delData(6);
  }

  private void getData() {
    List<Integer> data = operByRepeatData.getData(7);
    data.stream().forEach(System.out::println);
  }

}