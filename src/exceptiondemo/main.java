package exceptiondemo;
class Test extends Exception {
int i=5/0;

    class Main {
        public void main(String[] args) {
            try {
                throw  new Test();
            } catch (Test e) {
                System.out.println("Test exception" + e);
            }finally {
                System.out.println("finally block");
            }
        }
    }
}
