package com.puzzle.robot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puzzle.robot.model.Robot;

@RestController
@RequestMapping("/api")
public class RobotController {

	@Autowired
	Robot robot;

	@GetMapping("/robot")
	public Robot getPlaces() throws Exception {

		if (!robot.isPresent())
			throw new RobotMissingException("Robot is Missing");
		return robot;
	}
	// place a new Robot on the table

	@PostMapping("/robot")
	public Robot placeRobot(@Valid @RequestBody Robot robotResource) throws Exception {
		robot = robotResource;
		//ControllerLinkBuilder selfLink = linkTo(methodOn(this.getClass()).placeRobot(robot));
		//ControllerLinkBuilder linkToMove = linkTo(methodOn(this.getClass()).move());
		//robot.add(selfLink.withSelfRel());
		//robot.add(linkToMove.withRel("Move Robot"));
		return robot;
	}

	// Turn the robot to the right
	@PutMapping("/robot/right")
	public Robot turnRight() throws Exception {
		if (!robot.isPresent())
			throw new Exception("Robot is Missing");
		robot.turnRight();
		return robot;
	}

	// Turn the robot to the left
	@PutMapping("/robot/left")
	public Robot turnLeft() throws Exception {
		if (!robot.isPresent())
			throw new Exception("Robot is Missing");
		robot.turnLeft();
		return robot;
	}

	// Move the robot one step forward
	@PutMapping("/robot/move")
	public Robot move() throws Exception {
		if (!robot.isPresent())
			throw new Exception("Robot is Missing");
		robot.move();
		return robot;
	}

}
