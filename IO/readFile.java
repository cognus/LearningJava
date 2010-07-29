class readFile {
	public static void main(String args[]) {
		try {
			readTheFile("hola");
			}
		catch(FileNotFoundException ex) {
			System.out.println("There is no file");
		}
	}
}