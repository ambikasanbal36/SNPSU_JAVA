package String.StringOperationsDemo;

import java.util.Locale;

public class StringOperationsDemo {
    static void main(String[] args) {
        String s1="Java Programmimg";
        String s2=new String("Java Programming");
        System.out.println("Original string:"+s1);
        //length
        System.out.println("Length is"+s1.length());
        //charAt()
        System.out.println("Character is index 2:"+s1.charAt(2));
        //toUppercase() and toLowercase
        System.out.println("UPPERCASE :"+s1.toUpperCase());
        System.out.println("LOWERCASE :"+s2.toLowerCase());
        //equal() and==
        System.out.println("using ==:"+s1==s2);
        System.out.println("using equals");
        //compareTo()
        System.out.println("using compareTo():"+s1.compareTo(s2));
        //substring
        System.out.println("Substring (0 to 4):"+s1.substring(0,4));
        //contain()
        System.out.println("Contains 'Program':"+s1.contains("program"));
        //indexDf()
        System.out.println("Index of 'a':"+s1.indexOf('a'));
        //replace
        System.out.println("Replace java with Python:"+s1.replace("Java","Python"));

        //startWith() and endWith()
        System.out.println("Starts with Java :"+s1.startsWith("Java"));
        System.out.println("Ends with mming:"+s1.endsWith("mming"));

        //trim
        String s3="   Ambika   ";
        System.out.println("Before Trim :"+s3);
        System.out.println("After Trim :"+s3.trim());

        //concat()
        System.out.println("Concat() :"+s1.concat("Language"));

        //isEmpty()
        String str ="";
        System.out.println("Is Empty?:" +str.isEmpty());

        //split()
        String sentence="Java is a very easy language to learn!";
        String[] arr=sentence.split(" ");
        System.out.println("After split!:");
        for(String i: arr){
            System.out.println(i);
        }

    }
}
