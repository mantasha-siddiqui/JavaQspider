class Positive{
public static void main(String[]args){
int a = 5;
System.out.println((a>0) ? "a is positive" : "a is not positive");
int b = -7;
System.out.println((b<0) ? "b is negative" : "b is not negative");
int c = 0;
System.out.println((c==0) ? "c is zero" : "c is not zero");
int d = 9;
System.out.println((d<10) ? "d is less than 10" : "d is not less than 10");
int e = 6;
System.out.println((e>=5) ? "e is greater than or equal to 5" : "e is not greater than or equal to 5");
int f = 9;
System.out.println((f%3==0) ? "f is divisible by 3" : "f is not divisible by 3");

char ch ='A';
String result = (ch >='A' && ch <='Z') ? (ch + " is in upper case") : (ch + " is not in upper case");
System.out.println(result);

char cht ='a';
String res = (cht >='a' && cht <='z') ? (cht + " is in lower case") : (cht + " is not in lower case");
System.out.println(res);

char ch1 ='A';
String result1 = (ch1 =='A' || ch1 =='E' || ch1 =='I' || ch1 == 'O' || ch1 == 'U') ? (ch1 + " is in upper case vowel") : (ch1 + " is not in upper case vowel");
System.out.println(result1);

char ch2 ='a';
String result2 = (ch2 =='a' || ch2 =='e' || ch2 =='i' || ch2 == 'o' || ch2 == 'u') ? (ch2 + " is in lower case vowel") : (ch2 + " is not in lower case vowel");
System.out.println(result2);

char ch3 ='F';
String result3 = (ch3 =='A' || ch3 =='E' || ch3 =='I' || ch3 == 'O' || ch3 == 'U') ? (ch3 + " is vowel") : (ch3 + " is not  vowel");
System.out.println(result3);

char ch4 ='@';
String result4 = ((ch4 < 'A' || (ch4 > 'Z' && ch4 < 'a') || ch4 > 'z') &&
        (ch4 < '0' || ch4 > '9')) ? (ch4 + " is special") : (ch4 + " is not special");
System.out.println(result4);

char ch5 = '9';
String result5 = (ch5 >= '0' && ch5 <= '9') ? ch5 + " is a digit." : ch5 + " is not a digit.";
System.out.println(result5);

char ch6 = 'B';
String result6 = (ch6 >= 'D' && ch6 <= 'X') ? ch6 + " is between D to X " : ch6 + " is between D to X ";
System.out.println(result6);

int a9=12;
int b9=11;
int c9=13;

String result9 = (a9 > b9 && a9 > c9) ? "a9 is the largest" :
                 (b9 > a9 && b9 > c9) ? "b9 is the largest" :
                 (c9 > a9 && c9 > b9) ? "c9 is the largest" : "all are equal";
System.out.println(result9);

int div = 10;
String result7 = (div%3==0 && div%2==0) ? "it is divisible by 6" : "it is not divisible by 6";
System.out.println(result7);

}
}





