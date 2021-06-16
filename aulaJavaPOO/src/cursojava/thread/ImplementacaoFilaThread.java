package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		System.out.println("Fila Rodando");

		
		while (true) {

			synchronized (pilha_fila) {/* bloquear o acesso a esta lista por outros processos */
				
			
				Iterator iteracao = pilha_fila.iterator();
				while (iteracao.hasNext()) { /* enquanto conter dados na lista ira processar */

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

					/* Processar 10 mil notas fiscais */
					/* gerar uma lista enorme de PDF */
					/* gerar um envio em massa de email */
					System.out.println("------------------------------------------------");

					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());
					
					System.out.println("------------------------------------------------");

					iteracao.remove();

					try {
						Thread.sleep(1000);/* dar um tempo para a descarga de memória */
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}

			}

			try {
				Thread.sleep(1000);/* processou toda a lista, da um tempo para a limpesa de memoria */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
