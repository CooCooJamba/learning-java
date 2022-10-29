public class PhoneNumber {
    public static void create(String str) {
        if (str.charAt(0) == '+') {
            str = new StringBuffer(str).insert(str.length()-4, "-").toString();
            str = new StringBuffer(str).insert(str.length()-8, "-").toString();
            System.out.println(str);
        } else {
            str = "+7" + str.substring(1, 11);
            str = new StringBuffer(str).insert(str.length()-4, "-").toString();
            str = new StringBuffer(str).insert(str.length()-8, "-").toString();
            System.out.println(str);
        }
    }
}
