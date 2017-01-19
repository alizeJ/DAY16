/*
ÿһ��ѧ�����ж�Ӧ�Ĺ����ء�
ѧ��Student����ַString��
ѧ�����ԣ����������䡣
ע�⣺������������ͬ����Ϊͬһ��ѧ����
��֤ѧ����Ψһ�ԡ�



1������ѧ����

2������map��������ѧ����Ϊ������ַ��Ϊֵ�����롣

3����ȡmap�����е�Ԫ�ء�

*/
import java.util.*;

class Student implements Comparable<Student>
{
	private String name;
	private int age;
	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student s)
	{
		int num = new Integer(this.name).compareTo(new Integer(s.name));

		if (num == 0)
		{
			return (this.age-s.age);
		}
		return num;
	}

	public int hashCode()
	{
		return name.hashCode() + age*86;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public String toString()
	{
		return name+".."+age;
	}
}

class MapTest
{
	public static void main(String[] args) 
	{
		HashMap<Student,String> hm = new HashMap<Student,String>();

		hm.put(new Student("lisi1",21),"beijing");
		hm.put(new Student("lisi1",21),"tianjin");
		hm.put(new Student("lisi2",22),"shanghai");
		hm.put(new Student("lisi3",23),"nanjing");
		hm.put(new Student("lisi4",24),"wuhan");
/*

//��һ�ַ���ȡ��Map
		Set<Student> s1 =hm.keySet();

		Iterator<Student> it = s1.iterator();
		while(it.hasNext())
		{
			Student st = it.next();
			String str = hm.get(st);
			sop(st+"..."+str);
		}

*/

		Set<Map.Entry<Student, String>> s = hm.entrySet();
		Iterator<Map.Entry<Student,String>> it1 = s.iterator();
		while(it1.hasNext())
		{
			Map.Entry<Student,String> m = it1.next();
			sop(m.getKey()+".."+m.getValue());
			
		}
		
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
