public class Simple {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setID("1234");
        s1.setName("Thana");
        s1.setGPA(3.25);
        s1.showDetails();
        s2.setID("1122");
        s2.setName("Somchai");
        s2.setGPA(2.90);
        s2.showDetails();
        s3.setID("2211");
        s3.setName("Somsri");
        s3.setGPA(3.00);
        s3.showDetails();
    }
}
