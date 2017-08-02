package cn.netkiller;

import cn.netkiller.annotation.Person;

@Person(name = "xingoo", age = 25)
public class test {
	public static void print(Class<test> c) {
		System.out.println(c.getName());
		Person person = (Person) c.getAnnotation(Person.class);
		if (person != null) {
			System.out.println("name:" + person.name() + " age:" + person.age());
		} else {
			System.out.println("person unknown!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test.print(test.class);
	}

}