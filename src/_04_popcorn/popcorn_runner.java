package _04_popcorn;

import javax.swing.JOptionPane;

public class popcorn_runner {
	public static void main(String[] args) {

		String flaver = JOptionPane.showInputDialog("what flaver");
		Popcorn pop = new Popcorn(flaver);
		String time = JOptionPane.showInputDialog("How long do you want to cook it for?");
		int times = Integer.parseInt(time);
		Microwave heat = new Microwave();
		heat.putInMicrowave(pop);
		heat.setTime(times);
		heat.startMicrowave();
		pop.done();
	}
}
