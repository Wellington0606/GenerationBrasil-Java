package HerançaPOO;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Cachorro Willy = new Cachorro("Willy",11 ," latidos","12Km por hora");
		Willy.imprimir();
		
		Cavalo Trovao = new Cavalo("Trovão",15,"relinchado","48Km por hora");
		Trovao.imprimir();
		
		Preguica Flecha = new Preguica("Flecha",25," uma icógnita","árvores");
		Flecha.imprimir();
		
	}

}
