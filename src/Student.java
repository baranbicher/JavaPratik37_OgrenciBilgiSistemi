public class Student {
    Course mat;
    Course fizik;
    Course kimya;
    String name;
    String stuNo;
    int classes;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
        calcAvarage();
    }

    void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (mat >= 0 && mat <= 100) {
            this.mat.verbalNote = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbalNote = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbalNote = kimya;
        }
    }

    void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.verbalNote == 0 || this.fizik.verbalNote == 0 || this.kimya.verbalNote == 0) {
            System.out.println("Notlar tam girilmemiş.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
                isPass = true;
            } else {
                System.out.println("Sınıfta Kaldı.");
                isPass = false;
            }
        }
    }

    void calcAvarage() {
        this.avarage = ((this.mat.note * 0.8 + this.mat.verbalNote * 0.2) + (this.fizik.note * 0.8 + this.fizik.verbalNote * 0.2)
                + (this.kimya.note * 0.8 + this.kimya.verbalNote * 0.2)) / 3.0;
    }

    boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    void printNote() {
        System.out.println("======================");
        System.out.println("Öğrenci :" + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + "Matematik Sözlü Notu : " + this.mat.verbalNote);
        System.out.println("Fizik Notu : " + this.fizik.note + "Fizik Sözlü Notu : " + this.fizik.verbalNote);
        System.out.println("Kimya Notu : " + this.kimya.note + "Kimya Sözlü Notu : " + this.kimya.verbalNote);
    }
}
