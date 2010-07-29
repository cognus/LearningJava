public class PhraseOMatic{
	public static void main(String[] args) {
		String[] ListaLang = {"Python", "Java", "Perl", "Ruby", "VB", "PHP"};
		String[] ListaAcc = {"Rules on", "Sucks at", "Works for", "Helps in"};
		String[] ListaSec = {"Web", "SysAdmin", "Enterprise", "Trash"};
		
		int sizeListaLang = ListaLang.length;
		int sizeListaAcc = ListaAcc.length;
		int sizeListaSec = ListaSec.length;
		
		int rand1 = (int) (Math.random() * sizeListaLang);
		int rand2 = (int) (Math.random() * sizeListaAcc);
		int rand3 = (int) (Math.random() * sizeListaSec);
		
		String frase = ListaLang[rand1] + " " + ListaAcc[rand2] + " " + ListaSec[rand3];
		
		System.out.println("I think: " + frase);
	}
}