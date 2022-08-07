package Tests;

import java.util.Date;
import java.util.Locale;
import static java.util.Locale.*;
import java.text.DateFormat;
import static java.text.DateFormat.*;
import java.text.NumberFormat;
import static java.text.NumberFormat.*;


public class TestsDifferentLocales {

	public static void main(String[] args) {
		Date now=new Date();
		double d=6758.8763;
		System.out.println("Date is: "+now);
		DateFormat df=null;
		NumberFormat nf=null;
		Locale[]locales= {UK,FRANCE,GERMANY,ITALY,US};
		int[] styles= {SHORT,MEDIUM,LONG,FULL};
		String[] styleDesc= {"SHORT","MEDIUM","LONG","FULL"};
		}

	}

