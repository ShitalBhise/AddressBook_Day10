package book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressbookMain {

	static Scanner scanner = new Scanner(System.in);
	ArrayList<AddressBook> person;

	public AddressbookMain() { // constructor same class name need to use
		person = new ArrayList<AddressBook>();

	}

	public AddressBook addperson() {
		System.out.println("Enter the First Name");
		String fName = scanner.next();
		System.out.println("Enter the Last Name");
		String lName = scanner.next();
		System.out.println("Enter the city");
		String city = scanner.next();
		System.out.println("Enter the State");
		String state = scanner.next();
		System.out.println("Enter the Zip");
		String zip = scanner.next();
		System.out.println("Enter the Address");
		String address = scanner.next();
		System.out.println("Enter the Phone number");
		String phonenumber = scanner.next();
		System.out.println("Enter the email");
		String email = scanner.next();

		AddressBook contacts = new AddressBook(fName, lName, city, state, zip, address, phonenumber, email); // constructor
																												// eg
		// in c int x=10

		person.add(contacts); // adding above list to array
		System.out.println(contacts); // printing contacts

		return contacts;
	}

	public void editPerson() {
		System.out.println("Enter name to Edit");
		String s = scanner.next();
		for (int i = 0; i < person.size(); i++) {
			AddressBook p = person.get(i);

			if (s.equals(p.getfname())) {
				while (true) {
					System.out.println("Enter choice to edit 1)firstName\n2)lastName\n3)address\n"
							+ "4)city\n5)state\n6)zip\n7)phoneNumber\n8)email9)exit");
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:
						p.setfname(scanner.next());
						break;
					case 2:
						p.setlname(scanner.next());
						break;
					case 3:
						p.setcity(scanner.next());
						break;
					case 4:
						p.setstate(scanner.next());
						break;
					case 5:
						p.setzip(scanner.next());
						break;
					case 6:
						p.setaddress(scanner.next());
						break;
					case 7:
						p.setphoneNo(scanner.next());
						break;
					case 8:
						p.setemail(scanner.next());
						break;
					default:
						System.out.println("select correct choice");
						break;
					}
					if (choice == 9)
						break;
				} // end while loop
				person.set(i, p);
				System.out.println("person after editing");
				System.out.println(person);

			}
		}

	}

	public static void main(String[] args) {

		AddressbookMain main = new AddressbookMain();
		main.addperson();
		main.editPerson();
		// main.deletePerson();
	}

}
