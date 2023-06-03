public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 2 курс, 2");
        Gryffindor garryPotter = new Gryffindor("Гарри Поттер",85, 26, 15, 84, 59);
        Gryffindor germionaGreindger = new Gryffindor("Гермиона Грейнджер",52, 45, 78, 14, 32);
        Gryffindor ronUizli = new Gryffindor("Рон уизли",45, 17, 62, 58, 32);

        Hufflepuff zachariaSmit = new Hufflepuff("Захария Смит",25, 35, 74, 65, 14);
        Hufflepuff sedricDiggori = new Hufflepuff("Седрик Диггори",52, 14, 85, 36, 42);
        Hufflepuff djastinFinchFletcheli = new Hufflepuff("Джастин Финч-Флетчи",23, 65, 42, 21, 47);

        Kogtevran chjouChang = new Kogtevran("Чжоу Чанг",15, 65, 74, 23, 14, 65);
        Kogtevran padmaPatil = new Kogtevran("Падма Патил", 25, 75, 46, 35, 61, 24);
        Kogtevran marcusBelbi = new Kogtevran("Маркус Белби", 51, 42, 12, 34, 26,42);

        Slytherin drakoMalfoi = new Slytherin("Драко Малфой", 25, 56, 14, 75, 23, 14, 36);
        Slytherin grechemMontegu = new Slytherin("Грэхэм Монтегю",56, 14, 62, 74, 23, 24, 18);
        Slytherin gregoriGoil = new Slytherin("Грегори Гойл",56, 24, 85, 32, 14, 16, 75);

        PrintStudent printStudent = new PrintStudent();
        printStudent.printStudentGryffindor(garryPotter);

        CompareStudentFaculty compareStudentFaculty = new CompareStudentFaculty();
        compareStudentFaculty.CompareStudentKogtevran(chjouChang,padmaPatil);

        CompareTwoStudens compareTwoStudens = new CompareTwoStudens();
        compareTwoStudens.compareTwoStudens(germionaGreindger,gregoriGoil);
    }

}