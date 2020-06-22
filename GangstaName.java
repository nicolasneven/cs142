import java.util.*;
public class GangstaName {
   public static void main(String[] args) {
   Scanner console = new Scanner(System.in);
   System.out.print("Type your name, playa: ");
   String name = console.nextLine();
   
   System.out.print("(M)ale or (F)emale: ");
   String gender = console.next();
   
   // split name into first/last name and initials
   String first = name.substring(0, name.indexOf(" "));
   String last = name.substring(name.indexOf(" ") + 1);
   last = last.toUpperCase();
   String fInitial = first.substring(0, 1);
   
   String title;
   if (gender.equalsIgnoreCase("m")) {
      title = "Daddy";
   } else {
      title = "Goddess";
   }
   System.out.println("Your gangsta name is \"" + fInitial + ". " + last + " " + title + " " + first + "-izzle\"");
   }
}