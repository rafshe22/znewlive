package javapackage;

public class StudentProfile implements RegistrationDetails{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentdetails obj=new Studentdetails();
		obj.setId(1000);
		obj.setName("Rafat");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}

	@Override
	public void fillform() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addImage() {
		// TODO Auto-generated method stub
		
	}

}

class Studentdetails
{
	private int id;
	private String name;
	
	public void setId(int a)
	{
		id=a;
	}
	
	public void setName(String nam)
	{
		name=nam;
	}
	
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
}