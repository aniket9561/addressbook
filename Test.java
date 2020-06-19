import javax.swing.*;
import java.util.*;

class Test {
	public static void main (String args[]) {
        AddressBook ab = new AddressBook();
	String input, s;
	int ch;
	while (true) {
		input = JOptionPane.showInputDialog("Enter 1 to add " +
		"\n Enter 2 to Search \n Enter 3 to Delete" +
		"\n Enter 4 to sort" +
		"\n Enter 5 to printdetails" +
		"\n Enter 6 to exit");
		ch = Integer.parseInt(input);
		switch (ch) {
		case 1:
		ab.addPerson();
		break;
		case 2:
		s = JOptionPane.showInputDialog(
		"Enter name to search ");
		ab.searchPerson(s);
		break;
		case 3:
		s = JOptionPane.showInputDialog(
		"Enter name to delete ");
		ab.deletePerson(s);
		break;
		  case 4:

                ab.sort();
               	break;
		case 5:
		ab.printperson();
		break;
		case 6:
		System.exit(0);
		}
	}
}

}
