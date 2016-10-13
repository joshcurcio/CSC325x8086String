public class String8086 
{
	private String turnToCharArray;
	private char[] charArrayOfString;
	
	public String8086(String turnToCharArray)
	{
		this.turnToCharArray = turnToCharArray;
		this.charArrayOfString = new char[64];
	}
	
	public void populateCharArray()
	{
		int i = 0;
		while(this.turnToCharArray.charAt(i) != '$')
		{
			if(i > 63)
			{
				System.err.print(this.turnToCharArray + " is too large! ");
			}
			
			this.charArrayOfString[i] = this.turnToCharArray.charAt(i);
			i++;
		}
		this.charArrayOfString[i] = this.turnToCharArray.charAt(i);
		
	}
	
	public void printCharArray()
	{
		int i = 0;
		while(this.turnToCharArray.charAt(i) != '$')
		{
			System.out.print(this.turnToCharArray.charAt(i));
			i++;
		}
	}
}
