package br.com.caelum.timer;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton // um unico EJB
@Startup // � instanciado assim q deployado
public class Agendador {

	//Todo agendamento � persistido periodicamente, � 
	//obriga��o do container EJB recuperar um agendamento
	//caso o servidor tenha ca�do. Para desabilitar isso
	//usa-se persistent=false .
	//@Schedule faz executar, no caso, a cada 10 sec
	@Schedule(hour = "*", minute = "*", second = "*/10", persistent=false)
	void agendado() {
		System.out.println("Verificando servico externo periodicamente");
	}
}
