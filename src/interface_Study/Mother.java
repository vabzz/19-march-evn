package interface_Study;

public interface Mother 
{

	void receipe();
	void care();
	default void money()
	{
		System.out.println("Mother money");
	}
}
