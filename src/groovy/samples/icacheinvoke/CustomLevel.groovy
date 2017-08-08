package groovy.samples.icacheinvoke

import java.util.logging.Level



public class CustomLevel extends Level {
	//public static def c=new CustomLevel("e",Level.SEVERE.intValue() + 1)
	public CustomLevel(String name,int l)
	{
		super(name,l)
	}
}


