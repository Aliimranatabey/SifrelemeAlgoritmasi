package sifrelemeAlgoritma;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String c?kt?="";
        String[][] charecters= {{"a","Br"},{"b","Se"},{"c","As"},{"?","Ge"},{"d","Ga"},{"e","Zn"},{"f","Cu"},{"g","Ni"},{"?","Co"},{"h","Fe"},{"?","Mn"},{"i","Cr"},
        		{"j","V"},{"k","Ti"},{"l","Ca"},{"m","K"},{"n","Ar"},{"o","Cl"},{"?","S"},{"p","P"},{"r","Al"},{"s","Mg"},
        		{"?","Na"},{"t","F"},{"u","O"},{"?","N"},{"v","C"},{"y","B"},{"z","Be"}};
		Scanner klv = new Scanner(System.in);
        System.out.println("l?tfen ?ifrelenmesini istediginiz kelimeyi veya c?mleyi girin :");
        String g?r?len=klv.nextLine();
        String cumle=g?r?len.toLowerCase();
        String[] parca=cumle.split("");
		for(int i=0;i<cumle.length();i++){
			for(int j=0;j<charecters.length;j++) {			
				if(parca[i].equals(charecters[j][0]))
	            {
	                parca[i]=charecters[j][1];
	                c?kt?=c?kt? +parca[i];
	             }
			}
		}
		System.out.println(c?kt?);	
	}
}