package com.avinash.practice;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ShortestPath {
	/* Find the path from Source to destination if the flight goes from one direction.
	 *  A -> B
 
 		B -> C
 		C -> D
 
 		D -> E
	 */
	
		static Map<String, String> getSortedFlightSequence(String source, String destination, Map<String, String> flights){
			Map<String, String> outputSeq = new LinkedHashMap<>();
			if(flights.containsKey(source) && flights.containsValue(destination)){
				for(Entry<String, String> e : flights.entrySet()){
					if(e.getKey().equalsIgnoreCase(source)){
						outputSeq.put(e.getKey(), e.getValue());
						source = e.getValue();
					}
					if(e.getValue().equalsIgnoreCase(destination)){
						break;
					}
				}
			}else{
				System.out.println("No flights");
			}
			return outputSeq;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> flights = new LinkedHashMap<>();
		flights.put("A", "B");
		flights.put("B", "C");
		flights.put("C", "D");
		flights.put("D", "E");
		System.out.println(getSortedFlightSequence("A", "E", flights));// Flight path from source A to Destination E
		

	}

}
