package org.abs;

public class Second extends Details{
@Override
public void empName() {
	System.out.println("I like chocolates");
	super.empName();
}

public static void main(String[] args) {
Second s = new Second();
s.empName();
}	
@Override
	protected void employeeid() {
		System.out.println("I like candy");
		super.employeeid();
	}
}
