
public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Java_06
		int a = 5;
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		//続けて、++aと記述すると、このように1つずつ数を増加させて表示できる
	
		int b=10;
		System.out.println(--b);
		System.out.println(--b);
		System.out.println(--b);
		
		//Java_07
		int c = 10;
		if(c <20){
		System.out.println( "A" );
		}
		//もし、”ある数”(a)が20より小さい場合は、Aと表示する
		int d = 20;
		if(d<=30){
		System.out.println( "B" );
		//もし、”ある数”(a)が30以下だった場合は、Bと表示する
		String e = "山田";
		if(e.equals( "山田" )){
		System.out.println( e+"さん");
		}
		//もし、”ある文字列”(b)が「山田(人の名前)」だった場合は、「山田さん」を表示する
		}
		int f = 5;
		if(f<10 &&3<f){
		System.out.println( "C" );
		}
		//もし、”ある数”(a)が10未満であり、かつ3より大きい場合は、Cと表示する
		int g= 5;
		if(g>=5 ||g<=0){
		System.out.println( "D" );
		}
		//もし、”ある数”(g)が5以上である、または0以下のどちらかである場合は、Dと表示する
		int h = 7;
		if(h > 8){
		System.out.println( "E" );
		}else if(h <10){
		System.out.println( "F" );
		}
		//もし、"ある数”(h)が8より大きい場合は、Aと表示する。
		//そうでない場合で”ある数”(h)が10未満の場合は、Bと表示する。
     }
}