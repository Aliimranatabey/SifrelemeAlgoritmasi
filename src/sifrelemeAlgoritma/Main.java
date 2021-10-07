package sifrelemeAlgoritma;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String cýktý="";
        String[][] charecters= {{"a","Br"},{"b","Se"},{"c","As"},{"ç","Ge"},{"d","Ga"},{"e","Zn"},{"f","Cu"},{"g","Ni"},{"ð","Co"},{"h","Fe"},{"ý","Mn"},{"i","Cr"},
        		{"j","V"},{"k","Ti"},{"l","Ca"},{"m","K"},{"n","Ar"},{"o","Cl"},{"ö","S"},{"p","P"},{"r","Al"},{"s","Mg"},
        		{"þ","Na"},{"t","F"},{"u","O"},{"ü","N"},{"v","C"},{"y","B"},{"z","Be"}};
		Scanner klv = new Scanner(System.in);
        System.out.println("lütfen þifrelenmesini istediginiz kelimeyi veya cümleyi girin :");
        String gýrýlen=klv.nextLine();
        String cumle=gýrýlen.toLowerCase();
        String[] parca=cumle.split("");
		for(int i=0;i<cumle.length();i++){
			for(int j=0;j<charecters.length;j++) {			
				if(parca[i].equals(charecters[j][0]))
	            {
	                parca[i]=charecters[j][1];
	                cýktý=cýktý +parca[i];
	             }
			}
		}
		System.out.println(cýktý);	
	}
}