package com.yandex.kbelyako;

public class Ship implements Runnable {
	
	private String name;
	private int boxesNumber;
	private Thread thr;
	private Dock dock;
	private Port port;
	private boolean unloaded;
	
	
	
	public Ship(String name, int boxesNumber,Port port) {
		super();
		this.name = name;
		this.boxesNumber = boxesNumber;
		this.thr=new Thread(this);
		this.port=port;
	}
	

	public Dock getDock() {
		return dock;
	}



	public boolean isUnloaded() {
		return unloaded;
	}


	public void setUnloaded(boolean unloaded) {
		this.unloaded = unloaded;
	}


	public void setDock(Dock dock) {
		this.dock = dock;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public int getBoxesNumber() {
		return boxesNumber;
	}


	public void setBoxesNumber(int boxesNumber) {
		this.boxesNumber = boxesNumber;
	}


	@Override
	public void run() {
		for(;this.unloaded!=true;){
			this.port.unloadShips(this);
		}
	
		
		//this.unloaded=true;
		
	}
	
	

}
