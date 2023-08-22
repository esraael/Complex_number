package lab2;

public class ComplexNum {

    private float real;
    private float imagin;
    private static int instNo = 0;

    public ComplexNum() {
        instNo++;

    }

    public ComplexNum(float real, float imagin) {
        this.real = real;
        this.imagin = imagin;
        instNo++;

    }

    public ComplexNum(ComplexNum c) {
        this(c.real, c.imagin);
        instNo++;
    }

    public float getReal() {
        return real;
    }

    public float getImagin() {
        return imagin;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public void setImagin(float imagin) {
        this.imagin = imagin;
    }

    public ComplexNum add(ComplexNum c) {
        real += c.real;
        imagin += c.imagin;
        return this;
    }

    public ComplexNum sub(ComplexNum c) {
        real -= c.real;
        imagin -= c.imagin;
        return this;
    }

    public static int getNoStance() {
        return instNo;
    }

    @Override
    public String toString() {
        return "Complex{" + "real= " + real + ", imagin=" + imagin + '}';
    }

    public static ComplexNum add(ComplexNum c1, ComplexNum c2) {
        ComplexNum c3 = new ComplexNum(c1.real + c2.real, c1.imagin + c2.imagin);
        return c3;
    }

    public static ComplexNum sub(ComplexNum c1, ComplexNum c2) {
        ComplexNum c3 = new ComplexNum(c1.real - c2.real, c1.imagin - c2.imagin);
        return c3;
    }

}
