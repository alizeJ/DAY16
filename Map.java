/*
map��չ֪ʶ��

map���ϱ�ʹ������Ϊ�߱�ӳ���ϵ��

"yureban"   Student("01" "zhangsan");

"yureban" Student("02" "lisi");

"jiuyeban" "01" "wangwu";
"jiuyeban" "02" "zhaoliu";

һ��ѧУ�ж�����ҡ�ÿһ�����Ҷ������ơ�


*/
import java.util.*;

class Student 
{
	private int ID;
	private String name;

	Student(int ID, String name)
	{
		this.ID = ID;
		this.name = name;
	}
	
	public String toString()
	{
		return ID+".."+name;
	}
}


class  MapDemo
{
	public static void main(String[] args) 
	{
		TreeMap<String,List<Student>> czbk =new TreeMap<String, List<Student>>();
		List<Student> jichu = new ArrayList<Student>();
		List<Student> jiuye = new ArrayList<Student>();

		czbk.put("jichuban", jichu);
		czbk.put("jiuye",jiuye);

		jichu.add(new Student(01,"zhangsan"));
		jichu.add(new Student(03,"wangwu"));
		jiuye.add(new Student(01,"zhangsan"));
		jiuye.add(new Student(02,"lisi"));

		Iterator<String> it = czbk.keySet().iterator();
		while(it.hasNext())
		{
			String classroom = it.next();
			List<Student> classmate = czbk.get(classroom);
			System.out.println(classroom);
			getinfos(classmate);
		}
	}

	public static void getinfos(List<Student> s) 
	{	
		Iterator<Student> it = s.iterator();
		while (it.hasNext())
		{
			Student s1 =it.next();
			System.out.println(s1);
			
		}
	}
}
