import javax.swing.*;

class PersonInfo {
	String name;
	String address;
	String phoneNm;
	String zipcode;
	String sort;
	String delete;
	String edit;
public String getZipcode() {
                return zipcode;
        }

public PersonInfo(String n, String a, String p, String z) {
	name = n;
	address = a;
	phoneNm = p;
	zipcode = z;
	}

public void print( ) {
	JOptionPane.showMessageDialog(null, "name: " + name +
			"address:" +address + "phone no:" + phoneNm +
			"zipcode: " + zipcode);
	}
}
