package com.oopsConcepts.inheritance;

public class MultilevelInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritanceGrandChild child = new MultilevelInheritanceGrandChild();
		child.showGrandParent();
		child.showParent();
		child.showChild();
		child.showGrandChild();
	}

}
