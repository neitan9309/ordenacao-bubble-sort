//Créditos para o dono do canal "Bro Code", que eu sempre recorro para procurar meus cursos (gratuitos) de programação.
//Link para o vídeo sobre estrutura de dados e algorítmos: https://youtu.be/CBYHwZcbD-s?si=NSHDQx0HUmC6M3XZ

package BubbleSort;

public class Main{
	
	public static void main(String args[]) {
		int array[] = {11, 4, 13, 24, 15, 1, 0, 7, 9, 5}; //Array desorganizado com 10 posições.
		
		bubbleSort(array); //Chamada do método Bubble Sort.
		
		for(int i : array) { //Impressão dos valores do array na tela do usuário.
			System.out.print(i + " ");
		}
	}

	public static void bubbleSort(int array[]) {
		
		for(int i = 0; i < array.length - 1; i++) { //Laço "for" que permite a reptição do laço de organização.
			for(int j = 0; j < array.length - i - 1; j++) { //Laço "for" que controla as mudanças de posição.
				if(array[j] > array [j + 1]) { //Condicional que compara o valor da posição atual com o da próxima (j + 1). Caso o valor da posição atual seja maior que o da próxima,
					int temp = array[j];	   //escrevemos o valor da posição atual na variável temp,
					array[j] = array[j + 1];   //atribuimos o valor da posição subsequente à atual,
					array[j + 1] = temp;	   //e reescrevemos o valor da posição subsequente com o valor presente na variável temp.
				}
			}
		}
	}
}
