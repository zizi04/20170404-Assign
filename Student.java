package programming;

public class Student {

    private String major;
    private int num;

    public void setMajor(String major) {
        this.major = major;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMajor() {
        return major;
    }

    public int getNum() {
        return num;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setMajor("��ǻ���������а�");
        s.setNum(20164116);

        System.out.println("�й�: " + s.getNum() + ", �а�: " + s.getMajor());
    }
}
