package view;

import java.util.Arrays;

import br.edu.fateczl.algoritmosordenacao.BubbleSort;
import br.edu.fateczl.algoritmosordenacao.MergeSort;
import br.edu.fateczl.algoritmosordenacao.QuickSort;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int [] vetor= {80, 155, 244, 322, 75, 22, 13};
		int tamanho = vetor.length;
		
		
		System.out.println("Vetor Original: ");
		System.out.println(Arrays.toString(vetor));
		
		int opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das seguintes opções de ordenação: \n1- Bubblesort \n2- MergeSort \n3- QuickSort \n0- Sair "));
		switch (opc) {
			case 0:
				break;
			case 1:
				BubbleSort.bubbleSort(vetor);
				break;
			case 2:
				MergeSort.mergeSort(vetor, 0, tamanho - 1);
				break;
			case 3:
				QuickSort.quickSort(vetor, 0, tamanho -1);
				break;
			default:
				System.out.println("Opção inválida. Escolha uma opção de 0 a 3");
				opc = 999;
				break;
			}
		
		System.out.println("\nVetor Organizado: ");
		System.out.println(Arrays.toString(vetor));
	}
}
