package kr.ac.mlec.day08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain02 {
      public static void main(String[] args) {
		
    	  
   // 	  List<String> list=new ArrayList<String>();
    	  
    //	  List<String> list=new ArrayList<>(); //1.7버전이상
    	  List<String> list=new LinkedList<>(); 
    	  
    	  System.out.println("총 원소의개수: "+list.size());
    	  list.add("one");
    	  list.add("two");
    	  list.add("three");
    	  list.add("four");
    	  System.out.println("총 원소의개수: "+list.size());
    	  list.add("one");
    	  list.add("five");
    	  System.out.println("총 원소의개수: "+list.size());
    	  
    	  System.out.println("<전체 요소 출력>");
    	  for(int i =0; i <list.size(); i++) {
    		  System.out.println(list.get(i)+ " ");
    	  }
	     System.out.println();
	     
	     System.out.println("0번째 데이터 : "+list.get(0));
	     String delStr = list.remove(0);
	     System.out.println("0번째 삭제된 데이터 : "+ delStr);
	     System.out.println("0번째 데이터 : "+list.get(0));
	     
	     System.out.println("remove(\"one\" :"+(list.remove("one") ? "삭제성공": "삭제실패"));
	     System.out.println("remove(\"one\" :"+(list.remove("one") ? "삭제성공": "삭제실패"));
	     
	     System.out.println("<전체 요소 출력>"); //1.5버전
	     for(String data :list) {
	    	 System.out.println(data + " ");
	     }
	     System.out.println();
	     
	     System.out.println("contains(\"three\"):" +(list.contains("three") ? "검색성공": "검색실패"));
	     System.out.println("contains(\"three\"):" +(list.contains("one") ? "검색성공": "검색실패"));
      }
      
      
      
      
}
