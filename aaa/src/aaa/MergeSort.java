package aaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort 
{

    public static void main( String[] args ){
       System.out.println(sort(new ArrayList<Integer>(Arrays.asList(22,1,23,192,543,1024,11,534,213,455))));
    }

    private static List<Integer> sort(List<Integer> list) {
    	if(list.size() < 2) { return list;}
        return merge(
        		sort(list.subList(0, list.size() / 2)),
        		sort(list.subList(list.size() / 2, list.size()))	);
        
    }
    
    private static List<Integer> merge (List<Integer> left, List<Integer> right) {
        List<Integer> rs = new ArrayList<>();
        int rightIdx = 0;

        for (Integer lnum : left) {
            while (right.size() > rightIdx && lnum > right.get(rightIdx)) {
                rs.add(right.get(rightIdx++));
            }
            rs.add(lnum);
        }
        
        rs.addAll(right.subList(rightIdx, right.size()));
        return rs;
    }
}