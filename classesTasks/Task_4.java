import java.util.Scanner;

public class Task_4 {
    
    class Reader {
        private String fullName;
        private int libraryCardNumber;
        private String faculty;
        private String birthDate;
        private String phone;

        public Reader(String fullName, int libraryCardNumber, String faculty, String birthDate, String phone) {
            this.fullName = fullName;
            this.libraryCardNumber = libraryCardNumber;
            this.faculty = faculty;
            this.birthDate = birthDate;
            this.phone = phone;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public int getLibraryCardNumber() {
            return libraryCardNumber;
        }

        public void setLibraryCardNumber(int libraryCardNumber) {
            this.libraryCardNumber = libraryCardNumber;
        }

        public String getFaculty() {
            return faculty;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        String takeBook() {
            System.out.println("Enter the book name:");
            Scanner scanner = new Scanner(System.in);
            String takenBookName = scanner.next();
            return "You took " + takenBookName + " book";
        }

        void returnBook(String bookName) {
            System.out.println("You returned " + bookName);
            System.out.println("We will be waiting for you again!");
        }

    }
}


