package 剑指offer;

/** 
 * @ClassName: StringTest 
 * @Description: String字符串测试
 * @author: a9858
 * @date: 2016年8月14日 下午8:34:24  
 */
public class StringTest {
	public static void main(String[] args) {
		String str = replaceSpace(new StringBuffer("wo are heppy"));
		System.out.println(str);
	}
	
	 public static String replaceSpace(StringBuffer str) {
		 for(int i = 0; i < str.length(); i++){
			 if(str.charAt(i) == ' '){
				 str.setCharAt(i, '%');
				 str.insert(i+1, new char[]{'2','0'});
			 }
		 }
		 return str.toString();
	    }

}
