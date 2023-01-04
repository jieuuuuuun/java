package ch06.ex06.case06;

import ch06.ex06.case04.Appliance;
import ch06.ex06.case05.Electronic;

public interface HomeAppliance extends Appliance, Electronic{
	
}
//인터페이스에서 인터페이스를 상속받을때에는 extends를 쓴다.