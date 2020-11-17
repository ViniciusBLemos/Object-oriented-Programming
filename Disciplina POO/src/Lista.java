import java.util.ArrayList;
public class Lista {
	 ArrayList<Nodo>lista = new ArrayList<Nodo>();
//Insere um elemento na posicao apropriada
//Retorna 0 em caso de ERRO e 1 se ok.
	 public int insert(int posicao, Nodo n) {
		 this.lista.add(posicao, n);
		 if(this.lista.get(posicao).valor == n.valor) {
			 return 1;
		 }
		 return 0;
	 }
	 
//Retorna o Nodo para o elemento da lista.	 
	 public Nodo get(int posicao) {
		 return this.lista.get(posicao);
	 }
	 
//Deleta o elemento da posicao.
//Retorna 0 em caso de ERRO e 1 se ok.
	 public int delete(int posicao) {
		 if(this.lista.get(posicao) != null) {
			 this.lista.remove(posicao);
			 return 1;
		 }
		 return 0;
	 }
	 
//Retorna o tamanho da lista.	 
	 public int length() {
		 return this.lista.size();
	 }
}
