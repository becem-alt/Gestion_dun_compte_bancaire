/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_compte_bancaire;

import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            int choice=0;
            while(choice!=4){
            System.out.println(" \t1:Debiter \n 2:Crediter \n 3:LireSolde \n 4:Quitter \n \t");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            if(choice==1){
                System.out.println("\nDebiter :\n");
                System.out.println("donner le montant:");
                int x=sc.nextInt();
                service1.debiter(x);
            }
            else if(choice==2){
                System.out.println("\nCrediter :\n");
                System.out.println("donner le montant:");
                int y=sc.nextInt();
                service1.crediter(y);
            }
            else if(choice==3){
                System.out.println(service1.lireSolde());
            }
            }

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}