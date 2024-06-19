/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package partb.pkg1.jdbc;

import java.sql.*;
import java.util.Scanner;
import java.sql.Date;
import java.sql.ResultSet;
//import java.util.logging.;
//import java.util.logging.Logger;


public class Partb1Jdbc {
    public static void main(String[] args) {
        try (
            Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/student", "root", "root");
            Statement stmt = con.createStatement();
        ) {
            int choice = 5;
            int regno;
            String sname, sadd, sclass, scourse, sql;
            Date dob;

            do {
                System.out.println("\nMenu");
                System.out.println("-----------------");
                System.out.println("1. Add student");
                System.out.println("2. Delete student");
                System.out.println("3. Update student");
                System.out.println("4. Search student");
                System.out.println("5. Exit");
                System.out.println("------------------");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume the newline

                switch (choice) {
                    case 1:
                        System.out.println("-----Enter student details---");
                        System.out.print("Reg no : ");
                        regno = sc.nextInt();
                        
                        sc.nextLine(); // consume the newline
                        System.out.print("Name : ");
                        sname = sc.nextLine();
                        
                        System.out.println("DOB: [yyyy-mm-dd]:");
                        dob = Date.valueOf(sc.next());
                        
                        sc.nextLine(); // consume the newline
                        System.out.print("Address : ");
                        sadd = sc.nextLine();
                        
                        System.out.print("Class: ");
                        sclass = sc.nextLine();
                        
                        System.out.print("Course: ");
                        scourse = sc.nextLine();
                        sql = "INSERT INTO ROOT.STUDENT (STREGNO, STNAME, STDOB, STADD, STCLASS, STCOURSE) VALUES ("+regno+", '"+sname+"', '"+dob.toString()+"', '"+sadd+"', '"+sclass+"', '"+scourse+"')";
                        int result = stmt.executeUpdate(sql);
                        if (result == 1) {
                            System.out.println("Students detail are saved");
                        } else {
                            System.out.println("Error! while saving student details");
                        }
                        break;
                    case 2:
                        System.out.print("Enter student register number: ");
                        regno = sc.nextInt();
                        
                        sql="DELETE FROM ROOT.STUDENT WHERE STREGNO="+regno;
                        
                        result=stmt.executeUpdate(sql);
                        
                        if(result==1){
                            System.out.println("Student record deleted");
                        }else{
                            System.out.println("Failed to delete record");
                        }
               
                        break;
                    case 3:
                        System.out.print("Enter register number: ");
                        regno = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.println("Enter the new address");
                        sadd=sc.nextLine();
                        
                        sql="UPDATE ROOT.STUDENT SET STADD='"+sadd+"' WHERE STREGNO="+regno;
                        result=stmt.executeUpdate(sql);
                        
                        if(result==1){
                            System.out.println("Student record Updated");
                        }else{
                            System.out.println("Failed to update record");
                        }
                        
                        break;
                    case 4:
                        System.out.print("Enter register no: ");
                        regno = sc.nextInt();
                        sql="SELECT * FROM ROOT.STUDENT WHERE STREGNO="+regno;
                        
                        ResultSet rs=stmt.executeQuery(sql);
                        
                        if(rs.next()){
                            System.out.println("Register Number :"+rs.getInt(1));
                            System.out.println("Name :"+rs.getString(2));
                            System.out.println("DOB :"+rs.getString(3));
                            System.out.println("Address :"+rs.getString(4));
                            System.out.println("Class :"+rs.getString(5));
                            System.out.println("Course :"+rs.getString(6));
                        }else{
                            System.out.println("Failed to fetch student details");
                        }
                        break;
                    case 5:
                        System.out.println("Thank you");
                        break;
                    default:
                        System.out.println("Wrong choice");
                }
            } while (choice != 5);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

