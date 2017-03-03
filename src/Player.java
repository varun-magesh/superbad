import java.awt.Graphics;

public class Player extends Character{
	public static final int WIDTH = 50;
	public static final int HEIGHT = 50;
	private boolean falling;
	public Player (Vector loc) {
		super(loc, new Vector(WIDTH, HEIGHT));
		falling = true;
	}

	public void move(String s){
		if(s.equals("left")){

		}
		else if(s.equals("right")){

		}
		else if(s.equals("jump")){

		}
		else if (s.equals("crouch")) {

		}

	}

	@Override
	public void move() {
		/**This is for all non-user input based actions like gravity */
		if(falling) velocity.y += SuperbadGameMap.GRAVITY;
		else falling = true;
		location = location.add(velocity);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(location.x, location.y, dimension.x, dimension.y);
	}

	@Override
	public void handleCollision(MovingObject m) {
		// TODO Auto-generated method stub
		if(m instanceof Platform) {
			velocity.y = 0;
			falling = false;
		}
	}

}
