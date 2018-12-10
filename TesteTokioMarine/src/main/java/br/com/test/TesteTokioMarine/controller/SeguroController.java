package br.com.test.TesteTokioMarine.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.test.TesteTokioMarine.bean.Seguro;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "seguros")
@Api(value = "API rest TesteTokioMarine")
@CrossOrigin(origins="*")
public class SeguroController {
	
	
	@Autowired private JmsTemplate jmsTemplate;
	
	@RequestMapping(value = "/enviarSeguro", method = RequestMethod.POST)
	@ApiOperation(value="Recebe a requisição e envia um JSON para a ActiveMQ")
	public void sendQueue(@RequestBody Seguro seguro) {

		System.out.println("wait");
		jmsTemplate.convertAndSend("fila.seguro", seguro.toString());
		
	    // TODO: call persistence layer to update
	}
}
