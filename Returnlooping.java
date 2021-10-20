package week1.day1;

public class Returnlooping {
	
public static void main(String[] args) {
boolean value=true;
if(value==true){
		System.out.println("true");
		return;  //IF YOU PUT NO RETURN VALUE ,IT WILL BE -
		         //RETURN,other codes for execution
	}
System.out.println("other codes for execution");
}
}