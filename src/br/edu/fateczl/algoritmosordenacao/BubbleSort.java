package br.edu.fateczl.algoritmosordenacao;

public class BubbleSort {
	public BubbleSort() {
		super();
	}

	public static void bubbleSort (int [] vetor) {
		int tamanho = vetor.length;
		for (int i= 1; i<tamanho; i++) {
			for (int j= 0; j<tamanho; j++) {
				if (vetor[j] > vetor [i]) {
					int aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
	}
}