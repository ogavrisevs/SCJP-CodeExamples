package chap6.Exam.Question12;

import java.io.Serializable;

public class Question12 {

}

class Vehicle {
}

class Wheels {
}

class Car extends Vehicle implements Serializable {
}

class Ford extends Car {
}

class Dodge extends Car {
	Wheels w = new Wheels();
}
