package ch06.ex07.case02;

public sealed class Pet permits Dog, Bird{

}
//permits허용범위
//sealed와 permits은 같이 써야한다.