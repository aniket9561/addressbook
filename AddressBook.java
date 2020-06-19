import javax.swing.*;
import java.util.*;


class AddressBook {
ArrayList persons;

public AddressBook() {
	persons = new ArrayList();
}

public void addPerson() {
	String name = JOptionPane.showInputDialog("Enter name");
	String add = JOptionPane.showInputDialog("Enter address");
	String pNum = JOptionPane.showInputDialog("Enter phone no");
	String zcode = JOptionPane.showInputDialog("Enter zipcode");

PersonInfo p = new PersonInfo(name, add, pNum, zcode);

persons.add(p);
}

public void searchPerson (String n) {
	for (int i=0; i< persons.size(); i++) {
	PersonInfo p = (PersonInfo)persons.get(i);
	if ( n.equals(p.name) ) {
	p.print();
}
}
}
public void deletePerson (String n) {
	for (int i=0; i< persons.size(); i++) {
	PersonInfo p = (PersonInfo)persons.get(i);
	if ( n.equals(p.name) ) {
	persons.remove(i);
}
}
}

public void sort (){
ArrayList<String> zip = new ArrayList<>();

for (int i =0; i< persons.size(); i++) {
	PersonInfo p = (PersonInfo)persons.get(i);
         zip.add(p.getZipcode());
}
        Collections.sort(zip);
	System.out.println(zip);
}
	public void printperson () {
        for (int i=0; i< persons.size(); i++) {
        PersonInfo p = (PersonInfo)persons.get(i);

        p.print();
	}
}
}
# addressbook
