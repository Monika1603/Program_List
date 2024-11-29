package com.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateValue {

	public static void main(String[] args) 
	{
     List<Integer> list = new ArrayList<>();
     Collections.addAll(list, 2,3,4,5,2,3);
     Set<Integer> set = new HashSet<>();
     List<Integer>duplicateValue=list.stream().filter(i->!set.add(i)).collect(Collectors.toList());
     System.out.println(duplicateValue);
	}

}
