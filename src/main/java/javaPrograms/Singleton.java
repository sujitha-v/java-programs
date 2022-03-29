package javaPrograms;

public class Singleton {
	public static Singleton instance;
private Singleton(){
}
public static void main(String[] args) {
	getInstance();
}
private static synchronized Singleton getInstance() {
	if(instance==null)
	{
		instance=new Singleton();
	}
	return instance;
}
}
