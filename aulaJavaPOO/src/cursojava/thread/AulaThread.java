package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		new Thread() {
			
			public void run() {/*executa o que nós queremos*/
				
				/*CÓDIGO DA ROTINA QUE EXECUTARA EM PARALELO*/
		for (int pos = 0; pos < 10; pos++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}/*tempo determinado para executar a rotina*/
			
			/*executando esse envio com um tempo determinado*/
			System.out.println("Executando alguma rotina");
		}
		/*fim do paralelo*/
			};
			
			
		}.start();/*Start liga a thread que fica processando paralelamente*/
				
		
		
		
		
		/*ódigo do sistema do usuario continua o fluxo de trablaho*/
		System.out.println("CHEGOU AO FIM DO CÓDICO DE TESTE DE THREAD");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
		
		
	}

}
