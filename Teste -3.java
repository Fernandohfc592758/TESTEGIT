package Animal;

public class Cavalo {

	public static void main(String[] args) {
		
		Animal Cavalo = new Animal();
		
		Cavalo.getClass();
		Cavalo.setNome(" P� de pano");
		Cavalo.setIdade( 5 );
		
		{
			System.out.println(" Hiin in in ");
			System.out.println("O nome do cavalo �: " +Cavalo.getNome());
			System.out.println("A idade do cavalo �: " +Cavalo.getIdade());
			System.out.println("Este animal corre, corre, corre... !");
		}
		

	}

}
