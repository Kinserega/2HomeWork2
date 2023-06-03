public class CompareStudentFaculty {
    public void CompareStudentGryffindor(Gryffindor student1, Gryffindor student2) {
        int studentOne = student1.getPowerMagic() + student1.getTransgressDistance() + student1.getNobility() + student1.getHonour() + student1.getBravery();
        int studentTwo = student2.getPowerMagic() + student2.getTransgressDistance() + student2.getNobility() + student2.getHonour() + student2.getBravery();
        if (studentOne > studentTwo) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (studentOne<studentTwo) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }else {
            System.out.println(student1.getName() + " и " + student2.getName() + " имеют одиннаковое колличество баллов");
        }
    }
    public void CompareStudentHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        int studentOne = student1.getPowerMagic() + student1.getTransgressDistance() + student1.getWorkLike() + student1.getLoyalty() + student1.getHonesty();
        int studentTwo = student2.getPowerMagic() + student2.getTransgressDistance() + student2.getWorkLike() + student2.getLoyalty() + student2.getHonesty();
        if (studentOne > studentTwo) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (studentOne<studentTwo) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        }else {
            System.out.println(student1.getName() + " и " + student2.getName() + " имеют одиннаковое колличество баллов");
        }
    }
    public void CompareStudentKogtevran(Kogtevran student1, Kogtevran student2) {
        int studentOne = student1.getPowerMagic() + student1.getTransgressDistance() + student1.getSmart() + student1.getWize() + student1.getWitty()+student1.getCreativity();
        int studentTwo = student2.getPowerMagic() + student2.getTransgressDistance() + student2.getSmart() + student2.getWize() + student2.getWitty()+student2.getCreativity();
        if (studentOne > studentTwo) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (studentOne<studentTwo) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }else {
            System.out.println(student1.getName() + " и " + student2.getName() + " имеют одиннаковое колличество баллов");
        }
    }
    public void CompareStudentSlytherin(Slytherin student1, Slytherin student2) {
        int studentOne = student1.getPowerMagic() + student1.getTransgressDistance() + student1.getTrick() + student1.getDeremination() + student1.getAmbition()+student1.getResoursefulness()+student1.getLust();
        int studentTwo = student2.getPowerMagic() + student2.getTransgressDistance() + student2.getTrick() + student2.getDeremination() + student2.getAmbition()+student2.getResoursefulness()+student2.getLust();
        if (studentOne > studentTwo) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (studentOne<studentTwo) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }else {
            System.out.println(student1.getName() + " и " + student2.getName() + " имеют одиннаковое колличество баллов");
        }
    }
}
