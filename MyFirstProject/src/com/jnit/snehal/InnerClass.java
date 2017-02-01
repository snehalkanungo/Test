package com.jnit.snehal;
//Annonymous inner class
public class InnerClass {

	interface SaleItems{
		 public void salePrice();
	}
	
	public class AllOnSale implements SaleItems{
		  public void salePrice(){
			System.out.println("one day sale");
		}
	}
	
//line 16-21 are syntax of annonymous inner class.	
	void test(){
		SaleItems s = new SaleItems() {
			@Override
			public void salePrice() {
				System.out.println("Everything is of one dollar");			
			}
		};
	}

	//line  26-37 is another way to implement annonymous inner class.
	void test(SaleItems s1){}
	void testSoon(){
		test( new SaleItems() {
			
			@Override
			public void salePrice() {
				// TODO Auto-generated method stub
				
			}
		});
		test(() -> System.out.println("End sale"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
