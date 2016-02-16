package demo.mars;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoverTest {

	@Test
	public void verify_rover_exists() {
		Rover r = new Rover();

	}

	@Test
	public void check_rover_position() {
		Rover r = new Rover();
		assertNotNull(r.getX());
		assertNotNull(r.getY());

	}

	@Test
	public void check_rover_orientation_exists() {
		Rover r = new Rover(0, 0, 'N');
		assertNotNull(r.getOrientation());
	}

	@Test
	public void explore_to_55N_takes_to_55N() {
		Rover r = new Rover(0, 0, 'N');
		r.explore(1, 2, 'N');
		assertTrue(r.getX() == 1);
		assertTrue(r.getY() == 2);
		assertTrue(r.getOrientation() == 'N');

	}

	@Test
	public void check_boundary_scale_xy() {

		assertNotNull(Rover.xBoundary);
		assertNotNull(Rover.yBoundary);

	}

	@Test
	public void set_boundary_position() {

		Rover.xBoundary = 5;
		Rover.yBoundary = 5;
		assertTrue(Rover.xBoundary == 5);
		assertTrue(Rover.yBoundary == 5);

	}

	@Test
	public void move_from_11N_takes_to_12N() {
		Rover r = new Rover(1, 1, 'N');
		r.move();
		assertTrue(r.getX() == 1);
		assertTrue(r.getY() == 2);

	}

	@Test
	public void move_from_11S_takes_to_10S() {
		Rover r = new Rover(1, 1, 'S');
		r.move();
		assertTrue(r.getX() == 1);
		assertTrue(r.getY() == 0);

	}

	@Test
	public void move_from_11E_takes_to_21E() {
		Rover r = new Rover(1, 1, 'E');
		r.move();
		assertTrue(r.getX() == 2);
		assertTrue(r.getY() == 1);

	}

	@Test
	public void move_from_11W_takes_to_01W() {
		Rover r = new Rover(1, 1, 'W');
		r.move();
		assertTrue(r.getX() == 0);
		assertTrue(r.getY() == 1);
	}

	@Test
	public void check_rotatation_left(){
		Rover r = new Rover(0, 0, 'E');
		r.rotateLeft();
		assertTrue(r.getOrientation()=='N');
	}
	
	@Test
	public void check_rotatation_right(){
		Rover r = new Rover(0, 0, 'E');
		//r.rotateRight();
		assertTrue(r.getOrientation()=='N');
	}
}
