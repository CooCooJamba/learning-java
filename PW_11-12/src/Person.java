public class Person {
    private String fname = "", sname = "", tname = "";
    public Person() {
        this.fname = "";
        this.sname = "";
        this.tname = "";
    }
    public Person(String sname) {
        this.sname = sname;
    }
    public Person (String fname, String sname) {
        this.fname = fname;
        this.sname = sname;
    }
    public Person(String fname, String sname, String tname) {
        this.fname = fname;
        this.sname = sname;
        this.tname = tname;
    }
    public String create() {
        return sname + " " + ((fname.length() != 0) ? fname.charAt(0) + "." : "") + ((tname.length() != 0) ? tname.charAt(0) + "." : "");
    }
}
