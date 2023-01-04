package ch06.ex06.case05;

import ch06.ex06.case04.Appliance;

public class Fridge implements Appliance, Electronic{
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() {return 0; }//리턴타입이 있기때문에 바디에 리턴값을 넣어준다.
	@Override public String getModelName() {return null;}
}