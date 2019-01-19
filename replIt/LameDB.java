package replIt;

public class LameDB {
	
public static void main(String[] args) {
			
/*
* m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
returns:  1etsy#2wooden#3spoon#4aaa
(since operation is 'add', we added '#4aaa' to the end and return)
				
	m.lameDb("1test#2bla#3foo","edit","2","bbb")
		returns:  1test#2bbb#3foo
(since operation is 'edit', we edited id 2 to '#2bbb' to the end and return)
				
				
	m.lameDb("1tst#2bla#3foo","delete","1","")
	returns:  #2bla#3foo
				
	m.lameDb("1tst#2bla#3foo","none","1","")
	returns:  1tst#2bla#3foo
	*/
			
		}

public static String lameDb(String db, String op,String id,String data) {
	String [] result = db.split("#");
 String str = "";
	//[1tst, 2bla, 3foo"];
			 
 for (int i = 0; i < result.length; i++) {
	switch (op) {
case ("add") :
		str = db + "#" + id + data;
		break;
case ("edit"):
	if (result[i].startsWith(id)) {
	str = db.replace(result[i], id + data);
	}
	break;
case ("delete"):
	if (result[i].startsWith(id)) {
		str = db.replace(("#" + result[i]), "");
					}
	break;
case ("none") :
	str = db;
				}
			}
			 
			 
			 return str;
			 
		 }
		
	}

