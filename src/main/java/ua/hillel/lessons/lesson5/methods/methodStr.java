package ua.hillel.lessons.lesson5.methods;

public class methodStr {
    public static void main(String[] args) {
        stringReplace();
    }

    public static void stringReplace(){
        String str = "Hello Alex";
        String str2 = str.replace("Alex", "Maks");
        System.out.println(str2);
    }
    public static void stringSubString(){
        String str = "Hello World";
        System.out.println(str.substring(4,7));
        //обрезает в диапозоне
    }
    public static void stringIndexOf(){
        String str = "Hello World";
        System.out.println(str.indexOf("o"));
        //System.out.println(str.lastIndexOf("o")); возвращает последнюю букву о
    }
    public static void stringCharAt(){
        String str = "Hello World";
        System.out.println(str.charAt(1));
    }
    public static void stringContains(){
        String str = "Hello world";
        if (str.contains("world")){
            System.out.println("Str are contains");
        }else {
            System.out.println("Str aren't contains");
        }
    }
    public static void stringEquals(String str, String str2){
        if (str.equals(str2)){
            System.out.println("Str are equals");
        } else{
            System.out.println("Str are not equals");
        }

    }
    public static void stringToUpperCase(){

    }

    public static void stringEndsWith(){
        String str = "Hello World";
        boolean end1 = str.endsWith("World");
        boolean end2 = str.endsWith("Alex");
        System.out.println(end1);
        System.out.println(end2);
    }
    public static void stringTrim(){
        String str = "     Hello ";
        String str2 = "Maks";
        System.out.println(str);
        System.out.println(str.trim());
    }
    public static void stringConcat(){
        String str = "Hello ";
        String str2 = "Maks";
        System.out.println(str.concat(str2));

        System.out.println(str.length());
    }
    public static void stringLength(){
        String str = "Hello world";
        System.out.println(str.length());
    }
}
