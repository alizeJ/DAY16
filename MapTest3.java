/*
练习：
"sdfgzxcvasdfxcvdf"获取该字符串中的字母出现的次数。

希望打印结果：a(1)c(2).....
*/

import java.util.*;

class MapTest3
{
	public static void main(String[] args) 
	{
		String s= charCount("ak+abAf1c,dCkaAbc-defa");
		System.out.println(s);
	}

	public static String charCount(String str)
	{
		char[] ch = str.toCharArray();
		TreeMap<Character, Integer> t1 =new TreeMap<Character, Integer>();
		
		int count = 0;
		
		for(int x=0; x<ch.length; x++)
		{
			if (!(ch[x]>='a' && ch[x]<='z' || ch[x]>='A' && ch[x]<='Z'))
				continue;
				Integer in = t1.get(ch[x]);

				if (in!=null)
					count = in;
				count++;
				t1.put(ch[x],count);
				count =0;
			
			
		}
		

	StringBuilder sb = new StringBuilder();

		Set<Map.Entry<Character,Integer>> entrySet = t1.entrySet();
		Iterator<Map.Entry<Character,Integer>>  it = entrySet.iterator();

		while(it.hasNext())
		{
			Map.Entry<Character,Integer> me = it.next();
			Character chs = me.getKey();
			Integer value = me.getValue();
			sb.append(chs+"("+value+")");
		}



		return sb.toString();
	}
}
