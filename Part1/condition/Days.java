class Days{
public static void main(String[]args){
int c =1;
if(c==1||c==3||c==5||c==7||c==8){
System.out.println("31 days");
}
else if(c==2){
System.out.println("28or29 days");
}
else if(c==4||c==6||c==9)
{
System.out.println("30 days");
}
else{
System.out.println("invalid");
}
}
}