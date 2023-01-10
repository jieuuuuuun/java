package home.ch07.home.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		Eraser eraser = new Eraser();
		Bag<Stationary> bag = new Bag();
		
		bag.add(pencil);
		bag.add(eraser);
		
		for(Stationary s: bag) {
			if(s instanceof Pencil pen) pen.write();
			if(s instanceof Eraser rubber) rubber.erase();
		}
	}
}
