package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptador {
	@AroundInvoke
	public Object intercepta(InvocationContext context) throws Exception {

	    long millis = System.currentTimeMillis();

	    // chamada do método do dao
	    Object o = context.proceed();

	    System.out.println("Tempo gasto: " + (System.currentTimeMillis() - millis));
	    
	    String metodo = context.getMethod().getName();
	    String nomeClasse = context.getTarget().getClass().getSimpleName();
	    System.out.println(nomeClasse + ", " + metodo);
	    
	    return o;
	}
}
