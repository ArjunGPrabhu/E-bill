import java.util.*;
class LappyZone
{
static void productmenu()
{
System.out.println("\n Select an option from the menu : ");
System.out.println("1. Laptops");
System.out.println("2. Mobiles");
System.out.println("3. Headphones");
System.out.println("4. Computer Accessories");
System.out.println("5. Mobile Acessories");
System.out.println("6. To Open Cart");
System.out.println("7. To Checkout and Exit");
}
float total;
String[] id=new String[50];
int[] price=new int[50];
String[] pname=new String[50];
int count=0;
Scanner s=new Scanner(System.in);
void addcart(String id,String pname,int price)
{
this.id[count]=id;
this.pname[count]=pname;
this.price[count]=price;
count++;
}
void cart(String name)
{
System.out.println("------------------------------- "+name+" cart----------
--------------------");
for(int i=0;i<count;i++)
System.out.println("Id = "+id[i]+" "+pname[i]+"->"+price[i]);
System.out.println("Total Cost : "+total);
if(count==0)
System.out.println("Cart is Empty!!");
}
void editcart(String name)
{
System.out.println("-------------------------------- "+name+" cart---------
---------------------");
for(int i=0;i<count;i++)
System.out.println("Id = "+id[i]+" "+pname[i]+"->"+price[i]);
System.out.println("Total Cost : "+total);
int ch,test=-1;
if(count==0)
{
System.out.println("Cart is Empty!!");
}
else
{
System.out.println();
System.out.println("To Remove Any Item From Cart Press 1 
");
System.out.println("To close Cart Press 0");
System.out.print("Enter your choice : ");
ch=s.nextInt();
if(ch==1)
{
System.out.print("Enter Id of item :");
String ch2=s.next();
for(int i=0;i<count;i++)
if(id[i].equals(ch2))
test=i;
if(test!=-1)
{
total=total-price[test];
count--;
System.out.println();
System.out.println(pname[test]+" 
Removed Suessfully!! from the cart");
for(int i=test;i<count;i++)
{
id[i]=id[i+1];
price[i]=price[i+1];
pname[i]=pname[i+1];
}
}
else
{
System.out.println("\n No item 
found!!");
}
}
}
}
void buylaptop()
{
String[] laptop= {"Dell inspiration 3520 ","Lenovo IdeaPad Slim 3 
","ASUS VivoBook K15 OLED","HP 15 Ryzen 5 Processor","Lenovo ThinkPad X1 
Nano"};
int[] pricelaptop={70750,88564,78654,61817,175800};
String[] id=new String[5];
int p;
System.out.print("\n\n-----------------Laptops(->Price)----------------");
for(int i=0;i<5;i++)
{
int k=i+1;
id[i]="L00"+k;
System.out.print("\nId = "+id[i]+" "+laptop[i]+" -> 
"+pricelaptop[i]);
}
System.out.print("\n Which laptop do you want to buy(Enter Id) : 
");
String checkid=s.nextLine();
for(p=0;p<5;p++){
if(id[p].equals(checkid))
break;
}
if(p<5)
{
System.out.println("\n"+laptop[p]+" is added to cart!");
total=total+pricelaptop[p];
addcart(id[p],laptop[p],pricelaptop[p]);
}
else
{
System.out.println("No item found");
}
}
void buymobile()
{
String[] laptop= {"Apple iPhone 14 Pro Max","Samsung Galaxy S23 
Ultra","Google Pixel 7 pro(12GB RAM)","Samsung Galaxy Z Fold 4 ","OnePlus 
Nord CE 2 Lite 5G"};
int[] pricelaptop={127999,104999,84000,118000,20000};
String[] id=new String[5];
String checkid;
int p;
System.out.print("\n\n---------------MOBILES(->Price)-------------------
-");
for(int i=0;i<5;i++)
{
int k=i+1;
id[i]="M00"+k;
System.out.print("\nId = "+id[i]+" "+laptop[i]+" -> 
"+pricelaptop[i]);
}
System.out.print("\n Which laptop do you want to buy(Enter Id) : 
");
checkid=s.nextLine();
for(p=0;p<5;p++)
if(id[p].equals(checkid))
break;
if(p<5)
{
System.out.println(laptop[p]+" is added to cart!");
total=total+pricelaptop[p];
addcart(id[p],laptop[p],pricelaptop[p]);
}
else
{
System.out.println("No item found");
}
}
void buyheadphone()
{
String[] laptop= {"Skullcandy","JBL Tune","boAt Rockerz","Sony 
WH-CH510","Bose NC700"};
int[] pricelaptop={4000,4999,3990,3199,18900};
String[] id=new String[5];
String checkid;
int p;
System.out.print("\n\n-----------------HeadPhone(->Price)--------------
------");
for(int i=0;i<5;i++)
{
int k=i+1;
id[i]="H00"+k;
System.out.print("\nId = "+id[i]+" "+laptop[i]+" -> 
"+pricelaptop[i]);
}
System.out.print("\n Which laptop do you want to buy(Enter Id) : 
");
checkid=s.nextLine();
for(p=0;p<5;p++)
if(id[p].equals(checkid))
break;
if(p<5)
{
System.out.println(laptop[p]+" is added to cart!");
total=total+pricelaptop[p];
addcart(id[p],laptop[p],pricelaptop[p]);
}
else
{
System.out.println("No item found");
}
}
void buycompaccessory()
{
String[] laptop= {"Keyboard","Optical Mouse","Webcam","Laptop 
Tabletop Stand","Backpack"};
int[] pricelaptop={2095,700,3000,1499,1500};
String[] id=new String[5];
String checkid;
int p;
System.out.print("\n\n-----------ComputerAcessory(->Price)------");
for(int i=0;i<5;i++)
{
int k=i+1;
 id[i]="CA00"+k;
System.out.print("\nId = "+id[i]+" "+laptop[i]+" -> 
"+pricelaptop[i]);
}
System.out.print("\n Which laptop do you want to buy(Enter Id) : 
");
checkid=s.nextLine();
for(p=0;p<5;p++)
if(id[p].equals(checkid))
break;
if(p<5)
{
System.out.println(laptop[p]+" is added to cart!");
total=total+pricelaptop[p];
addcart(id[p],laptop[p],pricelaptop[p]);
}
else
{
System.out.println("No item found");
}
}
void buymobileaccessory()
{
String[] laptop= {"Powerbanks","Cables and chargrs","Screen 
protectors","Cases and covers","mobile holder"};
int[] pricelaptop={2500,1500,400,350,200};
String[] id=new String[5];
String checkid;
int p;
System.out.print("\n\n-------MobileAcessory(->Price)------");
for(int i=0;i<5;i++)
{
int k=i+1;
id[i]="MA00"+k;
System.out.print("\nId = "+id[i]+" "+laptop[i]+" -> 
"+pricelaptop[i]);
}
System.out.print("\n Which laptop do you want to buy(Enter Id) : 
");
checkid=s.nextLine();
for(p=0;p<5;p++)
if(id[p].equals(checkid))
break;
if(p<5)
{
System.out.println(laptop[p]+" is added to cart!");
total=total+pricelaptop[p];
addcart(id[p],laptop[p],pricelaptop[p]);
}
else
{
System.out.println("No item found");
}
}
public static void main(String[] args)
{
int choice;
String name;
System.out.print("Please Enter Your Name : ");
Scanner s=new Scanner(System.in);
name=s.nextLine();
System.out.print("\n----------------------------------------------");
System.out.print("\n----------------------------------------------\n");
System.out.print("\n Hello "+name+" Welcome to LappyZones 
\n");
LappyZone o=new LappyZone();
while(true)
{
productmenu();
System.out.print("Enter your choice : ");
choice=s.nextInt();
switch(choice) 
{
case 1:o.buylaptop();
break;
case 2:o.buymobile();
break;
case 3:o.buyheadphone();
break;
case 4:o.buycompaccessory();
break;
case 5:o.buymobileaccessory();
break;
case 6:o.editcart(name);
break;
case 7:o.cart(name);
System.out.print("\n-----Your Final Bill ---
-----\n");
System.out.print("Thanks "+name+" for 
choosing Us and Visit us again\n\n");
System.exit(0);
default:System.out.print("\nEnter Valid Choice\n");
}
}
}
}