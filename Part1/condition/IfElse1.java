class IfElse1{
public static void main(String[]args){
char c = 'a';
if(c>='A' && c<='Z')
{
char lowercase = (char) (c+32);
System.out.println("character is in lower case");
}
else{
System.out.println("character is in upper case");
}
}
}