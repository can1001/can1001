import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class TestDeposition {
    public static void main(String[] args) throws IOException{
        String answer = "";
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("구할 숫자를 입력하세요");
        // String value = in.readLine();
        String value = "16";
        
        // 양수가 아니면 널을 입력하기
        if(Integer.parseInt(value) <= 0){
            System.out.println("null");
            return;
        }
        
        String strNum = toDeposition(Integer.parseInt(value), 2);
        System.out.println(value + "의 "+2+" 진법: "+ strNum);

        // 2진수를 해독하기.
        List<String> textList = new ArrayList<>();
        for (int i = 0; i < strNum.length(); i++) {
            
            int end = i + 2;
            if(end > strNum.length()){ end = strNum.length(); }
            if(i%2 == 0){
                textList.add(strNum.substring(i, end));
            }            
        }

        /**
         * 4의 배수 일때 처리하기. (미해결)
         */
        for (int i = 0; i < textList.size(); i++) {
            // System.out.println(textList.get(i));
            int num = Integer.parseInt(textList.get(i), 2);

        
            String str ="";    
            switch (num) {
                case 1:
                    str = "O";
                    break;

                case 2:
                    str = "T";
                    break;

                case 3:
                    str = "H";
                    break;

                case 4:
                    str = "F";
                    break;
            
                default:
                    break;
            }

            //문자열 우->좌로 배열
            answer  = (str) + answer ;
        
        }
        
        answer = new StringBuilder(answer).reverse().toString();
        
        System.out.println(answer);

    }

    public static String toDeposition(int value, int i){

        String returnString = "";
        
        while(value != 0){
           
            // 나머지가 0~9 사이이면  캐릭터 값을 배열에 저장
            if( (value % i) < 10 ) {
                //문자열 우->좌로 배열
                returnString = (value % i) + returnString;
                //몫을 구함
                value /= i;
            }
            // 나머지가 10 이상이면 해당하는 값의 알파벳을 저장
            else {
                int temp1 = (char)((value % i)  + 55);

                returnString = Integer.toString(temp1) + returnString;
            }

        }

        return returnString;

    }

}