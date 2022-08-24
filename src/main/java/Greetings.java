import java.util.ArrayList;
import java.util.Locale;

public class Greetings {
    /*
    public static String greet(String name) {
        String string;
        if (name == null) {
            string = "Hello, my friend.";
        } else {
            String bigString = name.toUpperCase();
            if (bigString.equals(name))
                string = "HELLO, " + name + ".";
            else
                string = "Hello, " + name + ".";
        }


        System.out.println(string);
        return string;

    }
*/
    public static String greet(String... names) {
        String string;
        if (names == null) {
            string = "Hello, my friend.";
        } else {
            String tempNames = "";
            for (String name : names) {
                tempNames += name;
            }
            String bigString = tempNames.toString().toUpperCase();
            if (bigString.equals(tempNames)) {
                string = "HELLO";
                for (int i = 0; i < names.length - 1; i++) {
                    string += ", " + names[i];
                }
                string += "AND " + names[names.length - 1] + ".";

            } else {

                ArrayList<String> beegNames = new ArrayList<>();
                ArrayList<String> smolNames = new ArrayList<>();

                for (String name : names) {
                    if (name.equals(name.toUpperCase())) {
                        beegNames.add(name);
                    } else {
                        smolNames.add(name);
                    }
                }
                string = "Hello";

                for (int i = 0; i < smolNames.size() - 1; i++) {
                    string += ", " + smolNames.get(i);
                }

                if (beegNames.size()!= 0) {
                    string += " AND HELLO " + beegNames.get(0);

                    if (beegNames.size()>1) {
                        for (int i = 1;  i < beegNames.size()-1; i++){
                            string += ", " + beegNames.get(i);
                        }


                    }
                    string += ".";

                }
            }
        }


        System.out.println(string);
        return string;

    }

}
