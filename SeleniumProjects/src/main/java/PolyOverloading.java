public class PolyOverloading {

    public static void main(String[] args) {

        PolyOverloading overloading = new PolyOverloading();
        overloading.m1(10);


    }

        public void m1(int a){
            System.out.println(20);


        }
        public void m1(String a){
            System.out.println(a);

        }
        public void m1(int a , int b){
    }
        public void m1(String a , String b){

        }
}
