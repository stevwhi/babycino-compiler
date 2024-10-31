class equalityTypeError {
    public static void main(String[] a) {
	System.out.println(new Test().f());
    }
}

class Test {

    public boolean f(){
        boolean a;
        int b;

        a = true;
        b = 5;
        if (a == b) {
            System.out.println("This shouldn't print");
        }
        return a;
    }
}