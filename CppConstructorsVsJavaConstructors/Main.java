public class Main {
	public static class Parent {
		public Parent() {
			System.out.print("constructor ");
			doSomething();
		}

		public void callIt() {
			doSomething();
		}

		protected void doSomething() {
			System.out.println("parents doSomething");
		}
	}

	public static class Child extends Parent {
		public Child() {
			System.out.print("constructor ");
			doSomething();
		}

		protected void doSomething() {
			System.out.println("childs doSomething");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Parent:");
		Parent p = new Parent();
		p.callIt();

		System.out.println("\nChild:");
		Child c = new Child();
		c.callIt();
	}
}
