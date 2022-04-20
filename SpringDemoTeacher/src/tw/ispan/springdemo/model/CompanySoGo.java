package tw.ispan.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CompanySoGo {
	
	@Autowired
	@Qualifier("creditCardGoGo")
	private CreditCard creditCard;

	public CompanySoGo() {
	}
	
	public void useCard(){
		creditCard.useCard("來 SOGO 刷卡送雨傘");
	}

}
