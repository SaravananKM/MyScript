package week3.day1.OOPS;

public class AutomationClass extends MultipleLanguage implements Language,TestTool{
	public void selenium() {
		System.out.println("This is Test Tool Interface method selenium() implemented here in AutomationClass");		
	}

	public void java() {
		System.out.println("This is Language Interface method java() implemented here in AutomationClass");			
	}

	@Override
	void ruby() {
		System.out.println("This is MultipleLanguage Abstract Class method ruby() implemented here in AutomationClass");			
	}
	void csharp() {
		System.out.println("This is AutomationClass Class own method csharp()");			
	}
	public static void main(String[] args) {
		AutomationClass a=new AutomationClass();
		a.selenium();
		a.java();
		a.ruby();
		a.csharp();
	}
}
