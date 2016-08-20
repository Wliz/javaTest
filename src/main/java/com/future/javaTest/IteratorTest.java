package com.future.javaTest;

import java.util.ArrayList;
import java.util.Iterator;

/** 
 * @ClassName: IteratorTest 
 * @Description: Iterator  支持从源集合中安全地删除对象，
 * 				 只需在 Iterator 上调用 remove() 即可。
 * 				 这样做的好处是可以避免 ConcurrentModifiedException ，
 * 				 当打开 Iterator 迭代集合时，同时又在对集合进行修改。
 * 				 有些集合不允许在迭代时删除或添加元素，
 * 				 但是调用 Iterator 的remove() 方法是个安全的做法
 * @author: a9858
 * @date: 2016年8月20日 上午9:09:20  
 */
public class IteratorTest {

	
	public static void main(String[] args) {
		
		//准备数据
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int count = 0;
		while(count <= 10){
			list.add(count++);
		}
		
		//开始测试删除
		Iterator it = list.iterator();
		int index = 0;
		while (it.hasNext())
		{
			Object obj = it.next();
			if ((Integer)obj%2 == 0)//决定要删除的对象
			{
				it.remove();
//				list.remove(index);
//Exception in thread "main" java.util.ConcurrentModificationException
//at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
//at java.util.ArrayList$Itr.next(ArrayList.java:851)
//at com.future.javaTest.IteratorTest.main(IteratorTest.java:30)
			}
			index ++;
		}
		
		//打印list
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}
