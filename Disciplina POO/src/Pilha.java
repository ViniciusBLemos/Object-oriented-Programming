public class Pilha extends Lista{
//Coloca um novo elemento na pilha.
//Retorna 0 em caso de ERRO e 1 se ok.
	public int push(Nodo n) {
		return super.insert(0, n);
	}
//Retira um elemento da pilha.
//Retorna 0 em caso de ERRO e 1 se ok.
	public Nodo pop() {
		Nodo nodo_0 = super.get(0);
		if(super.delete(0) == 1) {
			return nodo_0;
		}
		return null;		
	}
}
