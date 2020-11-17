public class Fila extends Lista{
//Coloca um novo elemento na fila.
//Retorna 0 em caso de ERRO e 1 se ok.
	public int enqueue(Nodo n) {
		return super.insert(0, n);
	}
//Retira um elemento da fila.
//Retorna NULL em caso de erro e o Nodo se ok
	public Nodo dequeue() {
		int tamanhoLista = super.length();
		Nodo nodo_0 = super.get(tamanhoLista - 1);
		if(super.delete(tamanhoLista - 1) == 1) {
			return nodo_0;
		}
		return null;
	}
}
