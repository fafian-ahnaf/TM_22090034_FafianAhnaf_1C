package TM;

public class EventOrganiser {
    private int CUSTID;
    private String CUSTNAME;
    private String CUSTADDR;
    private String CUSTEMAIL;
    private int CUSTPHONE;

    public int getCUSTID() {
        return CUSTID;
    }

    public void setCUSTID(int CUSTID) {
        this.CUSTID = CUSTID;
    }

    public String getCUSTNAME() {
        return CUSTNAME;
    }

    public void setCUSTNAME(String CUSTNAME) {
        this.CUSTNAME = CUSTNAME;
    }

    public String getCUSTADDR() {
        return CUSTADDR;
    }

    public void setCUSTADDR(String CUSTADDR) {
        this.CUSTADDR = CUSTADDR;
    }

    public String getCUSTEMAIL() {
        return CUSTEMAIL;
    }

    public void setCUSTEMAIL(String CUSTEMAIL) {
        this.CUSTEMAIL = CUSTEMAIL;
    }

    public int getCUSTPHONE() {
        return CUSTPHONE;
    }

    public void setCUSTPHONE(int CUSTPHONE) {
        this.CUSTPHONE = CUSTPHONE;
    }

    //      public int getInput() {
    //          return input;
    //     }
    //
    //     public void setInput(int input) {
    //          this.input = input;
    //     }

    public EventOrganiser() {

    }

    public EventOrganiser(int CUSTID, String CUSTNAME, String CUSTADDR, String CUSTEMAIL, int CUSTPHONE) {
        this.CUSTID = CUSTID;
        this.CUSTNAME = CUSTNAME;
        this.CUSTADDR = CUSTADDR;
        this.CUSTEMAIL = CUSTEMAIL;
        this.CUSTPHONE = CUSTPHONE;
    }

    public void PrintGuests(EventOrganiser[] tamu) {
        System.out.println("========Daftar Tamu========");
        for (int i = 0; i < tamu.length; i++) {
            System.out.println("======Tamu " + (i + 1) + "======");
            System.out.println("ID: " + getCUSTID());
            System.out.println("Nama: " + getCUSTNAME());
            System.out.println("Alamat: " + getCUSTADDR());
            System.out.println("Email: " + getCUSTEMAIL());
            System.out.println("Phone: " + getCUSTPHONE());
        }
    }
}
