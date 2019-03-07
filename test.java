import java.util.Arrays;
class Test {
    public static void main(String[] args) {
        String[] words={"Monday","Tuesday","Wednesday"}; 
        String[] t = reverseString(words);
        System.out.println(Arrays.toString(t));        
    }

    /**
     * 1. string reverse function 구현
     * 입력받은 문자열을 뒤집는 string reverse function을 직접 구현하세요.
     * 라이브러리로 제공되는 reverse 함수 (예를 들면, java의 StringBuilder::reverse() 등) 는 사용하지 마세요.
     * @see https://stackoverflow.com/questions/27436643/java-method-to-reverse-every-word-in-an-array-of-strings
     */
    private static String[] reverseString(String[] words)
    {
        String[] t=new String[words.length];

        for(int i=0;i<words.length;i++)
        {
            t[i] = "";
            for(int j=words[i].length()-1;j>=0;j--)
            {
                t[i]+=words[i].substring(j,j+1);
            }
        }
        return t;
    }
}