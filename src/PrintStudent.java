public class PrintStudent {
    public void printStudentGryffindor(Gryffindor student) {
        System.out.println("Студент: "+ student.getName() + " Сила магии: "+student.getPowerMagic()+" Трансгрессировать: "+ student.getTransgressDistance()+" Благородство: "+ student.getNobility()+" Честь: "+student.getHonour()+" Храбрость: "+ student.getBravery());
    }
    public void printStudentHufflepuff(Hufflepuff student) {
        System.out.println("Студент: "+ student.getName() + " Сила магии: "+student.getPowerMagic()+" Трансгрессировать: "+ student.getTransgressDistance()+" Трудолюбивие: "+ student.getWorkLike()+" Верность: "+student.getLoyalty()+" Честность: "+ student.getHonesty());
    }
    public void printStudentKogtevran(Kogtevran student) {
        System.out.println("Студент: "+ student.getName() + " Сила магии: "+student.getPowerMagic()+" Трансгрессировать: "+ student.getTransgressDistance()+" Ум: "+ student.getSmart()+" Мудрость: "+student.getWize()+" Остроумие: "+ student.getWitty()+ " Творчество: "+ student.getCreativity());
    }
    public void printStudentSlytherin(Slytherin student) {
        System.out.println("Студент: "+ student.getName() + " Сила магии: "+student.getPowerMagic()+" Трансгрессировать: "+ student.getTransgressDistance()+" Хитрость: "+ student.getTrick()+" Решительность: "+student.getDeremination()+" Амбициозность: "+ student.getAmbition()+" Находчивость: "+student.getResoursefulness()+" Жажда власти: "+ student.getLust());
    }
}
