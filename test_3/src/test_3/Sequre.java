package test_3;

public class Sequre {

	
	private float width;
	
	Sequre(float w)
	{
		this.width=w;
	}
	
	public int getArea()
	{
		return (int)Math.ceil((width*width));
	}
}
