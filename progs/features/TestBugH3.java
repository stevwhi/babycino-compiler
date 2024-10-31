class TestBugH3 {
    public static void main(String[] a) {
	System.out.println(new Test().f());
    }
}

class Test {

    public int f(){
	int i;
	i = 0;
	do {
		i = i + 1;
	} while(i < 5);
	
	return i;
    }

}