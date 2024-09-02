package br.edu.fateczl.algoritmosordenacao;

public class QuickSort {

	public QuickSort() {
		super();
	}
	
    public static void quickSort(int[] vetor, int menor, int maior) {
        if (menor < maior) {
            int div = divisao(vetor, menor, maior);

            // Ordena os elementos antes e depois da partição
            quickSort(vetor, menor, div - 1);
            quickSort(vetor, div + 1, maior);
        }
    }

    private static int divisao(int[] vetor, int menor, int maior) {
        int pivo = vetor[maior];
        int i = (menor - 1); // Índice do menor elemento

        for (int j = menor; j < maior; j++) {
            // Se o elemento atual é menor ou igual ao pivô
            if (vetor[j] <= pivo) {
                i++;

                // Troca vetor[i] e vetor[j]
                int aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
        }

        // Troca vetor[i + 1] e vetor[maior] (ou pivô)
        int aux = vetor[i + 1];
        vetor[i + 1] = vetor[maior];
        vetor[maior] = aux;

        return i + 1;
    }
}

