/*NAMA                      : Shelomita Marjan
  NIM                       : 13020210022*/

  interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0084 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0022 obj = new Central0022();
        obj.aaa();
        System.out.println("main");
    }
}