/*
每一个学生都有对应的归属地。
学生Student，地址String。
学生属性：姓名，年龄。
注意：姓名和年龄相同的视为同一个学生。
保证学生的唯一性。



1，描述学生。

2，定义map容器。将学生作为键，地址作为值。存入。

3，获取map集合中的元素。

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

//第一种方法取出Map
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
