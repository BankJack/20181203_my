package Test;

import java.util.List;

public class Student {
	private String name;	//学生姓名
	private String idCar;	//学生学号
	private char sex; 	//学生的性别
	private int age;   //学生的年龄
	
	
	
	public Student() {
		super();
	}
	
	public Student(String name, String idCar, char sex, int age) {
		super();
		this.name = name;
		this.idCar = idCar;
		this.sex = sex;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCar == null) ? 0 : idCar.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (idCar == null) {
			if (other.idCar != null)
				return false;
		} else if (!idCar.equals(other.idCar))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdCar() {
		return idCar;
	}
	public void setIdCar(String idCar) {
		this.idCar = idCar;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "姓名：" + name + ", 学号：" + idCar + ", 性别：" + sex + ", 年龄：" + age + "";
	}
	
	
	
}
