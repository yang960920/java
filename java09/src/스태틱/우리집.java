package ½ºÅÂÆ½;

public class ¿ì¸®Áı {

	public static void main(String[] args) {
		
		µş d1 = new µş("È«±æ¼ø",'¿©');
		µş d2 = new µş("È«±æÁø",'¿©');
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("µşÀº ÃÑ : " + µş.count + " ¸íÀÌ´Ù.");
		System.out.println("¾ÆºüÀÇ ³²Àº Áö°© »çÁ¤Àº : " + ((µş.daddy+10000)-(1000*µş.count)) + "¿øÀÌ´Ù." );
		
	}

}
