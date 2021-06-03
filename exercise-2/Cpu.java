/*
Create CPU with attribute price. Create inner class
Processor (no. of cores, manufacturer)and static nested class
RAM (memory, manufacturer). Create an object of CPU and
print information of Processor and RAM.
*/

class Cpu{									//class cpu with attribute price
	double price=30000;
	class Processor{							//inner class processor
		int core=3;
		String manufacturer="Broadcom Inc.";
		void display(){							//method in inner class to display data
			System.out.println("Core : "+core);
			System.out.println("Manufacturer : "+manufacturer);
			System.out.println("Price : "+price);
		}
	}
	void display_Inner() {							
      		Processor p = new Processor();					//object of processor
      		p.display();							//invokation of method display
   	}

	static class NestedRAM{							//nested class 
		String memory="8 GB";
		String manufacturer="Intel-iball";
		void display(){							//method to display 
			System.out.println("Memory : "+memory);
			System.out.println("Manufacturer : "+manufacturer);
	
		}
	}

	public static void main(String args[]){
		Cpu c=new Cpu();						//object of cpu
		c.display_Inner();						//method invokation of display_inner
		Cpu.NestedRAM n=new Cpu.NestedRAM();
		n.display();
	}
}

/* Output

Core : 3
Manufacturer : Broadcom Inc.
Price : 30000.0
Memory : 8 GB
Manufacturer : Intel-iball

*/
