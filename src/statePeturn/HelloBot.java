package statePeturn;

public class HelloBot implements Context{
	private State currentState;

	public HelloBot(){
		this.currentState=new InitialState();
	}

	@Override
	public void changeState(State state){
		this.currentState=state;
	}

	public void say(String input){
		if("Hello".equals(input) || "Hi".equals(input)){
			currentState.transition(this, input);
			currentState.say();
		}else{
			System.out.println("なに?");
		}
	}
}
