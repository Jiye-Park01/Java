package grade;

import java.util.Scanner;

public class TeacherLogin {
	private String teacher;
	private String teacherID;
	private String teacherPassword;
	Scanner input = new Scanner(System.in);
	
	public TeacherLogin(String teacherID, String teacherPassword)
	{
		this.teacherID = teacherID;
		this.teacherPassword = teacherPassword;
	}
	public String getTeacherName()
	{
		return teacher;
	}
	public String getTeacherID()
	{
		return teacherID;
	}
	public String getTeacherP()
	{
		return teacherPassword;
	}
	public void setID(String ID)
	{
		this.teacherID = ID;
	}
	public void setPassword(String Password)
	{
		this.teacherPassword = Password;
	}
	
	public void showteacher()
	{
		System.out.println("이름 : " + teacher + "  아이디 : " + teacherID + "  비밀번호 : " + teacherPassword);
	}
	public void teacheradd()
	{
		TeacherLogin teach = new TeacherLogin(teacherID, teacherPassword);
		teach.teacher = input.next();
		teacherID = input.next();
		teacherPassword = input.next();
	}
	
}
