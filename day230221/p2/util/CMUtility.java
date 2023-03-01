package day230221.p2.util;

public class CMUtility {
	/**
	 * 
	 * @Description	用该方法读取键盘
	 * @author greypigeon
	 * @date 2023年2月21日下午8:52:27
	 * @return	如果输入“1~5”，则方法返回输入的字符，如果输入非1~5，则返回false
	 */
	public static char readMenuSelection() {
		return 0;
		
	}
	/**
	 * 
	 * @Description	从键盘读取一个字符
	 * @author greypigeon
	 * @date 2023年2月21日下午8:56:21
	 * @return	返回读取的字符
	 */
	public static char readChar() {
		return 0;
		
	}
	/**
	 * 
	 * @Description	从键盘读取一个字符
	 * @author greypigeon
	 * @date 2023年2月21日下午8:57:06
	 * @param defaultValue	如果以后不输入字符而直接回车，方法将defaultValue作为返回值
	 * @return
	 */
	public static char readChar(char defaultValue) {
		return defaultValue;
		
	}
	/**
	 * 
	 * @Description	从键盘读取不超过2位的整数
	 * @author greypigeon
	 * @date 2023年2月21日下午9:02:07
	 * @return	返回读取的数
	 */
	public static int readInt() {
		return 0;
		
	}
	/**
	 * 
	 * @Description	从键盘读取不超过2位的整数
	 * @author greypigeon
	 * @date 2023年2月21日下午9:02:15
	 * @param defaultValue	如果以后不输入字符而直接回车，方法将defaultValue作为返回值
	 * @return	
	 */
	public static int readInt(int defaultValue) {
		return defaultValue;
		
	}
	/**
	 * 
	 * @Description	从键盘读取一个长度不超过limit的字符串
	 * @author greypigeon
	 * @date 2023年2月21日下午9:04:33
	 * @param limit
	 * @return	返回读取的字符串
	 */
	public static String readString(int limit) {
		return null;
		
	}
	/**
	 * 
	 * @Description	从键盘读取一个长度不超过limit的字符串
	 * @author greypigeon
	 * @date 2023年2月21日下午9:05:37
	 * @param limit	指定字符串的最大长度
	 * @param defaultValue	如果以后不输入字符而直接回车，方法将defaultValue作为返回值	
	 * @return	
	 */
	public static String readString(int limit,String defaultValue) {
		return defaultValue;
		
	}
	/**
	 * 
	 * @Description	从键盘读取‘Y’或‘N’
	 * @author greypigeon
	 * @date 2023年2月21日下午9:08:24
	 * @return	返回Y或N
	 */
	public static char readConfirmSelection() {
		char c;
		for( ; ;) {
			String str=readKeyBoard(1,false).toUpperCase();
			c=str.charAt(0);
			if(c=='Y'||c=='N') {
				break;
			}else {
				System.out.println("选择错误，请重新输入：");
			}
			
		}
		return c;
		
	}
	private static String readKeyBoard(int i, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}











