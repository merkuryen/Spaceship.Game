package com.game.src.main;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;

import com.game.src.main.Game.STATE;
import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;
import com.game.src.main.classes.EntityC;
import com.game.src.main.classes.EntityD;
import com.game.src.main.classes.EntityE;



public class Controller {

	private LinkedList<EntityA> ea = new LinkedList<EntityA>();
	private LinkedList<EntityB> eb = new LinkedList<EntityB>();
	private LinkedList<EntityC> ec = new LinkedList<EntityC>();
	private LinkedList<EntityD> ed = new LinkedList<EntityD>();
	private LinkedList<EntityE> ee = new LinkedList<EntityE>();
	
	EntityA enta;
	EntityB entb;
	EntityC entc;
	EntityD entd;
	EntityE ente;
	
	private Textures tex;
	Random r = new Random();
	private Game game;
	
	public Controller(Textures tex, Game game) {
		this.tex = tex;
		this.game = game;

	}
	
	public void createEnemy(int enemy_count) {
		for(int i = 0; i < enemy_count; i++) {
			addEntity(new Enemy(0, r.nextInt(465 - 60) + 60, 100, 5, tex, this, game));
		}
	}
	
	public void createEnemylvl2(int enemy_count) {
		for(int i = 0; i < enemy_count; i++) {
			
			int rNum = r.nextInt(2);
			if(rNum == 1)
				addEntity(new Enemy(0, r.nextInt(720 - 60) + 60, 100, 5, tex, this, game));

			else
				addEntity(new Enemy(r.nextInt((Game.WIDTH * Game.SCALE)), 0, 100, 5, tex, this, game));
				
		}
	}
	
	public void createalienTYPE3(EntityD alienTYPE3) {
//			addEntity( new alienTYPE3(710, 300, 10000, 5, tex, this, game));
			addEntity(alienTYPE3);
	}
	


	public void shooting(double x, double y, double xVel, double yVel, double dir) {
		addEntity(new Bullet(x, y, xVel, yVel, dir, 10, 5, tex, this, game));
	}
//	public void alienShooting(EntityE alienProjectile) {
//		addEntity(alienProjectile);
//	}
	
//	public void randomMeteor(int meteorQuantity) {
//			addEntity(new Meteor(r.nextInt((640 - 320) + 320), 60, 100, 5, tex, game, this));
//		
//			meteorQuantity--;
//	}
//	
	public void tick() {
		//A CLASS
		for(int i = 0; i < ea.size(); i++) {
			enta = ea. get(i);
			
			enta.tick();
		}
		
		//B CLASS
		for(int i = 0; i < eb.size(); i++) {
			entb = eb. get(i);
			
			entb.tick();
		}
		
		//C CLASS
		for(int i = 0; i < ec.size(); i++) {
			entc = ec. get(i);
			
			entc.tick();
		}
		
		//D CLASS
		for(int i = 0; i < ed.size(); i++) {
			entd = ed. get(i);
			
			entd.tick();
		}
		
		//E CLASS
		for(int i = 0; i < ee.size(); i++) {
			ente = ee. get(i);
			
			ente.tick();
		}
	}
	
	public void render(Graphics g) {
		//A CLASS
		for(int i = 0; i < ea.size(); i++) {
			enta = ea. get(i);
			
			enta.render(g);
		}
		
		//B CLASS
		for(int i = 0; i < eb.size(); i++) {
			entb = eb. get(i);
			
			entb.render(g);
		}
		
		//C CLASS
		for(int i = 0; i < ec.size(); i++) {
			entc = ec. get(i);
			
			entc.render(g);
		}
		
		//D CLASS
		for(int i = 0; i < ed.size(); i++) {
			entd = ed. get(i);
			
			entd.render(g);
		}
		
		//E CLASS
		for(int i = 0; i < ee.size(); i++) {
			ente = ee. get(i);
			
			ente.render(g);
		}
	}
	
	//A CLASS
	public void addEntity(EntityA block) {
		ea.add(block);
	}
	
	public void removeEntity(EntityA block) {
		ea.remove(block);
	}
	
	//B CLASS
	public void addEntity(EntityB block) {
		eb.add(block);
	}
	
	public void removeEntity(EntityB block) {
		eb.remove(block);
	}
	
	//C CLASS
	public void addEntity(EntityC block) {
		ec.add(block);
	}
	
	public void removeEntity(EntityC block) {
		ec.remove(block);
	}
	
	//D CLASS
	public void addEntity(EntityD block) {
		ed.add(block);
	}
	
	public void removeEntity(EntityD block) {
		ed.remove(block);
	}
	
	//E CLASS
	public void addEntity(EntityE block) {
		ee.add(block);
	}
	
	public void removeEntity(EntityE block) {
		ee.remove(block);
	}
	
	
	public LinkedList<EntityA> getEntityA(){
		return ea;
	}
	public LinkedList<EntityB> getEntityB(){
		return eb;
	}
	public LinkedList<EntityC> getEntityC(){
		return ec;
	}
	public LinkedList<EntityD> getEntityD(){
		return ed;
	}
	public LinkedList<EntityE> getEntityE(){
		return ee;
	}

	
}
