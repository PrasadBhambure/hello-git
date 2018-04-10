
public class Scene extends MovieScene {

	public void talk(String girl, String boy){
		
		this.girl = girl;
		this.boy = boy;
		System.out.println(girl + " talks to "+boy);
	}
	public void go(String boy){
		
		this.boy = boy;
		System.out.println(girl + " goes to " +boy);
	}
	
	public void breath(String actor){

		System.out.println(actor + " takes a deep Breathe");
	}
	
	public void kiss(String boy){
		this.boy = boy;
		System.out.println(girl+ " kisses the boy");
	}
	
	public void comeIn(){
		
		System.out.println("As soon as they kiss " +oldwoman+" comes in");
		
	}
	
	public void goAway(String actor){
		
		System.out.println("Seeing this "+actor+ " goes away");
	}
	
	public void interact(String actor, String oldman){
		this.oldman = oldman;
		System.out.println(actor+ " goes to mad house because she interacts with "+ oldman+ " who is dead");
	}

}
