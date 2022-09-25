import java.util.ArrayList;
import java.util.Scanner;

public class TraverseArrayList
  {
      ArrayList<Integer>   al;
     public  void enterElements(Scanner sc, ArrayList<Integer> al){
           
             System.out.println("enter number of element you want to add in arraylist");
             int size=sc.nextInt();
             for(int i =0;i<size;i++)
               {
                  System.out.println("enter the items in list");
                  int item=sc.nextInt();
                  al.add(item);

               }
             
          }
     public static void main(String[] args)
         {
             TraverseArrayList   tl= new TraverseArrayList();
             Scanner sc = new Scanner(System.in);
             tl.  al= new ArrayList<Integer>();
             System.out.println("Enter 1 for while Loop");
             System.out.println("Enter 2 for each Loop");
             System.out.println("Enter 3 for loop");
             System.out.println("Enter your choice ");
             int choice = sc.nextInt();
             switch(choice)
                {
                  case 1:
                     tl.enterElements(sc,tl.al);
                     int i=0;
                     System.out.println("----while loop---");
                     while(i<tl.al.size())
                      {
                         System.out.println(tl.al.get(i));
                         i++;
                       }
                     break;
                 case 2: 
                      tl.enterElements(sc,tl.al);
                      System.out.println("----advance for loop---");
                      for(Integer item:tl.al)
                        {
                           System.out.println(item);   
                        }
                     
                      break;
                 case 3:
                      tl.enterElements(sc,tl.al);
                      System.out.println("----for loop---");
                      for (int j =0;j<tl.al.size();j++)
                         {
                             System.out.println(tl.al.get(j));
                          }
                      break;
                 default:
                     System.out.println("Invalid option selected");
                     

                }

          } 



  }