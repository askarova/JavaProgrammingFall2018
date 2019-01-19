package day39_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {

		StringBuilder stb1 = new StringBuilder("Halloween");
		System.out.println(stb1);

		StringBuilder stb2 = new StringBuilder();
		// stb2 + stb2 + "Java"; (+) operator will not work with stringbuilders...
		stb2.append("java");
		System.out.println(stb2);
		stb2.append(",SQL").append(",HTML");
		System.out.println(stb2);

		// APPEND METHOD

		StringBuilder listBuilder = new StringBuilder("Wooden Spoon");
		listBuilder.append(",Iron Spoon");
		System.out.println(listBuilder);

		listBuilder.append('|');
		System.out.println(listBuilder);

		listBuilder.append(100);
		System.out.println(listBuilder);

		String s = "aaa";
		s = s + 100;
		s = s + true;
		s = s + '%';
		System.out.println(s);

		StringBuilder letters = new StringBuilder("ABCDEFGHIJKLM");
		letters.append("KKK WW");

		System.out.println(letters);

		letters.delete(0, 4);
		System.out.println(letters);

		letters.delete(5, 100);
		System.out.println(letters);

		StringBuilder sentence = new StringBuilder("Java is fun!");
		System.out.println(sentence);

		sentence.reverse();
		System.out.println(sentence);

		sentence.deleteCharAt(0);
		System.out.println(sentence);

		sentence.deleteCharAt(sentence.length() - 1);
		System.out.println(sentence);

		StringBuilder stbInsert = new StringBuilder("SeleniumAutomation");

		stbInsert.insert(8, " Test ");
		System.out.println(stbInsert);

		stbInsert.insert(9, 1);
		System.out.println(stbInsert);

		stbInsert.replace(0, stbInsert.indexOf(" "), "Appium");

		// stbInsert.replace(0, 8, "Appium"); Same with code above

		System.out.println(stbInsert);
		
		

	}

}

