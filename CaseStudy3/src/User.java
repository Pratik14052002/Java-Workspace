
public interface User {
public void showFirstScreen();
public void showStudentScreen();
public void showAdminScreen();
//public void showAdminAllStudentScreen();
public void showStudentRegistrationScreen();
public void introduceNewCourseScreen();
//public void showAllCourseScreen();
void showAdminAllStudentScreen(Student[] sarr);
void showAllCourseScreen(Course[] carr);
}
