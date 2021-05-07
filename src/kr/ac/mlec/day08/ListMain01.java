package kr.ac.mlec.day08;

import java.util.ArrayList;
import java.util.List;

/*
  java.util.list : 순서를 가지고 있고 중복을 허용하는 형태
  구현 클래스
   -arraylist
   -linkedlist
   
   주요메소드
   add();
   get();
   remove();
   clear();
   contains();
   size();
   isempty();
   
   ------------
   generic타입은 참조자료형만 가능해서 자바는 기본자료형 타입을 참조자료형 타입을 가지고 있다 (Wrapper class)

   기본자료형           Wrapper class(기본자료형을 멤버로 가지는 클래스)
   
   boolean           Boolean
   char              Character
   byte              Byte             
   short             Short
   int               Integer
   long              Long
   float             Float
   double            Double
   */
public class ListMain01 {
	public static void main(String[] args) {
		//add 는 어떤데이터 타입이든 가능하다   <>generic  위에껀 object형 배열 , 아래껀 String형 배열  generic 타입은 무조건 참조자료형만 가능,기본자료형 불가
		List list = new ArrayList();
		list.add(1);
		List<String> list2 = new ArrayList<String>();
		
		list2.add("hello");
		
		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(1);
		
	 }

}
