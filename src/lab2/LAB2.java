package lab2;

public class LAB2 {

    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum();
        c1.setReal(2);
        c1.setImagin(1.5f);
        System.out.println(c1.toString());

        ComplexNum c2 = new ComplexNum(2, 1.5f);
        c2.add(c1);
        System.out.println(c2.toString());

        System.out.println(ComplexNum.getNoStance());
    }

}
