import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		String[] sign={"qq.com","163.com","192.com","vip.qq.com","gmail.com","firefox.com","xbox.com","yeah.net","edu.com"};
		String xlh="";
		Random rd=new Random();
		int randoma=rd.nextInt(1000000000*10);
		int randomc=rd.nextInt(8);
		String zm=sign[randomc];
		xlh = xlh + zm;
		System.out.println(randoma+"@"+xlh);
	}
}
