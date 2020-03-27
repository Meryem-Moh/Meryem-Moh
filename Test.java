package com.adapter.pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OldCoffeeMachine old1 = new OldCoffeeMachine();
		OldCoffeeMachine old2 = new OldCoffeeMachine();
		old1.selectA();
		old2.selectB();
		
		
		CoffeeTouchscreenAdapter adapter1 = new CoffeeTouchscreenAdapter(old1);
		CoffeeTouchscreenAdapter adapter2 = new CoffeeTouchscreenAdapter(old2);
		
		adapter1.chooseFisrtSelection();
		adapter2.chooseSecondSelection();
	}

}
