public class Student {
            private String id;
            private String name;
            private double gpa;
            public void setID(String ID) {
                        id = ID;
            }
            public void setName(String n) {
                        name = n;
            }
            public void setGPA(double GPA) {
                        gpa = GPA;
            }
            public void showDetails() {
                        System.out.println("ID: "+id);
                        System.out.println("Name: "+name);
                        System.out.println("GPA: "+gpa);
            }
}