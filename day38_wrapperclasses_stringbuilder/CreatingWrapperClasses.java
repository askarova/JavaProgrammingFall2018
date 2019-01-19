package day38_wrapperclasses_stringbuilder;

public class CreatingWrapperClasses {
    public static void main(String[] args) {
        //Create Wrapper class objects
        Integer n1 = new Integer(100);
        System.out.println(n1);
        Integer n2 = Integer.valueOf(456);
        System.out.println(n2 + 100);
        Integer n3 = Integer.parseInt("2345");
        System.out.println(n3);
        
        Double d1 = new Double(123.45);
        Double d2 = Double.valueOf(345.6);
        Double d3 = Double.parseDouble("1000.3");
        // similarly we can do with other Wrapper classes as well
        
        Character ch1 = new Character('A');
        Character ch2 = Character.valueOf('@');
        
        char ch3 = '3';
        System.out.println(Character.isDigit(ch3));
        
        String str = "ab5c";
        
        System.out.println(Character.isAlphabetic(str.charAt(0)));
        System.out.println(Character.isAlphabetic(str.charAt(2)));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('m'));
        System.out.println(Character.isLowerCase('m'));
        
        System.out.println( Character.isLetterOrDigit('1') );
        System.out.println( Character.isLetterOrDigit('i') );
        System.out.println( Character.isLetterOrDigit('@') );
        System.out.println( Character.isLetterOrDigit(' ') );
        System.out.println( Character.isLetterOrDigit('%') );
    }
}