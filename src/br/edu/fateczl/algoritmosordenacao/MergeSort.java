package br.edu.fateczl.algoritmosordenacao;

public class MergeSort {
	public MergeSort() {
		super();
	}
//
	public static void mergeSort (int [] vetor, int esq, int dir) {
		if (esq < dir) {
			int meio = (esq + dir) / 2;
			
			//Ordenando a primeira e a última parte do vetor
			mergeSort(vetor, esq, meio);
			mergeSort(vetor, meio+1, dir);
			
			//Ordenando as duas metades
			merge(vetor, esq, meio, dir);
		}
	}
	
	private static void merge(int [] vetor, int esq, int meio, int dir) {
		int num1 = meio - esq+1;
		int num2 = dir - meio;
		
		int [] vetorEsq = new int [num1];
		int [] vetorDir = new int [num2];
		
		//Vetores temporários
		for (int i= 0; i<num1; i++) {
			vetorEsq[i] = vetor[esq + i];
		}
		for (int j= 0; j<num2; j++) {
			vetorDir[j] = vetor[meio + 1 + j];
		}
		
		//Índice inicial dos subvetores
		int i = 0, j = 0;
		
	    // Índice inicial do subvetor mesclado
        int aux = esq;
        while (i < num1 && j < num2) {
            if (vetorEsq[i] <= vetorDir[j]) {
                vetor[aux] = vetorEsq[i];
                i++;
            } else {
                vetor[aux] = vetorDir[j];
                j++;
            }
            aux++;
        }

        // Copia os elementos restantes de vetorEsq, se houver algum
        while (i < num1) {
            vetor[aux] = vetorEsq[i];
            i++;
            aux++;
        }

        // Copia os elementos restantes de vetorDir, se houver algum
        while (j < num2) {
            vetor[aux] = vetorDir[j];
            j++;
            aux++;
        }
    }
}

