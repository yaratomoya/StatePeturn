package statePeturn;

public class SakkiState implements State{
	@Override
	public void transition(Context context, String input){
		if("Hello".equals(input)){
			context.changeState(new ShitukoiState());
		}else if("Hi".equals(input)){
			context.changeState(new OhisaState());
		}
	}

	@Override
	public void say(){
		System.out.println("さっきもいった");
	}

}
