package com.zycus.otherProblem1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Scanner sc = new Scanner (input);
        List<Integer> inputList = new ArrayList<Integer>();
        Map<Integer, Integer> countMap = new HashMap<>(); 
        List<Integer> outputList = new ArrayList<>(); 

        while (sc.hasNextInt()) {
            inputList.add(sc.nextInt());
        }
        for(Integer i : inputList){
            int count = countMap.getOrDefault(i, 0);
            countMap.put(i, count + 1); 
            outputList.add(i); 
        }
        ValueComparator comp = new ValueComparator(countMap); 
        Collections.sort(outputList, comp); 
        for (Integer i : outputList) { 
            System.out.print(i + " "); 
        } 
   }
}

class ValueComparator implements Comparator<Integer> { 
    private final Map<Integer, Integer> freqMap; 
    ValueComparator(Map<Integer, Integer> tFreqMap) { 
        this.freqMap = tFreqMap; 
    }
    @Override
    public int compare(Integer k1, Integer k2){
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1)); 
        int valueCompare = k1.compareTo(k2);  
        if (freqCompare == 0) 
            return valueCompare; 
        else
            return freqCompare; 
    } 
} 
