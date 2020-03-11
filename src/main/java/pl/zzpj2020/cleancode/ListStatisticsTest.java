package pl.zzpj2020.cleancode;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListStatisticsTest {

    @Test
    public void mainTest(){
        List<Integer> testList = new ArrayList<Integer>(){};
        testList.add(6);
        testList.add(6);
        testList.add(4);
        testList.add(4);
        testList.add(1);
        testList.add(1);
        ListStatistics listStatistics = new ListStatistics(testList);
        System.out.println(listStatistics.getMinElement());
        System.out.println(listStatistics.getMaxElement());
        System.out.println(listStatistics.getMeanForList());
        System.out.println(listStatistics.getNumberCount(6));

    }
}