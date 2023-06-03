public class CompareTwoStudens {
    public void compareTwoStudens(Hogwarts student1, Hogwarts student2) {
        int studentOne = student1.getPowerMagic() + student1.getTransgressDistance();
        int studentTwo = student2.getPowerMagic() + student2.getTransgressDistance();
        if (studentOne > studentTwo) {
            System.out.println(student1.getName() + " обладает большей силой магии, чем "+student2.getName());
        } else if (studentOne < studentTwo) {
            System.out.println(student2.getName() + " обладает большей силой магии, чем " + student1.getName());
        } else {
            System.out.println(student2.getName() + " и " + student1.getName() + " обладают одинаковой силой магии");
        }
    }
}
