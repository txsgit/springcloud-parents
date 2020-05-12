package com.txs.utils;

import java.util.List;

public class Test {
	   public int aaa() {
	        int x = 1;

	        try {
	        	System.out.println("***********");
	            return ++x;
	        } catch (Exception e) {

	        } finally {
	        	System.out.println("###########");
	        	return ++x;
	        }
	       // return x;
	    }

	    public static void main(String[] args) {
	      /*  Test t = new Test();
	        int y = t.aaa();
	        System.out.println(y);*/
              
//	    	Son son=new Son();
//	    	
//            System.out.println(son.getname("son"));
//            son.hi("son");
//	    	StringBuilder
//	    	StringBuffer
//	    	String s1=new String(String.valueOf(11));
//	    	String s2=s1.intern();
//	    	System.out.println(s1==s2);
	    	
//	    	String str2=new StringBuilder().append("tt").append("ss").toString();
//	    	System.out.println(str2.intern()==str2);
//	    	
//	    	String str1=new StringBuilder("ja").append("va").toString();
//	    	System.out.println(str1.intern()==str1);
	    	
//	    String str3=new String("ja")+new String("va");
//	    System.out.println(str3.intern()==str3);
	    
//	    String str4=new String("vw")+new String("ss");
//	    System.out.println(str4.intern()==str4);
	    
//	    String str5="ja"+"va";
//	    System.out.println(str5.intern()==str5);
	    	
//	    	String s1 = "AB";
//	    	String s2 = new String("AB");
//	    	String s3 = "A";
//	    	String s4 = "B";
//	    	String s5 = "A" + "B";
//	    	String s6 = s3 + s4;
//	    	System.out.println(s1 == s2); // false
//	    	System.out.println(s1 == s2.intern()); // true
//	    	System.out.println(s1 == s5); // true
//	    	System.out.println(s1 == s6); // false
//	    	System.out.println(s1 == s6.intern()); // true
	    	
	    	
//	    	String str1 = new String("SEU")+ new String("Calvin");    
//	    	System.out.println(str1.intern() == str1); 
//	    	System.out.println(str1 == "SEUCalvin");
	    	
//	    	String str2 = "SEUCalvin";//新加的一行代码，其余不变
//	    	String str1 = new String("SEU")+ new String("Calvin");    
//	    	System.out.println(str1.intern() == str1); 
//
//           System.out.println(str1 == "SEUCalvin");
	    	
//	    	String str1=new String("java");
//	    	System.out.println(str1.intern()==str1);
//	    	
	    	
//	    	 String s = new String("1");
//	    	    s.intern();
//	    	    String s2 = "1";
//	    	    System.out.println(s == s2);
//	    	 
//	    	    String s3 = new String("1") + new String("1");
//	    	    s3.intern();
//	    	    String s4 = "11";
//	    	    System.out.println(s3 == s4);
	    	
	    	Integer a=1;
	    	Integer b=2;
	    	Integer c=3;
	    	Integer d=3;
	    	Integer e=321;
	    	Integer f=321;
	    	Long g=3L;
	    	System.out.println(c==d);//true
	    	System.out.println(e==f);//false
	    	System.out.println(c==(a+b));//true
	    	System.out.println(c.equals(a+b));//true
	    	System.out.println(g==(a+b));//true
	    	System.out.println(g.equals(a+b));//false
	    	
	    }
	    
	   
}
