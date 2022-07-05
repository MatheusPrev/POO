package aula3;

public class Reproducao {
	int tempo;
	int velocidade = 1;
	
	void reproduzir(Acervo filme){
		System.out.println("Reproduzir filme " + filme.titulo);
		//ficar em um loop aqui lendo os botões
			tempo = tempo + velocidade;
		//quando sair do loop adicionar filme na lista de assistido
	}
	
	void avançar(){
		System.out.println("Avançar filme");
		velocidade = velocidade + 2;
	}
	
	void voltar(){
		System.out.println("Voltar filme");
		velocidade = velocidade - 2;
	}
	
	void pausar(){
		System.out.println("Pausar filme");
		velocidade = 0;
		//adicionar filme na lista de assistindo
	}
	
	void retomar(Acervo filme, int parada) {
		System.out.println("Retomar o fime "+filme.titulo);
		tempo = parada;
		reproduzir(filme);
	}
}
