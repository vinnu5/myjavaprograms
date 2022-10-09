package mypackage;

    class vinay {    // acess modifier
        int id;
        String surname;

        public void met() {
            System.out.println(id);
            System.out.println(surname);
        }

        public void met1() {
            int x = id + 2;
            System.out.println(x);
            System.out.println(surname.length());
        }
    }

    public class classcreate {

        public static void main(String[] args) {
       vinay su = new vinay();
            su.id = 345;
            su.surname = "rohith";
            su.met();
            su.met1();
        }
    }
