public class EstruturaDeDadosLineares {
	
	public static void main(String[] args) {
		Nodo nodo_0 = new Nodo(0);
		Nodo nodo_1 = new Nodo(1);
		Nodo nodo_2 = new Nodo(2);
		Nodo nodo_3 = new Nodo(3);
		Nodo nodo_4 = new Nodo(4);
		Nodo nodo_5 = new Nodo(5);
		Pilha pilha_0 = new Pilha();
		Fila fila_0 = new Fila();
		
//testes pilha:
		pilha_0.push(nodo_0);
		pilha_0.push(nodo_1);
		pilha_0.push(nodo_2);
		pilha_0.push(nodo_3);
		pilha_0.push(nodo_4);
		
		System.out.println("Valores Pilha:");
		
		Nodo nd = pilha_0.pop();
		System.out.println(nd.valor);
		
		Nodo nd_1 = pilha_0.pop();
		System.out.println(nd_1.valor);
		
		Nodo nd_2 = pilha_0.pop();
		System.out.println(nd_2.valor);
		
		Nodo nd_3 = pilha_0.pop();
		System.out.println(nd_3.valor);
		
		Nodo nd_4 = pilha_0.pop();
		System.out.println(nd_4.valor);

//testes fila:
		fila_0.enqueue(nodo_0);
		fila_0.enqueue(nodo_1);
		fila_0.enqueue(nodo_2);
		fila_0.enqueue(nodo_3);
		fila_0.enqueue(nodo_4);
		
		System.out.println("Valores Fila:");
		
		nd = fila_0.dequeue();
		System.out.println(nd.valor);
		
		nd_1 = fila_0.dequeue();
		System.out.println(nd_1.valor);
		
		nd_2 = fila_0.dequeue();
		System.out.println(nd_2.valor);
		
		nd_3 = fila_0.dequeue();
		System.out.println(nd_3.valor);
		
		nd_4 = fila_0.dequeue();
		System.out.println(nd_4.valor);
		
		
	}
}
