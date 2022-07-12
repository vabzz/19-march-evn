package interface_Study;

public interface Father 
{

	void love();
	void nature();
	default void money()
	{
	System.out.println("Fathers money");	
	}
}
