package Lesson_7.Exercise_2;

public class DoubleComplex implements ComplexInterface<Double>{

    Double real;
    Double img;

    public Double getReal() {
        return real;
    }

    public void setReal(Double real) {
        this.real = real;
    }

    public Double getImg() {
        return img;
    }


    public void setImg(Double img) {
        this.img = img;
    }
    public DoubleComplex(){}
    public DoubleComplex(Double x, Double y) {
        real = x;
        img = y;
    }
    @Override
    public ComplexInterface<Double> add(ComplexInterface<Double> inputComplex) {
        ComplexInterface<Double> resComplex = new DoubleComplex();
        resComplex.setReal((Double) getReal() + (Double) inputComplex.getReal());
        resComplex.setImg((Double) getImg() + (Double) inputComplex.getImg());
        return resComplex;
    }

    @Override
    public ComplexInterface<Double> sub(ComplexInterface<Double> inputComplex) {
        ComplexInterface<Double> resComplex = new DoubleComplex();
        resComplex.setReal((Double) getReal() - (Double) inputComplex.getReal());
        resComplex.setImg((Double) getImg() - (Double) inputComplex.getImg());
        return resComplex;
    }

    @Override
    public ComplexInterface<Double> multiply(ComplexInterface<Double> inputComplex) {
        ComplexInterface<Double> resComplex = new DoubleComplex();
        resComplex.setReal((Double) getReal() * (Double) inputComplex.getReal());
        resComplex.setImg((Double) getImg() * (Double) inputComplex.getImg());
        return resComplex;
    }

    @Override
    public ComplexInterface<Double> divide(ComplexInterface<Double> inputComplex) {
        if (inputComplex.getReal() == 0 || inputComplex.getImg() == 0) {
            return null;
        }
        ComplexInterface<Double> resComplex = new DoubleComplex();
        resComplex.setReal((Double) getReal() / (Double) inputComplex.getReal());
        resComplex.setImg((Double) getImg() / (Double) inputComplex.getImg());
        return resComplex;
    }

    @Override
    public void printComplex() {
        if (img < 0) {
            System.out.println(real + " - " + img*(-1) + "i");
        }
        else {
            System.out.println(real + " + " + img + "i");
        }
    }

}
