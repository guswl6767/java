package kr.ac.mlec.day08;

import java.util.ArrayList;
import java.util.List;

/*
  java.util.list : ������ ������ �ְ� �ߺ��� ����ϴ� ����
  ���� Ŭ����
   -arraylist
   -linkedlist
   
   �ֿ�޼ҵ�
   add();
   get();
   remove();
   clear();
   contains();
   size();
   isempty();
   
   ------------
   genericŸ���� �����ڷ����� �����ؼ� �ڹٴ� �⺻�ڷ��� Ÿ���� �����ڷ��� Ÿ���� ������ �ִ� (Wrapper class)

   �⺻�ڷ���           Wrapper class(�⺻�ڷ����� ����� ������ Ŭ����)
   
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
		//add �� ������� Ÿ���̵� �����ϴ�   <>generic  ������ object�� �迭 , �Ʒ��� String�� �迭  generic Ÿ���� ������ �����ڷ����� ����,�⺻�ڷ��� �Ұ�
		List list = new ArrayList();
		list.add(1);
		List<String> list2 = new ArrayList<String>();
		
		list2.add("hello");
		
		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(1);
		
	 }

}
