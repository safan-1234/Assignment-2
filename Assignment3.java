package Assignmemt;
import java.util.regex.*;
import java.util.Scanner;
public class tool2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the ip address");
        String ip=sc.nextLine();
        String regex="\"^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$\";";
        if(ip.matches(regex)){
            System.out.println("true");
        }
        else{
System.out.println("false");
        }
        }
    }

