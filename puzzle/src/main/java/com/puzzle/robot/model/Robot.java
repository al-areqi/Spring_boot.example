package com.puzzle.robot.model;

import org.springframework.stereotype.Component;

@Component
public class Robot  {
	public enum Directions {
		EAST, WEST, NORTH, SOUTH
	}

	final static int Dimensions = 5;
	private int x_coordinates;
	private int y_coordinates;
	private Directions face_dirction;

	public int getX_coordinates() {
		return x_coordinates;
	}

	public void setX_coordinates(int x_coordinates) {
		this.x_coordinates = x_coordinates >= 0 && x_coordinates < Dimensions ? x_coordinates : 0;
	}

	public int getY_coordinates() {
		return y_coordinates;
	}

	public void setY_coordinates(int y_coordinates) {
		this.y_coordinates = y_coordinates >= 0 && y_coordinates < Dimensions ? y_coordinates : 0;
	}

	public Directions getFace_dirction() {
		return face_dirction;
	}

	public void setFace_dirction(Directions face_dirction) {
		this.face_dirction = face_dirction;
	}

	public static int getDimensions() {
		return Dimensions;
	}

	public void move() {
		switch (face_dirction) {
		case EAST:
			if (this.x_coordinates != Dimensions - 1)
				this.x_coordinates++;
			break;

		case WEST:
			if (this.x_coordinates != 0)
				this.x_coordinates--;
			break;

		case NORTH:
			if (this.y_coordinates != Dimensions - 1)
				this.y_coordinates++;
			break;

		case SOUTH:
			if (this.y_coordinates != 0)
				this.y_coordinates--;
			break;
		}

	}

	public void turnLeft() {

		switch (face_dirction) {
		case EAST:
			this.face_dirction = Directions.NORTH;
			break;
		case WEST:
			this.face_dirction = Directions.SOUTH;
			break;
		case NORTH:
			this.face_dirction = Directions.WEST;
			break;
		case SOUTH:
			this.face_dirction = Directions.EAST;
			break;
		}

	}

	public void turnRight() {
		switch (face_dirction) {
		case EAST:
			this.face_dirction = Directions.SOUTH;
			break;
		case WEST:
			this.face_dirction = Directions.NORTH;
			break;
		case NORTH:
			this.face_dirction = Directions.EAST;
			break;
		case SOUTH:
			this.face_dirction = Directions.WEST;
			break;
		}

	}

	public boolean isPresent() {
		// TODO Auto-generated method stub
		if (this.face_dirction == null)
			return false;
		else
			return true;
	}

}
