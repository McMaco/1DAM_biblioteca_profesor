package biblioteca_profesor;

public class test {
	
	static libro biblioteca[] = new libro[1000];
	
	public static void main(String[] args) {
		
		String datos[] = new String[8];
		
		datos[0] = "El principito";
		datos[1] = "";
		datos[2] = "Miguel Bustos";
		datos[3] = "";
		datos[4] = "Castilla";
		datos[5] = "300200100";
		datos[6] = "Infantil";
		datos[7] = "Español";
		
		int edit = 2004;
		
		biblioteca[0] = new libro(datos, edit);
		
		biblioteca[1] = new libro();
		
		biblioteca[1].setTitulo(datos[0]);
		
		libro.prestar("300200100", biblioteca);
		
		int f_prest[] = {19, 2, 2019};
		
		for(int i = 0; i < libro.numero; i++) {
			biblioteca[i].vencido("300200100", f_prest);
		}
	}
}
