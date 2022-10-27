package Aula;

public class testaimpresoo {
	public static void main(String[] args) {
		Impressora imp[] = new Impressora[3];
		imp[0] = new Laser();
		imp[1] = new JatodeTinta();
		imp[2] = new Matricial();
		
		for(int i = imp.length -1; i >=0; i--) {
			imp[i].imprimir();
		}
		
	}
}
