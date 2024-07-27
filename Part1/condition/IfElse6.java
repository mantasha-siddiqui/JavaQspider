class IfElse6{
public static void main(String[]args){
char c = 'A';
if(c>='a' && c<='z')
{
char uppercase = (char) (c-32);
System.out.println("character is in lower case");
}
else{
System.out.println("character is in upper case");
}
}
}