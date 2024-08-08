package abstraction;

	abstract class Animal {
		abstract void sound();
	}
	
	class Lion extends Animal {
		void sound() {
			System.out.println("Lion roars");		
		}
	}
	
	class Tiger extends Animal {
		void sound() {
			System.out.println("Tiger growls");		
		}
	}
	
	public class AbstractCls {
		public static void main(String[] args) {
			Animal s = new Lion();
			s.sound();
			Animal tiger = new Tiger();
			tiger.sound();
//			s = new Tiger();
//			s.sound();
		}
	}


