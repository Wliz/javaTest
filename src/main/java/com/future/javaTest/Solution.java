package com.future.javaTest;

/** 
 * @ClassName: Solution 
 * @Description: 牛客网2015小米暑期实习笔试题
 * @author: a9858
 * @date: 2016年8月19日 下午10:14:38  
 */
public class Solution {
    /**
     * 获得两个整形二进制表达位数不同的数量
     * @Description:自己写的，瞬间感觉好笨！！！
     * 
     * @param m 整数m
     * @param n 整数n
     * @return 整型
     */
    public static int countBitDiff(int m, int n) {
        String mStr = Integer.toBinaryString(m);
        String nStr = Integer.toBinaryString(n);
        int count = nStr.length() - mStr.length();
        
        StringBuffer temp = new StringBuffer("");
        
        if(mStr.length() < nStr.length()){
        	while(count > 0){
        		temp.append("0");
        		count --;
        	}
        	mStr = temp.append(mStr).toString();
        	
        }else{
        	count = mStr.length() - nStr.length();
        	while(count > 0){
        		temp.append("0");
        		count --;
        	}
        	nStr = temp.append(nStr).toString();
        }
        
        System.out.println(mStr);
        System.out.println(nStr);
        
        count = 0;
        for(int i = 0; i < nStr.length(); i++){
        	if(mStr.charAt(i) != nStr.charAt(i)){
        		count ++;
        	}
        }
        
        return count;
    }
    
    /** 
     * @Title: method1 
     * @Description: 牛客网上同学写的
     * @param m
     * @param n
     * @return: int
     */
    public static int method1(int m, int n){
    	int count = 0;
    	
    	for(int i = 0; i <= 32; i++){
    		if((m >> i&1) != (n >> i&1)){
    			count ++;
    		}
    	}
    	
    	return count;
    }
    
    /** 
     * @Title: method2 
     * @Description: 牛客网厉害人物所写,感觉是最巧妙的，
     * @param m
     * @param n
     * @return: int
     */
    public static int method2(int m, int n){
    	int dif=m^n;//先将二者做异或运算，得到结果； 结果为：282491734
    	System.out.println(Integer.toBinaryString(dif));
    	int cnt=0;
    	while(dif!=0){
    		dif=dif&(dif-1);
    		cnt++;
    	}//统计一个整数dif含有多少个1；
    	return cnt;
    }
    
    public static void main(String[] args) {
//		System.out.println(countBitDiff(16807, 282475249));
//		System.out.println(method1(16807, 282475249));
		System.out.println(method2(16807, 282475249));
	}
}
