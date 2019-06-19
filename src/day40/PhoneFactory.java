package day40;

public class PhoneFactory {

	public static void main(String[] args) {
		
		Phone iphone = new Phone();
		iphone.type = "iphone Xs Max";
		iphone.os = "ios";
		iphone.capacity = 128;
		iphone.ring();
		iphone.dial(442489009238l);
		iphone.displayBrand();
		
//		System.out.println(iphone.type);
		
		Phone sumsung = new Phone();
		sumsung.type = "Sumsung 10e";
		sumsung.os = "Android";
		sumsung.capacity = 128;
		sumsung.ring();
		sumsung.dial(772374717401372l);
		
		
		
		System.out.println(sumsung.type);
		
		Phone pixel = new Phone();
		pixel.type = "Pixel one";
		pixel.os = "Google os";
		pixel.capacity = 128;
		pixel.ring();
		pixel.dial(4681736242354l);
		
		System.out.println(pixel.type);
	

	}
	

}
