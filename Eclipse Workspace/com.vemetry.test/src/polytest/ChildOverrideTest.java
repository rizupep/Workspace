package polytest;

public class ChildOverrideTest extends ParentOverrideTest {
public static void main(String[] args) {
	ChildOverrideTest c = new ChildOverrideTest();
	c.calci();
	
}
public static void add()
{
	System.out.println(" Child add");
}
public void calci() // for override static wont come
{
	super.add();
	add();
	this.add();
}
}
