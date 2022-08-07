package Tests;

import java.text.NumberFormat;
import java.text.NumberFormat.*;

public class TestnumberFormat {

	public static void main(String[] args) {
		double d=56789.7352;
		System.out.println("double is: "+d);
		NumberFormat nf=null;
		nf=NumberFormat.getInstance();
		System.out.println("Formated as number: "+nf.format(d));
		nf.setMaximumIntegerDigits(2);
		nf.setMaximumFractionDigits(2);
		System.out.println("Formated as number with max 2 digits for int/frac: "+nf.format(d) );
		nf=NumberFormat.getCurrencyInstance();
		System.out.println("Formatted as currency : "+nf.format(d));

	}

}
