public class StudentAndStaffTest {
    public static void main(String[] args) {
        Student student = new Student("John","Singapore","Bachelor",2010,10000.500);
        System.out.println(student.toString());

        Staff staff = new Staff("Mary", "London", "Cambridge", 120000.3);
        System.out.println(staff.toString());
    }
}
