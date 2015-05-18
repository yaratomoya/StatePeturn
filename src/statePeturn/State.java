package statePeturn;

public interface State {
	//状態を遷移する
	public abstract void transition(Context context, String input);

	//今の状態を返す
	public abstract void say();
}
