package com.yandex.kbelyako;

import java.util.concurrent.TimeUnit;

public class Dock  {
	
	private boolean free;
	private String name;
	
	
	public Dock(String name) {
		super();
		this.free=true;
		this.name=name;
	}



	public boolean isFree() {
		return free;
	}



	public synchronized void unloadShip(Ship ship) {
		this.free=false;
		for (int i = 0; i < ship.getBoxesNumber(); i++) {
			System.out.println("Unloadin box ¹:"+(i+1)+" from "+ship.getName()+" in Dock N "+this.name);
			try {
				TimeUnit.SECONDS.sleep(1/2);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			} 
		}
		ship.setUnloaded(true);
		this.free=true;
	}

}
