package br.com.java;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String path = "C:\\Users\\administrator\\Documents\\file.txt";
		ManipuladorArquivo.escritor(path);
		ManipuladorArquivo.leitor(path);
	}

}
