package com.java.exceptions;

public class DemoTryCatch {

	// global vars
	String course="selenium";

	public static void main(String[] args) {
		DemoTryCatch dtc = new DemoTryCatch();
//		dtc.testBatch2();
		try { //try block
			System.out.println(dtc.course.length());
//			System.out.println(10/0);
			int[] a = {2,4};
			
			System.out.println(a[2]);
			
		} catch (NullPointerException e) { //catch block
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
		finally {
			
		}
	}

//	public void testBatch2() {
//		try { //try block
//			System.out.println(course.length());
////			System.out.println(10/0);
//			int[] a = {2,4};
//			
//			System.out.println(a[2]);
//			
//		} catch (NullPointerException e) { //catch block
//			System.out.println(e);
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}catch (Exception e) {
//			System.out.println(e);
//		}


//	}

}
