package Lesson_7.Exercise_2;

public class Complex<T extends Number> {
    T real;

    T img;

    public T getReal() {
        return real;
    }

    public void setReal(T real) {
        this.real = real;
    }

    public T getImg() {
        return img;
    }

    public void setImg(T img) {
        this.img = img;
    }

    public Complex(){}
    public Complex(T real, T img) {
        this.real = real;
        this.img = img;
    }

    public Complex<T> add(Complex<T> input) {
        Complex<T> resComp = new Complex<>();
        if(input.getReal() instanceof Integer) {
            resComp.setReal((T)(Integer)(real.intValue() + input.getReal().intValue()));
            resComp.setImg((T)(Integer)(img.intValue() + input.getImg().intValue()));
        }
        else if(input.getReal() instanceof Float) {
            resComp.setReal((T)(Float)(real.floatValue() + input.getReal().floatValue()));
            resComp.setImg((T)(Float)(img.floatValue() + input.getImg().floatValue()));
        }
        else if(input.getReal() instanceof Double) {
            resComp.setReal((T)(Double)(real.doubleValue() + input.getReal().doubleValue()));
            resComp.setImg((T)(Double)(img.doubleValue() + input.getImg().doubleValue()));
        }

        return resComp;
    }
}
