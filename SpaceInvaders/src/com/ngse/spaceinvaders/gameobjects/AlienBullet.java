package com.ngse.spaceinvaders.gameobjects;

import com.ngse.spaceinvaders.resources.images.BufferedImageResource;

public class AlienBullet extends Bullet {

	public AlienBullet(double x, double y, double speed, double direction) {
		super(x, y, speed, direction, BufferedImageResource.AlienBullet);
		;
		owner = Owner.ALIEN;
	}

}