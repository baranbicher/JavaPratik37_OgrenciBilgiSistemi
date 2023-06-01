public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("İşlem Başarılı!..");
        }else {
            System.out.println(t.name + "Akademisyeni bu dersi veremez.");
        }
    }

    void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.name + " dersinin Akademisyeni: " + courseTeacher);
        }else {
            System.out.println(this.name + "dersine Akademisyen atanmıştır.");
        }
    }
}
