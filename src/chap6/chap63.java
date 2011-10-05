package chap6;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;




public class chap63 {
	public static void main(String[] args) {
		new chap63();
	}

	public chap63() {
		//this.chap631();
		//this.chap632();
		this.chap633();
	}
	public void chap631() {
		try {
			FileOutputStream fos = new FileOutputStream("objF"); 
			ObjectOutputStream oos = new ObjectOutputStream(fos); 
			SimpleSerialClass vp = new SimpleSerialClass("Vasa", 19);
			System.out.println(vp.toString());
			oos.writeObject(vp);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		try {
			FileInputStream fis = new FileInputStream("objF");
			ObjectInputStream ois = new ObjectInputStream(fis); 
			SimpleSerialClass vp = (SimpleSerialClass) ois.readObject();
			System.out.println(vp.toString());
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	/**
	 * Bug deSerializablition not working ! parnet class has not implamented Serializable 
	 */
	public void chap632() {
		try {
			FileOutputStream fos = new FileOutputStream("objFs"); 
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			SerClassWithParent vasaPupkin = new SerClassWithParent("Vasa", "Pupk", 20);
			System.out.println(vasaPupkin.toString());
			oos.writeObject(vasaPupkin);
			
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		try {
			FileInputStream fis = new FileInputStream("objFs");
			ObjectInputStream ois = new ObjectInputStream(fis); 
			SerClassWithParent vasaPupkin = (SerClassWithParent) ois.readObject(); 
			System.out.println(vasaPupkin.toString());
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

	/**
	 * Example with transient (can't change parent class)
	 */
	public void chap633() {
		try {
			FileOutputStream fos = new FileOutputStream("objFz"); 
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			SerClassTrans vasaPupkin = new SerClassTrans("Vasa", 20, "Pupk");
			System.out.println(vasaPupkin.toString());
			oos.writeObject(vasaPupkin);
			
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		try {
			FileInputStream fis = new FileInputStream("objFz");
			ObjectInputStream ois = new ObjectInputStream(fis); 
			SerClassTrans vasaPupkin = (SerClassTrans) ois.readObject(); 
			System.out.println(vasaPupkin.toString());
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
	
	
}

class SimpleSerialClass implements Serializable{
	String name = "";
	Integer age = 0;

	public SimpleSerialClass(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SimpleSerialClass [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
}


class ParentClass{
	public String surname = "defualtVal!";
	
	public ParentClass() {
		surname += "_!";
	}
	
	public ParentClass(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}

class SerClassWithParent extends ParentClass implements Serializable {
	String name = "";
	Integer age = 0;
	
	public SerClassWithParent(String surname, String name, Integer age) {
		this.surname = surname;
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SerClassWithParent [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", surname=");
		builder.append(surname );
		builder.append("]");
		return builder.toString();
	}
}


class SerClassTrans implements Serializable {
	String name = "";
	Integer age = 0;
	transient ParentClass surname = new ParentClass();
	
	public SerClassTrans(String name, Integer age, String surname) {
		this.name = name;
		this.age = age;
		this.surname = new ParentClass(surname);
	}

	private void writeObject(java.io.ObjectOutputStream out){
		 try {
			 out.defaultWriteObject();
			 out.writeUTF(surname.getSurname());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

     private void readObject(java.io.ObjectInputStream in){
    	 try {
			in.defaultReadObject();
			this.surname = new  ParentClass(in.readUTF());
		} catch (Exception e) {
			e.printStackTrace();
		}
     }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public ParentClass getSurname() {
		return surname;
	}
	public void setSurname(ParentClass surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SerClassTrans [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", surname=");
		builder.append(surname.getSurname());
		builder.append("]");
		return builder.toString();
	}
	
}

