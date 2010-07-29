class ciclofor {

	public static void main(String args[]) {

		for (int i = 1; i <= 10; i++) {
			String message = "Hola Mundo";

			if (i == 2) {
				System.out.println(i + "\t" + "Se alcanzó el limite superior");
			} else {
				System.out.println(i + "\t" + message);
			}
		}
	}
}
