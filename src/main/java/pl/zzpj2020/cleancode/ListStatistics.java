package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListStatistics {

    Map<Integer, Integer> elementCounter = new HashMap<Integer, Integer>();
    private int minElement = Integer.MIN_VALUE;
    private int maxElement = Integer.MAX_VALUE;

    public ListStatistics(List<Integer> listToAnalise) {
        walkTroughList(listToAnalise);
    }

    public ListStatistics() {


    }

    private void walkTroughList(List<Integer> listToAnalise) {
		for (Integer integer : listToAnalise) {
			updateCounterMap(integer);
			updateMinMaxValues(integer);
		}
    }

    private void updateCounterMap(Integer listElement) {
        if (elementCounter.containsKey(listElement)) {
            Integer k = elementCounter.get(listElement);
            elementCounter.put(listElement, k + 1);
        } else {
            elementCounter.put(listElement, 1);
        }

    }

    private void updateMinMaxValues(Integer listElement){
        if (listElement > minElement) {
            minElement = listElement;
        }

        if (listElement < maxElement) {
            maxElement = listElement;
        }
    }

    public int getNumberCount(int i) {
        return elementCounter.getOrDefault(i, 0);
    }

    public double getMeanForList() {
        double numbersSum = 0;
        int occurrenceCounter = 0;
        for (Entry<Integer, Integer> u : elementCounter.entrySet()) {
            occurrenceCounter += u.getValue();
            numbersSum += u.getKey() * u.getValue();
        }
        return numbersSum / occurrenceCounter;
    }

    public int getMinElement() {
        return minElement;
    }

    public int getMaxElement() {
        return maxElement;
    }

}