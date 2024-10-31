class TestBugH1 {
    public static void main(String[] a) {
	System.out.println(new Test().f());
    }
}

class Test {

    public int f(){
	int j;
	j = 5;
	do {
		j = j + 1;
	} while(j);
	return j;
    }

}