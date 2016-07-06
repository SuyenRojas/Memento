
public class ATMMachine {
	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;
	
	ATMState atmState;
	int cashInMachine = 2000;
	boolean correctPinEntered = false;
	
	public ATMMachine() {
		hasCard = new HasCard(this);
		noCard =  new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);
		
		atmState = noCard;
		if(cashInMachine <0){
			atmState = atmOutOfMoney;
		}
	}
	
	void setATMState(ATMState newState){
		atmState = newState;
	}
	
	void setCashInMachine(int newCash){
		cashInMachine = newCash;
	}
	
	void insertCard(){
		atmState.insertCard();
	}
	void ejectCard(){
		atmState.ejectCard();
	}
	void insertPin(int pinInserted){
		atmState.insertPin(pinInserted);
	}
	void requestCash(int cashRequested){
		atmState.requestCash(cashRequested);
	}
	
	public ATMState getYesCardState() { return hasCard; }
	public ATMState getNoCardState() { return noCard; }
	public ATMState getHasPin() { return hasCorrectPin; }
	public ATMState getNoCashState() { return atmOutOfMoney; }
}
