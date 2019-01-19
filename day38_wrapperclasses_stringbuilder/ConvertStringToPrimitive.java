package day38_wrapperclasses_stringbuilder;

import java.util.ArrayList;
public class ConvertStringToPrimitive {
    public static void main(String[] args) {
        String count = "432";
        int iCount = Integer.parseInt(count);//convert string to int
        Integer iCount2 = Integer.valueOf(count);
        System.out.println(iCount2);
        System.out.println(iCount);
        if(iCount > 0) {
            System.out.println("Count is positive");  
        }else {
            System.out.println("Count is negative");
        }
        
        String str = "Price is 45.77";
        String[] sp = str.split(" ");
        double price = Double.parseDouble( sp[2] );
        System.out.println(price);
        
        String etsyResult = "“wooden spoon” (13,950 Results)";
        String[] etsyArray = etsyResult.split(" ");
        String strSpoonsCount = etsyArray[2].replace("(", "").replace(",", "");
        int woodenSpoons = Integer.parseInt(strSpoonsCount);
        
        if(woodenSpoons > 0) {
            System.out.println("PASS. Search results are displayed");
        }else {
            System.out.println("FAIL. Search results are NOT displayed");
        }
        
        String[] sNums = {"234", "345", "23", "12"};
        ArrayList<Integer> listNums = new ArrayList<>();
        
        for (String num : sNums) {
            listNums.add(Integer.valueOf(num));
        }
        
        System.out.println(listNums);
        
    }
}
