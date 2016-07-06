
public interface ATMState {
	void insertCard();
	void ejectCard();
	void insertPin(int pintInserted);
	void requestCash(int cashRequested);
}
