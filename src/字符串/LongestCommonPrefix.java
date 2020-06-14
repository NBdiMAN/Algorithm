package 字符串;

/**
 * @Author: WangYang
 * @Date: 2020/6/15 0:24
 * 最长公共前缀
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"abab","aba",""});
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        char[] charArray = strs[0].toCharArray();
        int lengthTemp = charArray.length - 1;
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() == 0){
                return "";
            }
            char[] chars = strs[i].toCharArray();
            int length = chars.length;
            for (int j = 0; j < length; j++) {
                if(j <= lengthTemp){
                    if(chars[j] != charArray[j]){
                        lengthTemp = j - 1;
                        continue;
                    }else if(j == length - 1){
                        lengthTemp = j;
                    }
                }else{
                    continue;
                }
            }
        }
        if(lengthTemp < 0){
            return "";
        }else{
            return strs[0].substring(0,lengthTemp + 1);
        }
    }
}
