package shrCompare.utils;


import java.util.regex.Pattern;

public class StringUtil {
	
	//判断字符串为空
	public static boolean isEmpty(String str){
		if("".equals(str)|| str==null){
			return true;
		}else{
			return false;
		}
	}
	
	// 判断字符串不为空
	public static boolean isNotEmpty(String str){
		if(!"".equals(str)&&str!=null){
			return true;
		}else{
			return false;
		}
	}
	
	//判断一个数组中是否包含某个字符串
	public static boolean existStrArr(String str,String []strArr){
		for(int i=0;i<strArr.length;i++){
			if(strArr[i].equals(str)){
				return true;
			}
		}
		return false;
	}
// 判断是否是数字
	public static boolean isNumber(String string) {
		if (string == null)
			return false;
		Pattern pattern = Pattern.compile("^-?\\d+(\\.\\d+)?$");
		return pattern.matcher(string).matches();
	}

	// 判断是否是数字
	public static boolean is6Number(String string) {
		if (string == null)
			return false;
		Pattern pattern = Pattern.compile("\\d{6}");
		return pattern.matcher(string).matches();
	}


}
