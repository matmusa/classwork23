import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            Person person = new Person("Matmusa", 21, +996777609038L, Gender.MAN, Role.STUDENT);
            Person person2 = new Person("Manas", 28, +996777609038L, Gender.MAN, Role.STUDENT);
            Person person3 = new Person("Farida", 26, +996777609038L, Gender.WOMAN, Role.STUDENT);
            Person person4 = new Person("Kanykey", 18, +996777609038L, Gender.WOMAN, Role.STUDENT);
            Person person5 = new Person("Mirbek", 15, +996777609038L, Gender.MAN, Role.STUDENT);
            Person person6 = new Person("Momun", 17, +996777609038L, Gender.MAN, Role.STUDENT);
            Person person7 = new Person("Datka", 22, +996777609038L, Gender.WOMAN, Role.MENTOR);
            Person person8 = new Person("Ruslan", 21, +996777609038L, Gender.MAN, Role.STUDENT);
            Person person9 = new Person("Toni", 18, +996777609038L, Gender.MAN, Role.STUDENT);
            Person person10 = new Person("Ulan", 28, +996777609038L, Gender.MAN, Role.MENTOR);

            Person[] people = {person, person2, person3, person4, person5, person6, person7, person8, person9, person10};
            ArrayList<String> woman = new ArrayList<>();
            ArrayList<String> man = new ArrayList<>();
            ArrayList<String> nameM = new ArrayList<>();
            ArrayList<String> student = new ArrayList<>();
            ArrayList<String> mentor = new ArrayList<>();


            for (Person p : people
            ) {
                if (p.getAge() < 0) {
                    throw new Exception("age can't be negative!");
                }
                long i = p.getPhoneNumber();
                String string = Long.toString(i);
                if (string.length() >= 12 && string.length() < 14) {

                } else {
                    System.out.println(string);
                    throw new Exception("uncorrect number");
                }
                char getfirstChar = 'M';

                if (p.getName().charAt(0) == getfirstChar) {

                    nameM.add(p.getName());

                }

                if (p.getGender().equals(Gender.MAN)) {
                    man.add(p.toString());

                }
                if (p.getGender().equals(Gender.WOMAN)) {
                    woman.add(p.toString());

                }
                if (p.getRole().equals(Role.STUDENT)) {
                    student.add(p.toString());

                }
                if(p.getRole().equals(Role.MENTOR)){
                    mentor.add(p.toString());
                }
            }
            System.out.println(mentor);

        } catch (
                Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
     /*   Person класс тузунуз( name, age, phoneNumber, gender(enum),
        role(enum: Student, Mentor) . main ден класстын 10 объектисин
        тузунуз,  жашы  тамга  менен  же  терс  сан  берилсе  exception
                ыргытылсын,
        phoneNumber  0  дон  башталсын  же  болбосо  +996  мн
        башталсын узундугу 10 же 14 символдон турушу керек, андай
        болбосо  exception  ыргытылсын.  ArrayList  тузуп  баарын  ошол
        листке  салыныз.  Анан  аты  А  тамгадан  баштагандарды  башка
        листке салып коюнуз, роль студент болгондорду башка листке
        салыныз,  жана  кыздарды  жана  балдарды  башка  башка  листке*/


