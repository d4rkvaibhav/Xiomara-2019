import java.util.Scanner;

public class Login {
  public Login() {}
  
  public static void main(String[] paramArrayOfString) { Scanner localScanner = new Scanner(System.in);
    


    String str1 = "55534552";
    
    String str2 = "54455354";
    

    StringBuilder localStringBuilder = new StringBuilder("");
    

    for (int i = 0; i < str1.length(); i += 2) {
      str6 = str1.substring(i, i + 2);
      localStringBuilder.append((char)Integer.parseInt(str6, 16));
    }
    String str3 = localStringBuilder.toString();
    

    localStringBuilder = new StringBuilder("");
    for (i = 0; i < str2.length(); i += 2) {
      str6 = str2.substring(i, i + 2);
      localStringBuilder.append((char)Integer.parseInt(str6, 16));
    }
    
    String str4 = localStringBuilder.toString();
    

    System.out.print("Enter Username ");
    String str5 = localScanner.nextLine();
    System.out.print("Enter Password ");
    String str6 = localScanner.nextLine();
    System.out.println(str3+" "+str4);
    if ((str5.equals(str3)) && (str6.equals(str4))) {
      System.out.print("Login Succesful...");
    } else {
      System.out.print("Login Failed.");
    }
  }
}