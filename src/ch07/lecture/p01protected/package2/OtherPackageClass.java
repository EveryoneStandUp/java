package ch07.lecture.p01protected.package2;

import ch07.lecture.p01protected.package1.*;

public class OtherPackageClass {
	public void someMethod() {
		Super01 o1 = new Super01();
//		o1.method1(); // 다른 패키지여서 안됨
	}
}
