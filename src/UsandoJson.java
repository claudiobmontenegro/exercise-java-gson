
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.*;

public class UsandoJson {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();

		pessoa1.setNome("Cláudio");
		pessoa1.setCpf("418917412");
		pessoa1.setIdade(20);
		pessoa1.setRg("33113113");
		pessoa1.setTelefone("(51)5133-4141");

		Gson gson = new Gson();

		// converte objetos Java para JSON e retorna JSON como String
		/*
		 * String json = gson.toJson(pessoa1);
		 * 
		 * try { FileWriter writer = new
		 * FileWriter("DIRETÓRIO!!!!!"
		 * ); writer.write(json); writer.close();
		 * 
		 * } catch (IOException e) { e.printStackTrace(); }
		 * 
		 * System.out.println(json);
		 */

		// Converte arquivo Json para Objeto
		try {
			Pessoa pessoa2 = gson.fromJson(
					new FileReader("DIRETÓRIO!!!!"),
					Pessoa.class);
			System.out.println(pessoa2);
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
