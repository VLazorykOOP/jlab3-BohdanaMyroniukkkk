public class InterfaceNumberDemo {

    interface MyNumber {
        MyNumber add(MyNumber other);
        MyNumber subtract(MyNumber other);
        MyNumber multiply(MyNumber other);
        MyNumber divide(MyNumber other);
    }

    static class IntegerNumber implements MyNumber {
        private int value;

        public IntegerNumber(int value) {
            this.value = value;
        }

        @Override
        public MyNumber add(MyNumber other) {
            if (other instanceof IntegerNumber) {
                IntegerNumber o = (IntegerNumber) other;
                return new IntegerNumber(this.value + o.value);
            }
            return null;
        }

        @Override
        public MyNumber subtract(MyNumber other) {
            if (other instanceof IntegerNumber) {
                IntegerNumber o = (IntegerNumber) other;
                return new IntegerNumber(this.value - o.value);
            }
            return null;
        }

        @Override
        public MyNumber multiply(MyNumber other) {
            if (other instanceof IntegerNumber) {
                IntegerNumber o = (IntegerNumber) other;
                return new IntegerNumber(this.value * o.value);
            }
            return null;
        }

        @Override
        public MyNumber divide(MyNumber other) {
            if (other instanceof IntegerNumber) {
                IntegerNumber o = (IntegerNumber) other;
                if (o.value != 0) {
                    return new IntegerNumber(this.value / o.value);
                }
                System.out.println("Помилка: Ділення на нуль!");
                return null;
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
            if (!(obj instanceof IntegerNumber)) return false;
            IntegerNumber other = (IntegerNumber) obj;
            return this.value == other.value;
        }
    }

    static class RealNumber implements MyNumber {
        private double value;

        public RealNumber(double value) {
            this.value = value;
        }

        @Override
        public MyNumber add(MyNumber other) {
            if (other instanceof RealNumber) {
                RealNumber o = (RealNumber) other;
                return new RealNumber(this.value + o.value);
            }
            return null;
        }

        @Override
        public MyNumber subtract(MyNumber other) {
            if (other instanceof RealNumber) {
                RealNumber o = (RealNumber) other;
                return new RealNumber(this.value - o.value);
            }
            return null;
        }

        @Override
        public MyNumber multiply(MyNumber other) {
            if (other instanceof RealNumber) {
                RealNumber o = (RealNumber) other;
                return new RealNumber(this.value * o.value);
            }
            return null;
        }

        @Override
        public MyNumber divide(MyNumber other) {
            if (other instanceof RealNumber) {
                RealNumber o = (RealNumber) other;
                if (o.value != 0) {
                    return new RealNumber(this.value / o.value);
                }
                System.out.println("Помилка: Ділення на нуль!");
                return null;
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
            if (!(obj instanceof RealNumber)) return false;
            RealNumber other = (RealNumber) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Лабораторна робота 3 - Iнтерфейси та методи");

        MyNumber intNum1 = new IntegerNumber(10);
        MyNumber intNum2 = new IntegerNumber(20);

        MyNumber realNum1 = new RealNumber(5.5);
        MyNumber realNum2 = new RealNumber(2.2);

        System.out.println("Сума цiлих чисел: " + intNum1.add(intNum2));
        System.out.println("Рiзниця цiлих чисел: " + intNum1.subtract(intNum2));
        System.out.println("Добуток дiйсних чисел: " + realNum1.multiply(realNum2));
        System.out.println("Частка дiйсних чисел: " + realNum1.divide(realNum2));
        System.out.println("Цiле число 1: " + intNum1);
        System.out.println("Дiйсне число 1: " + realNum1);

        MyNumber intNum3 = new IntegerNumber(10);
        System.out.println("intNum1 дорівнює intNum3: " + intNum1.equals(intNum3));
    }
}
