package classes;

public interface AutoLogin {
	void onDisconnected();

	void startAuto() throws InterruptedException;

	void doLoginServer();

	void doSelectCharactor();

	void onLoginSuccess();

	void waitFor(int seccond);

}
