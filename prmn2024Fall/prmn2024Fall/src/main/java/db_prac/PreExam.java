package db_prac;

public class PreExam {

    private String gakukiCode;
    private String familyName;
    private String firstName;
    private int point;

    public PreExam(String gakukiCode, String familyName, String firstName, int point) {
        this.gakukiCode = gakukiCode;
        this.familyName = familyName;
        this.firstName = firstName;
        this.point = point;
    }

    public void print() {
        System.out.println(gakukiCode+"さんは"+point+"点");
    }

}
