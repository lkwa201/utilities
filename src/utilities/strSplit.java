package utilities;

import java.util.regex.Pattern;

public class strSplit {

    public static void main(String[] args) {
        String str = "test.zip";
        String s =  getFileExtension(str)[1];
        System.out.println(s);
    }

    /**
     * 제출파일에 확장자가 없는 케이스인 경우 빈 값으로 예외 처리 함
     */
    protected static String[] getFileExtension(String s) {
        String[] str = new String[2];
        String regExp = "\\w+\\.\\w+";
        boolean result = Pattern.matches(regExp, s);
        if(result) {
            String[] arrStr = s.split("\\.");
            str[0] =  arrStr[0];
            str[1] =  arrStr[1];
        } else {
            str[0]  = s;
            str[1]  = "";
        }
        return str;
    }
}
