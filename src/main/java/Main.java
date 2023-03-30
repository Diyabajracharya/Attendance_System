import models.Attendance;
import models.Users;

import java.sql.Connection;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Connection connection = DBUtils.connect();
        DBUtils db = new DBUtils();
        String username;
        String password;

        System.out.println("Press 1 to insert user data");
        System.out.println("Press 2 to insert class data");
        System.out.println("Press 3 to insert user table");
        System.out.println("Press 4 to select from attendance data");
        System.out.println("Press 5 to select from class table");


        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input==1){


            System.out.println("Enter new username");
            username = scanner.next();
            System.out.println("Set password");
            password = scanner.next();
            Users users = new Users(username, password);
            Users model_users;
            db.insert_user(connection, users.getUsername(), users.getPassword());
        }
        if (input==2){
            System.out.println("Enter class name");
            String class_name= scanner.next();
            db.insert_class(connection,class_name);
        }
        if (input == 3){
            System.out.println("Enter user id");
            int inp_id = scanner.nextInt();
            db.select_users(connection,inp_id);
        }



        if(input == 4){
            System.out.println("Enter user id");
            int user_id= scanner.nextInt();
            System.out.println("Enter class id");
            int class_id = scanner.nextInt();
            System.out.println("Enter 0 for present and 1 for absent");
            int attendance = scanner.nextInt();
            Attendance atten = new Attendance(class_id,user_id,attendance);
            db.insert_attendance(connection,class_id,user_id,attendance);
        }


        if(input == 5 ){
            System.out.println("Enter class id");
            int class_id = scanner.nextInt();
            db.select_class(connection,class_id);
        }
    }
}
