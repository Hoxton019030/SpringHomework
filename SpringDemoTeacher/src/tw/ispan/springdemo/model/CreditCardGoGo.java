package tw.ispan.springdemo.model;

import org.springframework.stereotype.Component;

@Component
public class CreditCardGoGo implements CreditCard {

	public CreditCardGoGo() {
	}

	@Override
	public void useCard(String messages) {
		System.out.println("GOGO Card: " + messages);

	}

}
