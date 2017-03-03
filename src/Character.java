import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Character implements MovingObject, Drawable{
	protected Vector location;
	protected Vector dimension;
	protected Vector velocity;
	
	public Character (Vector loc, Vector dim) {
		location = loc;
		dimension = dim;
		velocity = new Vector(0, 0);
	}
	
	public abstract void move();

	public Rectangle getBoundingRect() {
		return new Rectangle(location.x, location.y, dimension.x, dimension.y);
		//We need to have the location and Dimension variables for this.
	}
	@Override
	public Vector getLocation() {
		// TODO Auto-generated method stub
		return location;
	}
	@Override
	public boolean collision(MovingObject r) {
		/** True if two MovingObjects are colliding **/
		if(r == null || r.getBoundingRect() == null) return false;
		return (getBoundingRect()).intersects(r.getBoundingRect());
	}
	
	@Override
	public abstract void draw(Graphics g);
	@Override
	public abstract void handleCollision(MovingObject m);

}
