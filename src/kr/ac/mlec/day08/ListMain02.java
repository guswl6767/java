package kr.ac.mlec.day08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain02 {
      public static void main(String[] args) {
		
    	  
   // 	  List<String> list=new ArrayList<String>();
    	  
    //	  List<String> list=new ArrayList<>(); //1.7�����̻�
    	  List<String> list=new LinkedList<>(); 
    	  
    	  System.out.println("�� �����ǰ���: "+list.size());
    	  list.add("one");
    	  list.add("two");
    	  list.add("three");
    	  list.add("four");
    	  System.out.println("�� �����ǰ���: "+list.size());
    	  list.add("one");
    	  list.add("five");
    	  System.out.println("�� �����ǰ���: "+list.size());
    	  
    	  System.out.println("<��ü ��� ���>");
    	  for(int i =0; i <list.size(); i++) {
    		  System.out.println(list.get(i)+ " ");
    	  }
	     System.out.println();
	     
	     System.out.println("0��° ������ : "+list.get(0));
	     String delStr = list.remove(0);
	     System.out.println("0��° ������ ������ : "+ delStr);
	     System.out.println("0��° ������ : "+list.get(0));
	     
	     System.out.println("remove(\"one\" :"+(list.remove("one") ? "��������": "��������"));
	     System.out.println("remove(\"one\" :"+(list.remove("one") ? "��������": "��������"));
	     
	     System.out.println("<��ü ��� ���>"); //1.5����
	     for(String data :list) {
	    	 System.out.println(data + " ");
	     }
	     System.out.println();
	     
	     System.out.println("contains(\"three\"):" +(list.contains("three") ? "�˻�����": "�˻�����"));
	     System.out.println("contains(\"three\"):" +(list.contains("one") ? "�˻�����": "�˻�����"));
      }
      
      
      
      
}
