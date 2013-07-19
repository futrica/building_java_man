
public class Teste {
	public static void main(String[] args) {
		AreaCalculavel qua = new Quadrado(2);
		AreaCalculavel ret = new Retangulo(2, 3);
		AreaCalculavel cir = new Circulo(10);
		
		System.out.println(qua.calculaArea());
		System.out.println(ret.calculaArea());
		System.out.println(cir.calculaArea());
	}
}
