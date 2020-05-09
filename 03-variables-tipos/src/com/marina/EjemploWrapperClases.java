package com.marina;

public class EjemploWrapperClases {
	
		public void ejemplo() {
			float fPrimitivo = 10;
			Float fWrapper = fPrimitivo; //autoboxing
			fPrimitivo = fWrapper * 2; //unboxing
			
			String valorNumerico = "10";
			
			/* int x = fPrimitivo;*/  //no seria posible
			int y = fWrapper.intValue();
		}
}
