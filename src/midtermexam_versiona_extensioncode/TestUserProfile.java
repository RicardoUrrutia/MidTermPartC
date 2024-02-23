/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author ricky
 */
public class TestUserProfile {
       public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Create new user profile");
        System.out.println("Enter Username: ");
        String userID = input.nextLine();
        System.out.println("Enter your favourite actor: ");
        String Actor = input.nextLine();
        System.out.println("Your account was created");
    }
}
