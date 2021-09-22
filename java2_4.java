 class Singleton {

        private static Singleton s = null;
        public String st;

        private Singleton() {
            st = "singleton class.";
        }

        public static Singleton getInstance() {

            if (s == null)
                System.out.println("Object initialization");
            s = new Singleton();
            return s;
        }
    }

    class java2_4 {
        public static void main(String args[]) {
            Singleton s1 = Singleton.getInstance();
            Singleton s2 = Singleton.getInstance();

            System.out.println("String s1 = " + s1.st);
            System.out.println("String s2 =" + s2.st);
        }
    }
