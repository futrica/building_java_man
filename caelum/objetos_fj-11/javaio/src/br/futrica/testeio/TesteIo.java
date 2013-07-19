package br.futrica.testeio;

import java.io.*;


public class TesteIo {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		//InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		
		String linha = br.readLine();
		
		while(linha != null){
			System.out.println(linha);
			bw.write(linha); // copiando para outro arquivo 
			linha = br.readLine();
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}

}
