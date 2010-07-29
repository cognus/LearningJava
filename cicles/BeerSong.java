public class BeerSong {
	public static void main(String[] args) {
		int cheveNum = 5;
		String item = "botellas";

		while (cheveNum > 0) {

			if (cheveNum == 1) {
				item = "botella";
			}

			System.out.println(cheveNum + " " + item
					+ " de cerveza en la pared");
			System.out.println(cheveNum + " " + item + " de cerveza. ");
			System.out.println("Pasala carnal");
			cheveNum--;

			if (cheveNum > 0) {
				if (cheveNum == 1) {
					item = "botella";
				}

			}

			else {
				System.out.println("Se acabaron las botellas de cerveza");
			}
		}
	}
}