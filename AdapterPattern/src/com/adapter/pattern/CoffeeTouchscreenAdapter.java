package com.adapter.pattern;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

	OldCoffeeMachine oldMachine;
	
		//Constructor
	/*
	 * public CoffeeTouchscreenAdapter() { //this.oldMachine = machine; }
	 */
	public CoffeeTouchscreenAdapter(OldCoffeeMachine machine) {
		this.oldMachine = machine;
	}
		
	@Override
	public void chooseFisrtSelection() {
		oldMachine.selectA();
		
	}
	
		public void chooseSecondSelection(){
			oldMachine.selectB();
			
		}

	
	
}
