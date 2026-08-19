//package model;
//
//import java.util.Scanner;
//
//public class Main {
//	static Scanner scan = new Scanner(System.in);
//
//	public static void main(String[] args) throws InterruptedException {
//
//		do {
//			System.out.println("-----------------------------------------------");
//			System.out.println("USER MENU");
//			System.out.println("1.add user\n2.fetch user\n3.fetchAll\n4.deleteUser\n5.Is Exist\n6.update");
//			System.out.println("Enter your choice: ");
//			int choice = scan.nextInt();
//			scan.nextLine();
//
//			switch (choice) {
//
//			case 1:
//				register();
//				break;
//
//			case 2:
//				fetchByName();
//				break;
//
//			case 3:
//				fetchAll();
//				break;
//
//			case 4:
//				deleteUser();
//				break;
//
//			case 5:
//				isUserExist();
//				break;
//			case 6:
//				update();
//				break;
//
//			default:
//				System.exit(0);
//
//			}
//		} while (true);
//
//	}
//
//	private static void register() {
//
//		User user = new User();
//
//		System.out.print("Enter username : ");
//		user.setUsername(scan.nextLine());
//
//		System.out.print("Enter password : ");
//		user.setPassword(scan.nextLine());
//
//		System.out.print("Enter email : ");
//		user.setEmail(scan.nextLine());
//
//		System.out.print("Enter phone : ");
//		user.setPhone(scan.nextLong());
//		scan.nextLine();
//
//		UserDAO dao = new UserDAO();
//
//		dao.saveUser(user);
//
//	}
//
//	private static void fetchByName() {
//
//		System.out.print("Enter Username to Search : ");
//
//		String username = scan.nextLine();
//
//		UserDAO dao = new UserDAO();
//
//		User foundUser = dao.getUser(username);
//
//		if (foundUser != null) {
//
//			System.out.println("User Found");
//			System.out.println("ID       : " + foundUser.getId());
//			System.out.println("Username : " + foundUser.getUsername());
//			System.out.println("Password : " + foundUser.getPassword());
//			System.out.println("Email    : " + foundUser.getEmail());
//			System.out.println("Phone    : " + foundUser.getPhone());
//
//		} else {
//
//			System.out.println("User Not Found");
//		}
//
//	}
//
//	private static void fetchAll() throws InterruptedException {
//		UserDAO dao = new UserDAO();
//
//		dao.fetchAll().stream().forEach(System.out::println);
//
//	}
//
//	private static void deleteUser() {
//		UserDAO dao = new UserDAO();
//
//		System.out.println("Enter username to delete: ");
//
//		String name = scan.nextLine();
//
//		dao.deleteByUser(name);
//	}
//
//	private static void isUserExist() {
//		System.out.println("Enter username to check: ");
//		String name = scan.nextLine();
//		UserDAO dao = new UserDAO();
//		System.out.println(dao.isUserExist(name));
//	}
//
//	private static void update() {
//
//
//		System.out.println("Enter username to update");
//		String name = scan.nextLine();
//		
//		UserDAO dao = new UserDAO();
//		User u = dao.getUser(name);
//
//
//		if (u != null) {
//			
//			System.out.println("1.password\n2.email\n3.phone\n4.updateAll");
//			System.out.println("which field you want to update :");
//			
//			int choice= scan.nextInt();
//			scan.nextLine();
//			switch(choice) {
//			case 1 : 
//				System.out.println("Enter new password : ");
//				u.setPassword(scan.nextLine());
//				break;
//			
//			case 2 : 
//				System.out.println("Enter new email : ");
//				u.setEmail(scan.nextLine());
//				break;
//				
//			case 3 : 
//				System.out.println("Enter new phone : ");
//				u.setPhone(scan.nextLong());
//				scan.nextLine();
//				break;
//				
//			case 4 : 
//				System.out.println("Enter new password: ");
//				u.setPassword(scan.nextLine());
//				System.out.println("Enter new email: ");
//				u.setEmail(scan.nextLine());
//				System.out.println("Enter new phone: ");
//				u.setPhone(scan.nextLong());
//				scan.nextLine();
//				break;
//				
//			default:
//				System.out.println("invalid choice");
//			}
//			dao.updateUser(u, choice);
//			
//		} else {
//			System.out.println("cannot able to update as the username doesnot exist");
//		}
//
//	}
//
//}
package service;

