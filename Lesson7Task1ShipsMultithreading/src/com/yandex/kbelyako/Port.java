package com.yandex.kbelyako;

public class Port {
	
	private String name;
	private int docksNumber;
	private Dock [] dockArray;
	public Port(String name, int docksNumber) {
		super();
		this.name = name;
		this.docksNumber = docksNumber;		
		
        this.dockArray =  new Dock [docksNumber];
        for (int i = 0; i < dockArray.length; i++) {
        	 dockArray[i]=new Dock("Dock N"+i);
		}
	}
	public Port() {
		super();
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public void unloadShips(Ship ship) {
		
		for (int j = 0; j < docksNumber; j++) {
			if (dockArray[j].isFree()==true) {
				dockArray[j].unloadShip(ship);
			}
		}
	
			}
	

	
	
	
	
	

}
