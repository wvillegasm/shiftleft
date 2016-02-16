package demo.mars;



public class Rover {

	public static Integer xBoundary=0;
	public static Integer yBoundary=0;
	
	
	private Integer x;
	private Integer y;
	private Character orientation;

	public Rover(Integer x, Integer y) {

		this.x = x;
		this.y = y;
	}

	public Rover() {
		this.x = 0;
		this.y = 0;
	}

	public Rover(Integer x, Integer y, Character orientation) {
		super();
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Character getOrientation() {
		return orientation;
	}

	public void setOrientation(Character orientation) {
		this.orientation = orientation;
	}

	public void explore(int x, int y, Character orientation) {
		
		System.out.println("Rover is in position x:"+ this.x+" y: "+ this.y +" and orientation is "+this.orientation);
		this.setX(x);
		this.setY(y);
		this.setOrientation(orientation);
		System.out.println("Rover is in position x:"+ this.x+" y: "+ this.y +" and orientation is "+this.orientation);
		
	}

	public void move() {
		System.out.println("Moving ");
		if(this.orientation=='N')
			this.y++;
		else if(this.orientation=='S')
			this.y--;
		else if(this.orientation=='E')
			this.x++;
		else if(this.orientation== 'W')
			this.x--;
	}

	public void rotateLeft() {
		System.out.println("Rotateting to Left");
		
		if(this.orientation == 'N'){
			this.orientation = 'W';
		}else if(this.orientation == 'W'){
			this.orientation = 'S';
		}else if(this.orientation == 'S'){
			this.orientation = 'E';
		}else if(this.orientation == 'E'){
			this.orientation = 'N';
		}
	}

}
