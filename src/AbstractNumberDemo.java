abstract class Number {
    public abstract Number add(Number other);
    public abstract Number subtract(Number other);
    public abstract Number multiply(Number other);
    public abstract Number divide(Number other);
}

class IntegerNumber extends Number {
    private int value;

    public IntegerNumber(int value) {
        this.value = value;
    }

    @Override
    public IntegerNumber add(Number other) {
        if (other instanceof IntegerNumber) {
            IntegerNumber o = (IntegerNumber) other;
            return new IntegerNumber(this.value + o.value);
        }
        return null;
    }

    @Override
    public IntegerNumber subtract(Number other) {
        if (other instanceof IntegerNumber) {
            IntegerNumber o = (IntegerNumber) other;
            return new IntegerNumber(this.value - o.value);
        }
        return null;
    }

    @Override
    public IntegerNumber multiply(Number other) {
        if (other instanceof IntegerNumber) {
            IntegerNumber o = (IntegerNumber) other;
            return new IntegerNumber(this.value * o.value);
        }
        return null;
    }

    @Override
    public IntegerNumber divide(Number other) {
        if (other instanceof IntegerNumber) {
            IntegerNumber o = (IntegerNumber) other;
            if (o.value != 0) {
                return new IntegerNumber(this.value / o.value);
            }
            throw new ArithmeticException("Division by zero");
        }
        return null;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IntegerNumber that = (IntegerNumber) obj;
        return value == that.value;
    }
}

class RealNumber extends Number {
    private double value;

    public RealNumber(double value) {
        this.value = value;
    }

    @Override
    public RealNumber add(Number other) {
        if (other instanceof RealNumber) {
            RealNumber o = (RealNumber) other;
            return new RealNumber(this.value + o.value);
        }
        return null;
    }

    @Override
    public RealNumber subtract(Number other) {
        if (other instanceof RealNumber) {
            RealNumber o = (RealNumber) other;
            return new RealNumber(this.value - o.value);
        }
        return null;
    }

    @Override
    public RealNumber multiply(Number other) {
        if (other instanceof RealNumber) {
            RealNumber o = (RealNumber) other;
            return new RealNumber(this.value * o.value);
        }
        return null;
    }

    @Override
    public RealNumber divide(Number other) {
        if (other instanceof RealNumber) {
            RealNumber o = (RealNumber) other;
            if (o.value != 0) {
                return new RealNumber(this.value / o.value);
            }
            throw new ArithmeticException("Division by zero");
        }
        return null;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RealNumber that = (RealNumber) obj;
        return Double.compare(that.value, value) == 0;
    }
}

public class AbstractNumberDemo {
    public static void main(String[] args) {
        System.out.println("Lab 3 - Abstract Classes and Methods");

        Number intNum1 = new IntegerNumber(10);
        Number intNum2 = new IntegerNumber(20);

        Number realNum1 = new RealNumber(5.5);
        Number realNum2 = new RealNumber(2.2);

        System.out.println("Integer Add: " + intNum1.add(intNum2));
        System.out.println("Integer Subtract: " + intNum1.subtract(intNum2));

        System.out.println("Real Multiply: " + realNum1.multiply(realNum2));
        System.out.println("Real Divide: " + realNum1.divide(realNum2));

        System.out.println("Integer Equals: " + intNum1.equals(intNum2));
        System.out.println("Real Equals: " + realNum1.equals(realNum2));
    }
}
