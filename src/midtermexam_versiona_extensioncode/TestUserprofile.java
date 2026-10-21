/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author mitch
 */

// Random for commit and push
// Adding another comment for a commit
public class TestUserprofile {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        UserProfile user1;
        
        System.out.println("New User Profile Creation:");
        System.out.print("Enter a Username: ");
        String tempName = sc.nextLine();
//        System.out.print(user1.getGenre());
        System.out.println("Comedy, Drama, Action, Mystery");
        System.out.print("Enter Faviroute Genre Of Movie:");
        String tempGenre = sc.nextLine();
        
//        user1 = new UserProfile(tempName, tempGenre);
        System.out.println("User Profile has been create!");
        
    
        sc.close();
    }
    
}
