package mirea.lab.lab3;

class DogTest{
    public static void main(String[] args) {

        Bigl first =new Bigl(10,12,"Brown","SobakaOne");
        Akita second =new Akita(40,20,"White","SobakaTwo");
        System.out.println("Poroda first dog"+first);
        first.Info();
        System.out.println("Poroda first dog"+second);

        second.Info();

    }
}
