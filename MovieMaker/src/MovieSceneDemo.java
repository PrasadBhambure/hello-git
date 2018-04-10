import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MovieSceneDemo {
	
	public static void main(String args[]){  
		
        Date date = Calendar.getInstance().getTime();

        // Display a date in day, month, year format
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        String today = formatter.format(date);
                
		System.out.println("\nToday "+today+" the scene which includes every action is:-\n");
		
		MovieScene S = new Scene();
			
		S.breath(S.girl);
		S.go(S.boy);
		S.breath(S.girl);
		S.talk(S.girl,S.boy);
		S.breath(S.girl);
		S.kiss(S.boy);
		S.breath(S.boy);
		S.comeIn();
		S.goAway(S.oldwoman);
		S.interact(S.girl, S.oldman);
		
	}

}
