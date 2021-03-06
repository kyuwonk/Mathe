package bomanthis.mathe;
//Creats a level 1 question Addition/Subtraction

public class LevelOneQuestion extends Questions{
	
	private int x;
	private int y;
	private int answer;
	private String n;
	
	//constructors
	
	public LevelOneQuestion(){
		x = (int)(Math.random()*100);
		y = (int)(Math.random()*100);
		if(y % 2 == 0){
			n = " - ";
			answer = x - y;
		} else {
			n = " + ";
			answer = x + y;
		}
	}
	
	//accessor methods
	
	public String getQuestion(){
		return (x + n + y + " = ");
	}
	
	public String getRightAnswer(){
		return ("" + answer);
	}
	
	public String getWrongAnswer(){
		int n = (int)(Math.random()*150);
		while (answer == n)
			n = (int)(Math.random()*150);
		if(answer >= 0)
			return ("" + n);
		else
			return ("" + (n *(-1)));
	}
	
}
