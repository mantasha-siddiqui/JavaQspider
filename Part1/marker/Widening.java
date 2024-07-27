class Widening{
public static void main(String[]args){

byte b = 10;
int a = b; // ex of widening
System.out.println(a); // 10
System.out.println(b); // 10

float f = 5.6f;
double d = f;  //5.6

float y = (float) 'c'; // widening explicit
System.out.println(y);
}
}