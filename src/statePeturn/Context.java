package statePeturn;

public interface Context {
	//状態を変更する
	public abstract void changeState(State state);
}
